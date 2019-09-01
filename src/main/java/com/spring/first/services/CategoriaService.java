package com.spring.first.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.first.DAO.CategoriaDAO;
import com.spring.first.domain.Categoria;
import com.spring.first.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaDAO dao;	
	public Categoria find (Integer id) {
		Optional<Categoria> obj = dao.findById(id);
		return obj.orElseThrow(() ->  new ObjectNotFoundException("Object not found! id: " +id+" Category: " + CategoriaDAO.class.getName()));
	}
	
}
