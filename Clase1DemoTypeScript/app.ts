import { Persona } from './Persona';

var mobjeto = new Persona(1000);

mobjeto.caminar();




















console.log('Hola Mundo');

/*DIFERENCIA EN TRE LET Y VAR 
let foo = 123;

if(true){
    let foo = 456
}

console.log(foo);*/

//DEFINIMOS CONSTANTES 
const foo = 12312312 ; 
console.log(foo);

// foo =489; NO PERMITIDO POR SER INMUTABLE  

const foo2 = { bar : 123 };
console.log(foo2);
//foo2 = { bar : 456}; ERROR No se permite la modificacion de objeto 

foo2.bar = 456; //si es PERMITIDO!
console.log(foo2);
/**     TIPOS DE DATOS PRIMITIVOS  */

//boolean 

let isDone :  boolean = true;

console.log('isDone :'+ isDone );
//Datos numericos 

let decimal: number = 6;

let hex : number = 0xf00d ;

let binary : number = 0b1010;

let octal : number = 60744;

console.log('numericos');
console.log('numero en decimal ' + decimal);
console.log('numero en hexadecimal ' +hex);

//Datos String  
//Cadenas de caracteres y/o textos
console.log('Datos String  :');
let color : string = "blue";
console.log('Color  :' + color );
color = 'red' ;
console.log('Color Modificado :' + color );
//Tambien se puede utilizar "Templates"
let fullName: string = `Alex De Assis`;
let age : number = 28 ;
let sentence : string = `Hello , my name is ${ fullName }.years ${ age  }`
console.log('Sentence :' + sentence );

let sentence2 : string = "Hello , my name is " + fullName +"."+"I'll be " + (age + 1) +
" years old next month "
console.log('Sentence DOS :' + sentence2 );