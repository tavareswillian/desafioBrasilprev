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

import br.com.brasilprev.desafio.model.CupomCliente;
import br.com.brasilprev.desafio.repository.CupomClienteRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/cupomCliente")
public class CupomClienteController {

		@Autowired
		CupomClienteRepository cupomClienteRepository;
		
		@GetMapping
		@ApiOperation(value="Consulta a lista de cupons para um cliente.")
		public List<CupomCliente> consultarCupomCliente() {
			return cupomClienteRepository.findAll();	
		}
		
		@GetMapping("/{idCupomCliente}")
		@ApiOperation(value="Consulta um cupom de cliente pelo ID.")
		public Optional<CupomCliente> consultarCupomCliente(@PathVariable("idCupomCliente") Long idCupomCliente) {
			return cupomClienteRepository.findById(idCupomCliente);	
		}
		
		@PostMapping
		@ApiOperation(value="Cadastra um cupom de cliente.")
		public CupomCliente cadastrarCupomCliente(@RequestBody CupomCliente cupomCliente) {
			return cupomClienteRepository.save(cupomCliente);	
		}
		
		@PutMapping
		@ApiOperation(value="Atualiza um cupom de cliente.")
		public CupomCliente atualizarCupomCliente(@RequestBody CupomCliente cupomCliente) {	
			return cupomClienteRepository.save(cupomCliente);	
		}
		
		@DeleteMapping("/{idCupomCliente}")
		@ApiOperation(value="Remove um cupom de cliente pelo ID.")
		public void removerCupomCliente(@PathVariable("idCupomCliente") Long idCupomCliente) {
			cupomClienteRepository.deleteById(idCupomCliente);	
		}
		
		@DeleteMapping
		@ApiOperation(value="Remove um cupom de cliente.")
		public void removerCupomCliente(@RequestBody CupomCliente cupomCliente) {
			cupomClienteRepository.delete(cupomCliente);	
		}
}
