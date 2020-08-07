"use strict";
exports.__esModule = true;
exports.Persona = void 0;
var Persona = /** @class */ (function () {
    function Persona() {
        this.nombre = "alex";
        this.apellido = "assis";
    }
    Persona.prototype.caminar = function () {
        console.log('camino');
    };
    return Persona;
}());
exports.Persona = Persona;
