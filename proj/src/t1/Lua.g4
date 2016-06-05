grammar Lua;

@members {
   public static String grupo="<<551805, 551945>>";
}

/**********************************************
    LEXER
    Definição dos lexemas da linguagem Lua.
 **********************************************/

// Nomes podem ser qualquer cadeia de letras, dígitos e underlines que não comecem com um dígito.
NOME
    : (Caracter | '_') (Caracter | Digito | '_')*
    ;

// Letras
fragment
Caracter
    : 'a'..'z'
    | 'A'..'Z'
    ;

// Cadeias de caracteres literais podem ser delimitadas por meio do uso de aspas simples ou aspas duplas.
CADEIA_NORMAL
    : '"' (~('\\'|'"'))* '"'
    ;

CADEIA_CHAR
    : '\'' (~('\\'|'"'))* '\''
    ;

// Números
NUMERO
    : Digito* '.'? Digito+ (Expoente Sinal? Digito+)?   /* número decimal */
    | '0' ('x' | 'X') (Digito | DigitoHexadecimal)*     /* número hexadecimal */
    ;

// Digito Decimal
fragment
Digito
    : '0'..'9'
    ;

// Digito Hexadecimal
fragment
DigitoHexadecimal
    : 'a'..'f'
    | 'A'..'F'
    ;

// Sinal
fragment
Sinal
    : '+'
    | '-'
    ;

// Expoente de um número decimal
fragment
Expoente
    : 'e'
    | 'E'
    ;

// Comentarios e espaços em branco devem ser ignorados.
COMENTARIO
	: '--' ~('\n' | '\r')* '\r'? '\n'
	-> skip
	;

WS
    : (' ' | '\t' | '\r' | '\n')
    -> skip
    ;

// Palavras reservadas pela linguagem.
PalavraReservada
    : 'and'
    | 'end'
    | 'in'
    | 'break'
    | 'false'
    | 'local'
    | 'do'
    | 'for'
    | 'nil'
    | 'else'
    | 'function'
    | 'not'
    | 'elseif'
    | 'if'
    | 'or'
    | 'repeat'
    | 'return'
    | 'then'
    | 'true'
    | 'until'
    | 'while'
    ;

// Listagem dos operadores binários da linguagem.
operadorPotencia
    : '^'       /* potência */
    ;

operadorSomaSub
    : '+'       /* adição */
    | '-'       /* subtração */
    ;

operadorE
    : 'and'     /* "E" lógico */
    ;

operadorOu
    : 'or'      /* "Ou" lógico */
    ;

operadorRelacional
    : '<'       /* menor que */
    | '>'       /* maior que */
    | '<='      /* menor ou igual a */
    | '>='      /* maior ou igual a */
    | '=='      /* igual a */
    | '~='      /* diferente de */
    ;

operadorAtribuicao
    : '='       /* atribuição */
    ;

operadorStrcat
    : '..'      /* concatenação de cadeias */
    ;

operadorMulDivMod
    : '*'       /* multiplicação */
    | '/'       /* divisão */
    | '%'       /* resto de divisão */
    ;

// Listagem dos operadores unários da linguagem.
operadorUnario
    : 'not'     /* negação lógica*/
    | '#'       /* tamanho */
    | '-'       /* negação matemática */
    | '~'       /* negação bit-a-bit */
    ;

// Listagem dos operadores não aritméticos
operadorExtra
    : '...'
    | '.'
    | ','
    | '['
    | ']'
    | '('
    | ')'
    | '{'
    | '}'
    | ':'
    | ';'
    ;

/**********************************
              PARSER
 *********************************/

// Regra inicial para execução dos testes.
programa
    : trecho
    ;

// Definição de um comando para a linguaguem Lua.
comando
    : listavar operadorAtribuicao listaexp
    | chamadadefuncao
    | 'do' bloco 'end'
    | 'while' exp 'do' bloco 'end'
    | 'repeat' bloco 'until' exp
    | 'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end'
    | 'for' NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); } operadorAtribuicao exp ',' exp (',' exp)? 'do' bloco 'end'
    | 'for' listadenomes 'in' listaexp 'do' bloco 'end'
    | 'function' nomedafuncao { TabelaDeSimbolos.adicionarSimbolo($nomedafuncao.text,Tipo.FUNCAO); } corpodafuncao
    | 'local' ('function' NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.FUNCAO); } corpodafuncao)
    | 'local' listadenomes (operadorAtribuicao listaexp)?
    ;

// Comandos de retorno.
retbreak
    : 'return' listaexp?
    | 'break'
    ;

// Sequência de comandos.
trecho
    : (comando ';'?)* (retbreak ';'?)?
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

// Definição de expressões aritméticas com tratamento de precedência de operadores
exp0
    : 'nil' | 'false' | 'true' | NUMERO | cadeia
    | '...'
    | funcao
    | expprefixo
    | construtordetabelas
    ;

exp
    : exp1 (operadorOu exp1)*
    ;

exp1
    : exp2 (operadorE exp2)*
    ;

exp2
    : exp3 (operadorRelacional exp3)*
    ;

exp3
    : exp4 (operadorStrcat exp4)*
    ;

exp4
    : exp5 (operadorSomaSub exp5)*
    ;

exp5
    : exp6 (operadorMulDivMod exp6)*
    ;

exp6
    : (operadorUnario | operadorSomaSub)* exp7
    ;

exp7
    : exp0 (operadorPotencia exp0)*
    ;

// Lista de expressões lógicas ou matemáticas, podendo conter uma ou mais expressões.
// Representa a lista de expressões separadas por vírgulas.
listaexp
    : (exp ',')* exp
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
    : complementovar (argumentos | (':' NOME argumentos)) { TabelaDeSimbolos.adicionarSimbolo($complementovar.text,Tipo.FUNCAO); }
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
    : '(' listadeparametros? ')' bloco 'end'
    ;

// Lista de parâmetros de uma função sendo definida.
listadeparametros
    : listadenomes (',' '...')?
    | '...'
    ;

// Uma tabela no modelo {campo1, campo2, campo3}.
construtordetabelas
    : '{' listadecampos? '}'
    ;

// Lista de campos dentro de uma tabela.
listadecampos
    : campo (separadordecampos campo)* separadordecampos?
    ;

// O campo de uma tabela propriamente dito.
campo
    : '[' exp ']' operadorAtribuicao exp
    | NOME operadorAtribuicao exp
    | exp
    ;

// Separador entre campos de uma tabela.
separadordecampos
    : ',' | ';'
    ;

// strings
cadeia
    : CADEIA_NORMAL
    | CADEIA_CHAR
    ;