package com.utn.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utn.bike.models.Bike;


//El último paso es crear un interface de tipo Repositorio que nos permita gestionar las operaciones fundamentales



//Se puede observar que el interface de  repositorio para almacenar los objetos bike extiende de JpaRepository. 
//Esta es  una clase que pertenece a SpringData.
//Es momento de usar Spring Framework , cargar los diferentes beans e invocar al método save del repositorio

//
//La mera declaración del interface ha sido suficiente para poder salvar la información.
//Al usar Spring Data la mayor parte del código que tendríamos que implementar es aportado por
//el propio framework. Sus ventajas y versatilidad son enormes.

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
