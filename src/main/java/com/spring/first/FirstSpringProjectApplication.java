package com.spring.first;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.first.DAO.CategoriaDAO;
import com.spring.first.DAO.CidadeDAO;
import com.spring.first.DAO.ClienteDAO;
import com.spring.first.DAO.EnderecoDAO;
import com.spring.first.DAO.EstadoDAO;
import com.spring.first.DAO.ProdutoDAO;
import com.spring.first.domain.Categoria;
import com.spring.first.domain.Cidade;
import com.spring.first.domain.Cliente;
import com.spring.first.domain.Endereco;
import com.spring.first.domain.Estado;
import com.spring.first.domain.Produto;
import com.spring.first.domain.enums.TipoCliente;

@SpringBootApplication
public class FirstSpringProjectApplication implements CommandLineRunner{
@Autowired
private CategoriaDAO categoriaDao;
@Autowired
private ProdutoDAO produtoDao;
@Autowired
private CidadeDAO cidadeDao;
@Autowired
private EstadoDAO estadoDao;
@Autowired
private ClienteDAO clienteDao;
@Autowired
private EnderecoDAO enderecoDao;
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
		
		Estado est1 = new Estado(null, "Rio Grande do Sul");
		Estado est2 = new Estado(null, "São Paulo");
		Cidade c1 = new Cidade(null, "São Leopoldo", est1);
		Cidade c2 = new Cidade(null, "Porto Alegre", est1);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		Cidade c4 = new Cidade(null, "São Paulo", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1,c2));
		est2.getCidades().addAll(Arrays.asList(c3,c4));
		
		estadoDao.saveAll(Arrays.asList(est1,est2));
		cidadeDao.saveAll(Arrays.asList(c1,c2,c3,c4));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("27363323","93838393"));
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 203", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "sala 800", "Centro", "38777012", cli1, c2);
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		
		clienteDao.saveAll(Arrays.asList(cli1));
		enderecoDao.saveAll(Arrays.asList(e1,e2));
		
		
	}

}
