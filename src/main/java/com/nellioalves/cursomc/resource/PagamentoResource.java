package com.nellioalves.cursomc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.nellioalves.cursomc.dominio.Pagamento;
import com.nellioalves.cursomc.services.PagamentoService;

public class PagamentoResource {

	@Autowired
	private PagamentoService service;
	
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		Pagamento p = service.buscar(id);
		return ResponseEntity.ok().body(p);
	}
}
