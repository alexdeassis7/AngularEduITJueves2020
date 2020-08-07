"use strict";
exports.__esModule = true;
exports.Persona = void 0;
var Persona = /** @class */ (function () {
    function Persona(cuantoKilometros) {
        this.Kilometros = cuantoKilometros;
        this.apellido = " De assis ";
    }
    Persona.prototype.caminar = function () {
        console.log('estoy caminando ' + this.Kilometros);
    };
    return Persona;
}());
exports.Persona = Persona;
