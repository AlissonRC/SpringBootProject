package com.spring.first.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.first.domain.Cidade;


@Repository
public interface CidadeDAO extends JpaRepository<Cidade, Integer> {	

}
