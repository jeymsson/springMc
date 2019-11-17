package com.nellioalves.cursomc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nellioalves.cursomc.dominio.Pagamento;
import com.nellioalves.cursomc.repositories.PagamentoRepository;

@Service
public class PagamentoService {

	@Autowired
	private PagamentoRepository repo;
	
	public Pagamento buscar(Integer id) {
		Optional<Pagamento> p = repo.findById(id);
		return p.orElse(null);
	}
}
