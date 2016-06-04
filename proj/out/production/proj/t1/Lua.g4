/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="551805 e 551945";
}

// Regra inicial para execução dos testes.
programa
    : trecho
    ;

// Definição de um comando para a linguaguem Lua.
comando
    : ';'
    | listavar '=' listaexp
    | chamadadefuncao
    | 'do' bloco 'end'
    | 'while' exp 'do' bloco 'end'
    | 'repeat' bloco 'until' exp
    | 'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end'
    | 'for' NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); } '=' exp ',' exp (',' exp)? 'do' bloco 'end'
    | 'for' listadenomes 'in' listaexp 'do' bloco 'end'
    | 'funcion' nomedafuncao { TabelaDeSimbolos.adicionarSimbolo($nomedafuncao.text,Tipo.FUNCAO); } corpodafuncao
    | 'local' ('function' NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.FUNCAO); } corpodafuncao)
    | 'local' listadenomes ('=' listaexp)?
    ;

// Comandos de retorno.
retbreak
    : 'return' listaexp? ';'?
    | 'break' ';'?
    ;

// Sequência de comandos.
trecho
    : (comando ';'?)* (retbreak)?
    ;

bloco
    : trecho
    ;

// Representa o nome de uma função em Lua.
nomedafuncao
    : NOME ('.' NOME)* (':' NOME)?
    ;

// Lista de nomes, podendo conter um ou mais nomes.
// Representa a lista de nomes separadas por vírgulas.
listadenomes
    : NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); } (',' NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); })*
    ;

// Definição de expressões aritméticas
exp
    : 'nil' | 'false' | 'true' | numero | cadeia
    | '...'
    | funcao
    | expprefixo
    | <assoc=right> exp opPotencia exp
    | opUnario exp
    | exp opMulDivMod exp
    | exp opSomaSub exp
    | <assoc=right> exp opConcat exp
    | exp opComparacao exp
    | exp opLogicoE exp
    | exp opLogicoOu exp
    ;

// Lista de expressões lógicas ou matemáticas, podendo conter uma ou mais expressões.
// Representa a lista de expressões separadas por vírgulas.
listaexp
    : exp (',' exp)*
    ;

// Lista de variáveis, podendo conter uma ou mais variáveis.
// Representa a lista de variáveis separadas por vírgulas.
listavar
    : var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); } (',' var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); })*
    ;

// A regra "expprefixo" como apresentada no manual da linguaguem foi alterada pois
// apresentava recursão indireta à esquerda, o que não é suportado pelo ANTLR
expprefixo
    :  var
    | chamadadefuncao
    | '(' exp ')'
    ;

// Impede a recursão indireta à esquerda.
complementovar
    : NOME ('[' exp ']' | '.' NOME)*
    ;

// Definição de como é identificada uma variável.
var
    : NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); }
    | complementovar '[' exp ']'
    | complementovar '.' NOME
    ;

// Define como é reconhecida a chamada à uma função.
chamadadefuncao
    : complementovar (argumentos | (':'NOME argumentos)) { TabelaDeSimbolos.adicionarSimbolo($complementovar.text,Tipo.FUNCAO); }
    ;

// Argumentos para a chamada de uma função.
argumentos
    : '(' listaexp? ')'
    | construtordetabelas
    | cadeia
    ;

// Representa a definição de uma função.
funcao
    : 'function' corpodafuncao
    ;

// Representa o corpo de uma função, constituída de:
// parâmetros entre parênteses (opcional); bloco de comandos e a palavra-chave "end" que delimita o escopo.
corpodafuncao
    : '(' listadeparametros? ')' bloco 'end' ';'?
    ;

// Lista de parâmetros de uma função sendo definida.
listadeparametros
    : listadenomes (',' '...')?
    | '...'
    ;

// Uma tabela no modelo {campo1, campo2, campo3}.
construtordetabelas
    : '{' listadecampos '}'
    ;

// Lista de campos dentro de uma tabela.
listadecampos
    : campo (separadordecampos campo)* separadordecampos?
    ;

// O campo de uma tabela propriamente dito.
campo
    : '[' exp ']' '=' exp
    | NOME '=' exp
    | exp
    ;

// Separador entre campos de uma tabela.
separadordecampos
    : ',' | ';'
    ;


/*
 * OPERADORES LÓGICO-MATEMÁTICOS
 */

// "Ou" lógico
opLogicoOu
    : 'or'
    ;

// "E" lógico
opLogicoE
    : 'and'
    ;

// Comparação
opComparacao
    : '<' | '>' | '<=' | '>=' | '~=' | '=='
    ;

// Concatenação de cadeias
opConcat
    : '..'
    ;

// Soma e Subtração matemática
opSomaSub
    : '+' | '-'
    ;

// Multiplicação, Divisão e Módulo matemático
opMulDivMod
    : '*' | '/' | '%'
    ;

// Operações unárias
opUnario
    : 'not'     /* negação lógica*/
    | '#'       /* tamanho */
    | '-'       /* negação matemática */
    | '~'       /* negação bit-a-bit */
    ;

// Potência matemática
opPotencia
    : '^'
    ;


/*
 * TIPOS DE DADOS
 */

// números
numero
    : INTEGER
    | FLOAT
    ;

// strings
cadeia
    : CADEIA_NORMAL
    | CADEIA_CHAR
    ;

/**********************************
        ANALISADOR  LÉXICO
 *********************************/

// Nomes podem ser qualquer cadeia de letras, dígitos e underlines que não comecem com um dígito
NOME
    : (Caracter | '_') (Caracter | Digito | '_')*
    ;

// Cadeias de caracteres literais podem ser delimitadas por meio do uso de aspas simples ou aspas duplas
CADEIA_NORMAL
    : '"' (~('\\'|'"'))* '"'
    ;

CADEIA_CHAR
    : '\'' (~('\\'|'"'))* '\''
    ;

// Números inteiros
INTEGER
    : Digito+
    ;

// Números de ponto flutuante
FLOAT
    : Digito+ '.' Digito*
    | '.' Digito+
    ;

// Digito numérico que só deve ser reconhecido se fizer parte de INTEGER ou FLOAT
fragment
Digito
    : '0'..'9'
    ;

fragment
Caracter
    : 'a'..'z'
    | 'A'..'Z'
    ;

COMENTARIO
	: '--' ~('\n' | '\r')* '\r'? '\n'
	-> skip
	;
WS
    : (' ' | '\t' | '\r' | '\n')
    -> skip
    ;

// Caracteres que serão ignorados
IGNORADOS
    : (('--' (~('\n'|'\r'))* ('\r')? '\n')
    | (' ' | '\t' | '\r' | '\n' ))
    -> skip
    ;