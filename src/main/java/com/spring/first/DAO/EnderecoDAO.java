package com.spring.first.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.first.domain.Endereco;


@Repository
public interface EnderecoDAO extends JpaRepository<Endereco, Integer> {	

}
