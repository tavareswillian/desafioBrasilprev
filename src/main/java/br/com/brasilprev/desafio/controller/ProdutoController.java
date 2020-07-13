package br.com.brasilprev.desafio.controller;

import java.util.List;
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

import br.com.brasilprev.desafio.model.Carrinho;
import br.com.brasilprev.desafio.model.Produto;
import br.com.brasilprev.desafio.repository.ProdutoRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/Produto")
public class ProdutoController {

		@Autowired
		ProdutoRepository produtoRepository;
		
		@GetMapping
		@ApiOperation(value="Consulta a lista de produtos.")
		public List<Produto> consultarProduto() {
			return produtoRepository.findAll();	
		}
		
		@GetMapping("/{idProduto}")
		public Optional<Produto> consultarProduto(@PathVariable("idProduto") Long idProduto) {
			return produtoRepository.findById(idProduto);	
		}
		
		@PostMapping
		public Produto cadastrarProduto(@RequestBody Produto Produto) {
			return produtoRepository.save(Produto);	
		}
		
		@PutMapping
		public Produto atualizarProduto(@RequestBody Produto Produto) {	
			return produtoRepository.save(Produto);	
		}
		
		@DeleteMapping("/{idProduto}")
		public void removerProduto(@PathVariable("idProduto") Long idProduto) {
			produtoRepository.deleteById(idProduto);	
		}
}
