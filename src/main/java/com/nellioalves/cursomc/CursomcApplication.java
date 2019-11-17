package com.nellioalves.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nellioalves.cursomc.dominio.Categoria;
import com.nellioalves.cursomc.dominio.Produto;
import com.nellioalves.cursomc.repositories.CategoriaRepository;
import com.nellioalves.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	//private CategoriaRepository repoCat;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		System.out.println("Estamos rodando..");
	}
	
	private CategoriaRepository cRepo;
	private ProdutoRepository pRepo;

	// Seeder
	@Override
	public void run(String... args) throws Exception {
		Categoria 	cat1 = new Categoria(null, "Informatica"),
					cat2 = new Categoria(null, "Escritorio");
		Produto 	p1 = new Produto(null, "Computador", 2000.0),
					p2 = new Produto(null, "Impressora", 800.0),
					p3 = new Produto(null, "Mouse", 80.0);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		cRepo.saveAll(Arrays.asList(cat1, cat2));
		pRepo.saveAll(Arrays.asList(p1, p2, p3));
	}

}
