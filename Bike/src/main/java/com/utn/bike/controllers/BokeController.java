package com.utn.bike.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PostRemove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.utn.bike.models.Bike;
import com.utn.bike.repositories.BikeRepository;

@RestController
//Realizada la configuración será suficiente con crear una clase que use la anotación
//@RestController y automaticamente se publicara como un  Spring REST Service.
@RequestMapping("api/v1/bikes")
public class BokeController {
	@Autowired
	private BikeRepository bk;

	// metodo que devuelve la lista de bicicletas
	@GetMapping
	public List<Bike> lista() {

		Bike b1 = new Bike();
		b1.setContact(true);
		b1.setEmail("primer@gmail.com");
		b1.setModel("arg76909");
		Bike b2 = new Bike();

		List<Bike> Bikes = new ArrayList<>();
		Bikes.add(b2);
		Bikes.add(b1);

		// return Bikes;
		return bk.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {

		bike.setEmail("alexdeassis@gmail.com");
		bike.setSerialNumber("12312312332");
		bk.save(bike);
	}

//	http://localhost:8080/api/v1/bikes/1
	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {

		Bike bc = new Bike();
		bc.setSerialNumber("1234");
		bc.setContact(true);
		bc.setEmail("alex.deassis@gmail.com");
		bc.setModel("modelo 3");
		bc.setId(id);

//		return bc;
		// return new Bike();

		return bk.getOne(id);
	}

	
//	http://localhost:8080/api/v1/bikes/borrar/3
	@GetMapping("/borrar/{id}")
	@ResponseStatus(HttpStatus.OK)
	public boolean delete(@PathVariable long id) {

		if (bk.existsById(id)) {
			bk.deleteById(id);
			return true;
		} else {

			return false;
		}

	}
}
