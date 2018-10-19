package com.alberto.finalfantasy.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alberto.finalfantasy.entity.dao.INoticiaDao;
import com.alberto.finalfantasy.entity.models.Noticia;

@Service
public class NoticiaServiceImpl implements INoticiaService{

	
	@Autowired
	private INoticiaDao noticiaDao;
	
	@Override
	public Noticia get(long id) {
		return noticiaDao.findById(id).get();
	}

	@Override
	public List<Noticia> getAll() {
		return (List<Noticia>) noticiaDao.findAll();
	}

	@Override
	public void post(Noticia personaje) {
		noticiaDao.save(personaje);
	}

	@Override
	public void put(Noticia personaje, long id) {
		noticiaDao.findById(id).ifPresent((x)->{
			personaje.setId(id);
			noticiaDao.save(personaje);
		});
		
	}

	@Override
	public void delete(long id) {
		noticiaDao.deleteById(id);
		
	}

}
