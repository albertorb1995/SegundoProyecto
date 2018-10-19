package com.alberto.finalfantasy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alberto.finalfantasy.entity.models.Noticia;
import com.alberto.finalfantasy.entity.services.INoticiaService;

@CrossOrigin(origins = {"*", "http://localhost:8080"})
@RestController
public class NoticiaController{

	@Autowired
	INoticiaService noticiaService;
	
	@GetMapping("/personaje")
	public List<Noticia> getAllNoticias(){
		return noticiaService.getAll();
	}
	
	@GetMapping ("/personaje/{id}")
	public Noticia getOne(@PathVariable(value = "id")long id) {
		return noticiaService.get(id);
	}
	
	@PostMapping("/personaje")
	public void add(Noticia personaje) {
		noticiaService.post(personaje);
	}
	
	@PutMapping ("/personaje/{id}")
	public void update(Noticia personaje, @PathVariable(value = "id")long id) {
		noticiaService.put(personaje, id);
	}

	@DeleteMapping ("/personaje/{id}")
	public void update(@PathVariable(value = "id")long id) {
		noticiaService.delete(id);
	}
}
