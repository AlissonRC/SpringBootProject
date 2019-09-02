package com.spring.first.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.first.domain.Estado;

@Repository
public interface EstadoDAO extends JpaRepository<Estado, Integer> {	

}
