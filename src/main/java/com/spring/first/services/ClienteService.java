package com.spring.first.services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.first.DAO.ClienteDAO;
import com.spring.first.domain.Cliente;
import com.spring.first.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteDAO dao;	
	public Cliente find (Integer id) {
		Optional<Cliente> obj = dao.findById(id);
		return obj.orElseThrow(() ->  new ObjectNotFoundException("Object not found! id: " +id+", Category: " 
		+ ClienteDAO.class.getName()));
	}
	
}
