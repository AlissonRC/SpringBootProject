package com.spring.first.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.first.domain.Cliente;


@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {	

}
