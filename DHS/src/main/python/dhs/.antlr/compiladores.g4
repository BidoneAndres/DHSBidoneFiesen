grammar compiladores ;

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

//INST : (LETRA | DIGITO  | [- ,;{}()+=>] )+ '\n'; es una letra, un digito .. no quiero que exceda el guion 
PA: '(';
PC: ')';
LLA: '{';
LLC: '}';
PYC: ';';
COM : ',';


WHILE :'while';
NUMERO : DIGITO+ ;
FOR : 'for';
IF: 'if';


INT:'int';
DOUBLE : 'double';
CHAR : 'char'; 
FLOAT : 'float'; 
STRING : 'String';
BOOLEAN : 'boolean';
VOID : 'void';



SUMA : '+' ;
RESTA : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;
ASIG : '=';
EQQ: '==';
NE: '!=';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';



WS : [ \t\n\r] -> skip;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
ORR : '||';
AND : '&&';
NOT : '!';
OTRO : . ;



s : ID     {print("ID ->" + $ID.text + "<--") }         s
  | NUMERO {print("NUMERO ->" + $NUMERO.text + "<--") } s
  | OTRO   {print("Otro ->" + $OTRO.text + "<--") }     s
  | EOF
  ;

//si : s EOF; que comience en un nodo, que sea solo la razi del arbol
//s: PA s PC s  s permite la anidacion, se cierra un parentesis y se puede abrirotro parentesis. Verifica balance de parentesis


programa : instrucciones EOF ; //secuencia de instrucciones hasta el final del archivo

instrucciones : instruccion instrucciones //es una instruccion con mas instrucciones 
                |
                ;
instruccion:  init
            | iwhile
            | bloque
            | asignacion
            ;
operador: EQQ | NE | GT | LT | GE | LE;



iwhile : WHILE PA ID PC instruccion ;//llave representa una instruccion compuesta, despues del while viene siempre una instruccion

bloque : LLA instrucciones LLC; 

//Aca vamos a declarar las operaciones aritmeticas y logicas
//------------------------------------
opal : exp ; //completar para nosotros

exp : term e;



e : SUMA term e
    |RESTA term e
    ;

term : factor t ;


t : MULT factor t
    |DIV factor t 
    |MOD factor t 
    |
    ;

factor : NUMERO
       | ID
       | PA exp PC
      ;
//--------------------------------------
ifor : 	FOR PA asignacion PYC oplo PYC asignacion PC instrucciones;

oplo: expresion_logica;


expresion_logica: ORR termino_logico expresion_logica |;

termino_logico: factor_logico term_logico;

term_logico: AND factor_logico term_logico |;

factor_logico: oplo | comp | (PA expresion_logica PC);

comp: oplo operador oplo | comp operador comp;

//Usamos para inicializar la variable esta parte 
//---------------------------
init : TIP ID PYC;

TIP : INT //Aca declaro los tipos posibles de las variables, no estoy seguro si el string hace falta, y despues le tengo que preguntar al profe
    | DOUBLE //si tambien entra los double int y los double float
    | FLOAT 
    | BOOLEAN
    | CHAR
    | STRING 
    ; 

//----------------------------

//Usamos esta parte para la asignacion de un valor, tenemos en cuenta que este valor no solo puede ser ingresado de 
//manera numerica, si no que tambien por una funcion aritmetica y logica o por otra variable
//----------------------------

asignacion : ID ASIG opal PYC; 
//----------------------------

cond : term condicionales
      (term | )
      ;

condicionales : '=='
              | '<'
              | '>'
              | '<='
              | '>='
              ;


iter : ID exp;

//Esta va a ser la parte donde estan las funciones, tanto los prototipos como las funciones en si....
//------------------------------------

proto : (TIP | VOID) PA var_func PC PYC; //Esta es la parte del prototipo, lo que vamos a hacer es encadenar con comas en var func

func : (TIP | VOID) PA var_func PC bloque; //Y bueno esto es practicamente lo mismo, nada mas que termina con los bloques

var_func : init var_func
           |init COM var_func
           |
           ;


