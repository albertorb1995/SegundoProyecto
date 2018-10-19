package com.alberto.finalfantasy.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = {"http://localhost:8080", "*"})
@Entity
@Table(name = "personaje")
public class Noticia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String clase;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Noticia(@NotEmpty String nombre, @NotEmpty String clase) {
		super();
		this.nombre = nombre;
		this.clase = clase;
	}

	public Noticia() {
	}

	
}
