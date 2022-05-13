package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/persona/")
public class PersonaController {
	@Autowired 
	PersonaRepository personaRepository;
	
	@GetMapping
    public Flux<Persona> buscarTodo() {

        return personaRepository.findAll();

    }
	
	@PostMapping
    public Mono<Persona> crearPersona(@RequestBody Persona p) {

        return personaRepository.save(p);
    }
	
	@PutMapping
    public Mono<Persona> actualizarPersona(@RequestBody Persona p) {

        return personaRepository.save(p);

    }
	
    @DeleteMapping
    public boolean borrarPersona(@RequestBody Persona p) {

        try {
            personaRepository.deleteById(p.getId()).block();
            return true;

        } catch (Exception e) {

            return false;
        }
    }
	
}
