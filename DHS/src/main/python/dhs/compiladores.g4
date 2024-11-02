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
ELSE : 'else';
RETURN : 'return';

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

INCR : '++';
DECR : '--';


WS : [ \t\n\r] -> skip;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

OR : '||';
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
instruccion:  init PYC
            | iwhile
            | bloque
            | ifor
            | asignacion PYC
            | proto PYC
            | func
            | if
            | opal PYC
            | return PYC
            | callFunc PYC
            ;
operador: EQQ | NE | GT | LT | GE | LE | OR | AND | NOT | OTRO ;



iwhile : WHILE PA ID PC bloque ;//llave representa una instruccion compuesta, despues del while viene siempre una instruccion

//Aca vamos a declarar los if, lo que tenemos en cuenta es que nosotros no podemos definir un else sin tener un if
//-------------------------------------------------
if: IF PA explogic PC bloque |IF PA explogic PC bloque ELSE bloque;
//Lo que tenemos en cuenta aca es que nosotros podemos anidar, pero solamente puede existir un else por cada if, pero else if los que queramos
else : ELSE bloque
    | ELSE if
    | 
    ;

//-------------------------------------------------

bloque : LLA instrucciones LLC; 

//Aca vamos a declarar las operaciones aritmeticas y logicas
//------------------------------------
opal: explogic;

explogic: expArit| expArit OR expArit|expArit AND expArit;

expArit: termino operador termino | termino;

termino: factor op factor | factor;

factor: ID | NUMERO | PA expArit PC;

op: SUMA | RESTA | MULT | DIV | MOD; 

ifor: FOR PA asignacion PYC explogic PYC asignacion PC bloque;



//Usamos para inicializar la variable esta parte 
//---------------------------
init : (INT //Aca declaro los tipos posibles de las variables, no estoy seguro si el string hace falta, y despues le tengo que preguntar al profe
    | DOUBLE //si tambien entra los double int y los double float
    | FLOAT 
    | BOOLEAN
    | CHAR) ID;


var : ID | ID COM ID;


//Esto lo que nos va a permitir es que podamos inicializar las variables que queramos, asi como asignarles el valor de inmediato

/*TIP : INT Preguntar al profe porque no anda si lo pongo con tip, me parece raro que de esta forma no se pueda y de esta si
    | DOUBL
    | FLOAT 
    | BOOLEAN
    | CHAR
    ; 
*/
//----------------------------

//Usamos esta parte para la asignacion de un valor, tenemos en cuenta que este valor no solo puede ser ingresado de 
//manera numerica, si no que tambien por una funcion aritmetica y logica o por otra variable
//----------------------------
asignacion : ID ASIG opal; 
//----------------------------

cond : termino operador| termino|
      ;

iter : ID explogic;

//Esta va a ser la parte donde estan las funciones, tanto los prototipos como las funciones en si....
//------------------------------------

//proto : (TIP | VOID) PA (var_func|) PC PYC; //Esta es la parte del prototipo, lo que vamos a hacer es encadenar con comas en var func
proto : (INT //Aca declaro los tipos posibles de las variables, no estoy seguro si el string hace falta, y despues le tengo que preguntar al profe
    | DOUBLE //si tambien entra los double int y los double float
    | FLOAT 
    | BOOLEAN
    | CHAR | VOID) ID PA (var_func|) PC;
//func : (TIP | VOID) PA (var_func|) PC bloque; //Y bueno esto es practicamente lo mismo, nada mas que termina con los bloques

//si lo hago de la forma func: proto bloque; no anda, no se porque 

func: (INT //Aca declaro los tipos posibles de las variables, no estoy seguro si el string hace falta, y despues le tengo que preguntar al profe
    | DOUBLE //si tambien entra los double int y los double float
    | FLOAT 
    | BOOLEAN
    | CHAR | VOID) ID PA (var_func|) PC bloque;

var_func : (INT //Aca declaro los tipos posibles de las variables, no estoy seguro si el string hace falta, y despues le tengo que preguntar al profe
        | DOUBLE //si tambien entra los double int y los double float
        | FLOAT 
        | BOOLEAN
        | CHAR) ID (COM (INT //Aca declaro los tipos posibles de las variables, no estoy seguro si el string hace falta, y despues le tengo que preguntar al profe
                        | DOUBLE //si tambien entra los double int y los double float
                        | FLOAT 
                        | BOOLEAN
                        | CHAR) ID)*
                        ;


callFunc : ID PA (var|) PC; //Este lo vamos a usar para la llamada a funciones....

incremento : ID INCR
           | INCR ID ;
decremento : ID DECR 
           | DECR ID;

return : RETURN opal;