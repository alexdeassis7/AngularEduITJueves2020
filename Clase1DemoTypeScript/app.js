"use strict";
exports.__esModule = true;
var Persona_1 = require("./Persona");
var mobjeto = new Persona_1.Persona(1000);
mobjeto.caminar();
console.log('Hola Mundo');
/*DIFERENCIA EN TRE LET Y VAR
let foo = 123;

if(true){
    let foo = 456
}

console.log(foo);*/
//DEFINIMOS CONSTANTES 
var foo = 12312312;
console.log(foo);
// foo =489; NO PERMITIDO POR SER INMUTABLE  
var foo2 = { bar: 123 };
console.log(foo2);
//foo2 = { bar : 456}; ERROR No se permite la modificacion de objeto 
foo2.bar = 456; //si es PERMITIDO!
console.log(foo2);
/**     TIPOS DE DATOS PRIMITIVOS  */
//boolean 
var isDone = true;
console.log('isDone :' + isDone);
//Datos numericos 
var decimal = 6;
var hex = 0xf00d;
var binary = 10;
var octal = 60744;
console.log('numericos');
console.log('numero en decimal ' + decimal);
console.log('numero en hexadecimal ' + hex);
//Datos String  
//Cadenas de caracteres y/o textos
console.log('Datos String  :');
var color = "blue";
console.log('Color  :' + color);
color = 'red';
console.log('Color Modificado :' + color);
//Tambien se puede utilizar "Templates"
var fullName = "Alex De Assis";
var age = 28;
var sentence = "Hello , my name is " + fullName + ".years " + age;
console.log('Sentence :' + sentence);
var sentence2 = "Hello , my name is " + fullName + "." + "I'll be " + (age + 1) +
    " years old next month ";
console.log('Sentence DOS :' + sentence2);
