package com.spring.first.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.spring.first.domain.enums.TipoCliente;

public class Cliente {
private Integer id;
private String nome;
private String email;
private String cpfOuCnpj;
private TipoCliente tipoCliente;

private List<Endereco> enderecos = new ArrayList<Endereco>();
private Set<String> telefones = new HashSet<>();
	
}
