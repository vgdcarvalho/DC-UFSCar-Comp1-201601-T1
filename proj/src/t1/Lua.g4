/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="551805 e 551945";
}

// Regra inicial para execução dos testes
programa
    : trecho
    ;

// Trecho de código
trecho
    : bloco EOF
    ;

// Bloco de código
bloco
    : (comando ';'?)* (retbreak)?
    ;

// Comandos possíveis da linguaguem
comando
    : listavar '=' listaexp
    | chamadadefuncao
    | 'do' bloco 'end'
    | 'while' exp 'do' bloco 'end'
    | 'repeat' bloco 'until' exp
    | 'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end'
    | 'for' NOME '=' exp ',' exp (',' exp)? 'do' bloco 'end'
    | 'for' listadenomes 'in' listaexp 'do' bloco 'end'
    | 'funcion' nomedafuncao corpodafuncao
    | 'local' 'function' NOME corpodafuncao
    | 'local' listadenomes ('=' listaexp)?
    ;

// Comandos de retorno
retbreak
    : 'return' listaexp? ';'?
    | 'break' ';'?
    ;

// Nome de função
nomedafuncao
    : NOME ('.' NOME)* (':' NOME)?
    ;

// Lista de variáveis, podendo conter uma ou mais variáveis
listavar
    : var (',' var)*
    ;

// Lista de nomes, podendo conter um ou mais nomes
listadenomes
    : NOME (',' NOME)*
    ;

// Lista de expressões lógicas ou matemáticas, podendo conter uma ou mais expressões
listaexp
    : exp (',' exp)*
    ;

// Variáveis
var
    : (NOME | '(' exp ')' varSufixo) varSufixo*
    ;

// Expressões lógicas ou matemáticas
exp
    : 'nil' | 'false' | 'true' | numero | cadeia
    | '...'
    | funcao
    | expPrefixo
    | <assoc=right> exp opPotencia exp
    | opUnario exp
    | exp opMulDivMod exp
    | exp opSomaSub exp
    | <assoc=right> exp opConcat exp
    | exp opComparacao exp
    | exp opLogicoE exp
    | exp opLogicoOu exp
    ;


//
varSufixo
    : nomeArgumento* ('[' exp ']' | '.' NOME)
    ;

//
expPrefixo
    : varOuExp nomeArgumento*
    ;

//
chamadadefuncao
    : varOuExp nomeArgumento+
    ;

// Uma variável ou expressão lógica ou matemática
varOuExp
    : var | '(' exp ')'
    ;

//
nomeArgumento
    : (':' NOME)? argumentos
    ;

// Argumentos para a chamada de uma função
argumentos
    : '(' listaexp? ')' | tabela | cadeia
    ;

// Definição de funções
funcao
    : 'function' corpodafuncao
    ;

// O corpo da função
corpodafuncao
    : '(' listadeparametros ')' bloco 'end'
    ;

// Lista de parâmetros de uma função sendo definida
listadeparametros
    : listadenomes (',' '...')?
    | '...'
    ;

// Uma tabela no modelo {campo1, campo2, campo3}
tabela
    : '{' listadecampos '}'
    ;

// Lista de campos dentro de uma tabela
listadecampos
    : campo (separadordecampos campo)* separadordecampos?
    ;

// O campo de uma tabela
campo
    : '[' exp ']' '=' exp
    | NOME '=' exp
    | exp
    ;

// Separador entre campos de uma tabela
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

numero
    : INTEGER
    | FLOAT
    ;

cadeia
    : CADEIA_NORMAL
    | CADEIA_CHAR
    ;


/*
 *  LÉXICO
 */

// Nomes não podem começar com números e não podem conter caracteres especiais (além do underline '_')
NOME
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

// Cadeias simples
CADEIA_NORMAL
    : '"' (~('\\'|'"'))* '"'
    ;

// Cadeia de chars
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
    : [0-9]
    ;



