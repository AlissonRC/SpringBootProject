package com.spring.first;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.first.DAO.CategoriaDAO;
import com.spring.first.DAO.ProdutoDAO;
import com.spring.first.domain.Categoria;
import com.spring.first.domain.Produto;

@SpringBootApplication
public class FirstSpringProjectApplication implements CommandLineRunner{
@Autowired
private CategoriaDAO categoriaDao;
@Autowired
private ProdutoDAO produtoDao;
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		Produto p1 = new Produto(null, "computador", 2000.00);
		Produto p2 = new Produto(null, "impressora", 800.00);
		Produto p3 = new Produto(null, "mouse", 80.00);
		Categoria cat1 = new Categoria(null, "informática");
		Categoria cat2 = new Categoria(null, "escritório");
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		categoriaDao.saveAll(Arrays.asList(cat1,cat2));
		produtoDao.saveAll(Arrays.asList(p1,p2,p3));
		
		
	}

}
