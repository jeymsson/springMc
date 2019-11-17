package com.nellioalves.cursomc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nellioalves.cursomc.dominio.Produto;
import com.nellioalves.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;

	public Produto buscar(Integer id) {
		Optional<Produto> p = repo.findById(id);
		return p.orElse(null);
	}
}
