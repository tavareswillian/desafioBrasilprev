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
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaController {


		@Autowired
		CategoriaRepository categoriaRepository;
		
		@GetMapping("/{idCategoria}")
		@ApiOperation(value="Consulta uma categoria pelo ID.")
		public Optional<Categoria> consultarCategoria(@PathVariable("idCategoria") Long idCategoria) {
			return categoriaRepository.findById(idCategoria);	
		}
		
		@PostMapping
		@ApiOperation(value="Cadastra uma nova categoria.")
		public Categoria cadastrarCategoria(@RequestBody Categoria categoria) {
			return categoriaRepository.save(categoria);	
		}
		
		@PutMapping
		@ApiOperation(value="Atualiza uma categoria.")
		public Categoria atualizarCategoria(@RequestBody Categoria categoria) {	
			return categoriaRepository.save(categoria);	
		}
		
		@DeleteMapping("/{idCategoria}")
		@ApiOperation(value="Remove uma categoria pelo ID.")
		public void removerCategoria(@PathVariable("idCategoria") Long idCategoria) {
			categoriaRepository.deleteById(idCategoria);	
		}
		
		@DeleteMapping
		@ApiOperation(value="Remove uma categoria enviada no corpo da requisição.")
		public void removerCategoria(@RequestBody Categoria categoria) {
			categoriaRepository.delete(categoria);
		}
}
