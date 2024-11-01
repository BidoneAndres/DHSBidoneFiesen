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
instruccion:  init PYC
            | iwhile
            | bloque
            | asignacion
            | proto PYC
            | func
            | if
            | return PYC
            ;
operador: EQQ | NE | GT | LT | GE | LE;



iwhile : WHILE PA ID PC bloque ;//llave representa una instruccion compuesta, despues del while viene siempre una instruccion

//Aca vamos a declarar los if, lo que tenemos en cuenta es que nosotros no podemos definir un else sin tener un if
//-------------------------------------------------
if : IF PA PC bloque  else; 
//Lo que tenemos en cuenta aca es que nosotros podemos anidar, pero solamente puede existir un else por cada if, pero else if los que queramos
else : ELSE bloque
    | ELSE if
    | 
    ;

//-------------------------------------------------

bloque : LLA instrucciones LLC; 

//Aca vamos a declarar las operaciones aritmeticas y logicas
//------------------------------------

opal: expl;

expl: ORR termlogic expl 
    |;

termlogic: factorlogico tlogic;

tlogic: AND factorlogico tlogic 
    |;

factorlogico: opal 
    | comp 
    | (PA expl PC);

comp: opal operador opal | comp operador comp;

e : SUMA term e
    |RESTA term e
    |
    ;

term : factor t ;


t : MULT factor t
    |DIV factor t 
    |MOD factor t 
    |
    ;

factor : NUMERO
       | ID
       | PA e PC
      ;
ifor : 	FOR PA asignacion PYC opal PYC asignacion PC instrucciones;


//Usamos para inicializar la variable esta parte 
//---------------------------
init : (INT //Aca declaro los tipos posibles de las variables, no estoy seguro si el string hace falta, y despues le tengo que preguntar al profe
    | DOUBLE //si tambien entra los double int y los double float
    | FLOAT 
    | BOOLEAN
    | CHAR) ID;

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


iter : ID e;

//Esta va a ser la parte donde estan las funciones, tanto los prototipos como las funciones en si....
//------------------------------------

//proto : (TIP | VOID) PA (var_func|) PC PYC; //Esta es la parte del prototipo, lo que vamos a hacer es encadenar con comas en var func
proto : (INT //Aca declaro los tipos posibles de las variables, no estoy seguro si el string hace falta, y despues le tengo que preguntar al profe
    | DOUBLE //si tambien entra los double int y los double float
    | FLOAT 
    | BOOLEAN
    | CHAR | VOID) ID PA (var_func|) PC;
//func : (TIP | VOID) PA (var_func|) PC bloque; //Y bueno esto es practicamente lo mismo, nada mas que termina con los bloques

func: proto ID  bloque;

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

return : RETURN opal;