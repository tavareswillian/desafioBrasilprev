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

import br.com.brasilprev.desafio.model.CupomCliente;
import br.com.brasilprev.desafio.repository.CupomClienteRepository;

@RestController
@RequestMapping(value="/cupomCliente")
public class CupomClienteController {

		@Autowired
		CupomClienteRepository cupomClienteRepository;
		
		@GetMapping("/{idCupomCliente}")
		public Optional<CupomCliente> consultarCupomCliente(@PathVariable("idCupomCliente") Long idCupomCliente) {
			return cupomClienteRepository.findById(idCupomCliente);	
		}
		
		@PostMapping
		public CupomCliente cadastrarCupomCliente(@RequestBody CupomCliente cupomCliente) {
			return cupomClienteRepository.save(cupomCliente);	
		}
		
		@PutMapping
		public CupomCliente atualizarCupomCliente(@RequestBody CupomCliente cupomCliente) {	
			return cupomClienteRepository.save(cupomCliente);	
		}
		
		@DeleteMapping("/{idCupomCliente}")
		public void removerCupomCliente(@PathVariable("idCupomCliente") Long idCupomCliente) {
			cupomClienteRepository.deleteById(idCupomCliente);	
		}
}
