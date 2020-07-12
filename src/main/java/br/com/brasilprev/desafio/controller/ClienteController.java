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

import br.com.brasilprev.desafio.model.Cliente;
import br.com.brasilprev.desafio.repository.ClienteRepository;

@RestController
@RequestMapping(value="/cliente")
public class ClienteController {


		@Autowired
		ClienteRepository clienteRepository;
		
		@GetMapping("/{idCliente}")
		public Optional<Cliente> consultarCliente(@PathVariable("idCliente") Long idCliente) {
			return clienteRepository.findById(idCliente);	
		}
		
		@PostMapping
		public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
			return clienteRepository.save(cliente);	
		}
		
		@PutMapping
		public Cliente atualizarCliente(@RequestBody Cliente cliente) {	
			return clienteRepository.save(cliente);	
		}
		
		@DeleteMapping("/{idCliente}")
		public void removerCliente(@PathVariable("idCliente") Long idCliente) {
			clienteRepository.deleteById(idCliente);	
		}
}
