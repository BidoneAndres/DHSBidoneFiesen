
grammar compiladores ;

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

//INST : (LETRA | DIGITO  | [- ,;{}()+=>] )+ '\n'; es una letra, un digito .. no quiero que exceda el guion 
PA: '(' ;
PC: ')' ;
LLA: '{';
LLC: '}';
PYC: ';';
WHILE :'while';
IF : 'if';
NUMERO : DIGITO+ ;
ASIG : '=' ;
INT:'int';
FOR : 'for' ;
SUMA : '+' ;
RESTA : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;
NOMBRE : LETRA+;


WS : [ \t\n\r] -> skip;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
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
instruccion: declaracion
            | iwhile
            | bloque
            | asignacion
            ;

asignacion : ID ASIG opal PYC;

declaracion: INT ID PYC ;

iwhile : WHILE PA ID PC instruccion ;//llave representa una instruccion compuesta, despues del while viene siempre una instruccion

bloque : LLA instrucciones LLC; 

//Aca vamos a declarar las operaciones aritmeticas y logicas
//-------------------------------------
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
ifor : FOR PA init PYC cond PYC iter PC instruccion ;

//Usamos para inicializar la variable esta parte, esta tiene un nombre el cual esta detallado mas arriba 
//---------------------------
init :  INT NOMBRE val PYC;

val : ASIG NUMERO
    | 
    ;
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







