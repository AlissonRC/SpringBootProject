package com.spring.first.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.first.domain.Categoria;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer> {
	
	

}
