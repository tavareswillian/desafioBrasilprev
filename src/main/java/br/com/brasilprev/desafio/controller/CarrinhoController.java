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

import br.com.brasilprev.desafio.model.Carrinho;
import br.com.brasilprev.desafio.repository.CarrinhoRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/carrinho")
public class CarrinhoController {

	@Autowired
	CarrinhoRepository carrinhoRepository;
	
	@GetMapping("/{idCarrinho}")
	@ApiOperation(value="Retorna o carrinho desejado.")
	public Optional<Carrinho> consultarCarrinho(@PathVariable("idCarrinho") Long idCarrinho) {
		return carrinhoRepository.findById(idCarrinho);	
	}
	
	@PostMapping
	public Carrinho cadastrarCarrinho(@RequestBody Carrinho carrinho) {
		return carrinhoRepository.save(carrinho);	
	}
	
	@PutMapping
	public Carrinho atualizarCarrinho(@RequestBody Carrinho carrinho) {	
		return carrinhoRepository.save(carrinho);	
	}
	
	@DeleteMapping("/{idCarrinho}")
	public void removerCarrinho(@PathVariable("idCarrinho") Long idCarrinho) {
		carrinhoRepository.deleteById(idCarrinho);	
	}
}
