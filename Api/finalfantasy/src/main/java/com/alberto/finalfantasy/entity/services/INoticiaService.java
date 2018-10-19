package com.alberto.finalfantasy.entity.services;

import java.util.List;

import com.alberto.finalfantasy.entity.models.Noticia;

public interface INoticiaService {
	public Noticia get(long id); 
	public List<Noticia> getAll();
	public void post(Noticia personaje);
	public void put(Noticia personaje, long id);
	public void delete(long id);
	
}
