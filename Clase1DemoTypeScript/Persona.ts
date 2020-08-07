export class Persona{

public nombre: any ; 
private apellido : any ;
readonly edad : any ;
Kilometros : any ;


caminar(){
    console.log('estoy caminando '+ this.Kilometros);
}

constructor( cuantoKilometros : number ){
    this.Kilometros = cuantoKilometros ;
    this.apellido = " De assis "
}


}