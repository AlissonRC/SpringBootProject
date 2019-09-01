package com.spring.first.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.first.domain.Produto;


@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer> {	

}
