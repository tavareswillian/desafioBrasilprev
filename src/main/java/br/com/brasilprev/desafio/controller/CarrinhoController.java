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
import br.com.brasilprev.desafio.model.Cliente;
import br.com.brasilprev.desafio.repository.CarrinhoRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/carrinho")
public class CarrinhoController {

	@Autowired
	CarrinhoRepository carrinhoRepository;
	
	@GetMapping
	@ApiOperation(value="Consulta a lista de carrinhos.")
	public List<Carrinho> consultarCarrinho() {
		return carrinhoRepository.findAll();	
	}
	
	@GetMapping("/{idCarrinho}")
	@ApiOperation(value="Retorna o carrinho desejado.")
	public Optional<Carrinho> consultarCarrinho(@PathVariable("idCarrinho") Long idCarrinho) {
		return carrinhoRepository.findById(idCarrinho);	
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra um novo carrinho.")
	public Carrinho cadastrarCarrinho(@RequestBody Carrinho carrinho) {
		return carrinhoRepository.save(carrinho);	
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza um carrinho.")
	public Carrinho atualizarCarrinho(@RequestBody Carrinho carrinho) {	
		return carrinhoRepository.save(carrinho);	
	}
	
	@DeleteMapping("/{idCarrinho}")
	@ApiOperation(value="Remove um carrinho pelo ID.")
	public void removerCarrinho(@PathVariable("idCarrinho") Long idCarrinho) {
		carrinhoRepository.deleteById(idCarrinho);	
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove um carrinho enviado no corpo da requisição.")
	public void removerCarrinho(@RequestBody Carrinho carrinho) {
		carrinhoRepository.delete(carrinho);	
	}
}
