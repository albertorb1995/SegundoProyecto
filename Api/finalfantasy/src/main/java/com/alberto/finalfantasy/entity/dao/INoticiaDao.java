package com.alberto.finalfantasy.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.alberto.finalfantasy.entity.models.Noticia;

public interface INoticiaDao extends CrudRepository<Noticia, Long>{
	
}
