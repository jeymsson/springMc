package com.nellioalves.cursomc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nellioalves.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "")
public class ClienteResource {

	@Autowired
	private ClienteService service;
	
	public ResponseEntity<?> find(@PathVariable Integer id){
		return ResponseEntity.ok().body( service.buscar(id) );
	}
}
