package com.utn.bike.controllers;



import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.utn.bike.models.Bike;
import com.utn.bike.models.Persona;

@RestController
//Realizada la configuración será suficiente con crear una clase que use la anotación
//@RestController y automaticamente se publicara como un  Spring REST Service.
@RequestMapping("api/v1/persona")
public class PersonaController {

	// metodo que devuelve la lista de bicicletas
	@GetMapping
	public List<Persona> lista() {

		Persona p1 = new Persona();
		Persona p2 = new Persona();
		p1.setApellido("de assissss");
		p2.setApellido("martinez");
		
		List<Persona> Personas = new ArrayList<>();
		Personas.add(p2);
		Personas.add(p1);

		return Personas;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {

	}

	@GetMapping("/{id}")
	public Persona get(@PathVariable("id") long id) {

		Persona pc = new Persona();
		pc.setApellido("gomez");
		pc.setDni("123456754");
		pc.setNombre("gomez" + id);

		return pc;
		// return new Bike();
	}
}
