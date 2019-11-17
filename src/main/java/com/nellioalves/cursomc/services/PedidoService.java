package com.nellioalves.cursomc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nellioalves.cursomc.dominio.Pedido;
import com.nellioalves.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> p = repo.findById(id);
		return p.orElse(null);
	}
}
