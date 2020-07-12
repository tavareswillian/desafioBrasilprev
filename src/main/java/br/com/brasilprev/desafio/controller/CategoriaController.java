package br.com.brasilprev.desafio.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brasilprev.desafio.model.Categoria;
import br.com.brasilprev.desafio.repository.CategoriaRepository;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaController {


		@Autowired
		CategoriaRepository categoriaRepository;
		
		@GetMapping("/{idCategoria}")
		public Optional<Categoria> consultarCategoria(@PathVariable("idCategoria") Long idCategoria) {
			return categoriaRepository.findById(idCategoria);	
		}
		
		@PostMapping
		public Categoria cadastrarCategoria(@RequestBody Categoria categoria) {
			return categoriaRepository.save(categoria);	
		}
		
		@PutMapping
		public Categoria atualizarCategoria(@RequestBody Categoria categoria) {	
			return categoriaRepository.save(categoria);	
		}
		
		@DeleteMapping("/{idCategoria}")
		public void removerCategoria(@PathVariable("idCategoria") Long idCategoria) {
			categoriaRepository.deleteById(idCategoria);	
		}
}
