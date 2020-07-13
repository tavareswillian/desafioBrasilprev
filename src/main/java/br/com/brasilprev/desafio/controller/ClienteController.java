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

import br.com.brasilprev.desafio.model.Cliente;
import br.com.brasilprev.desafio.repository.ClienteRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/cliente")
public class ClienteController {


		@Autowired
		ClienteRepository clienteRepository;
		
		@GetMapping
		@ApiOperation(value="Consulta a lista de clientes.")
		public List<Cliente> consultarCliente() {
			return clienteRepository.findAll();	
		}
		
		@GetMapping("/{idCliente}")
		@ApiOperation(value="Consulta um cliente pelo ID.")
		public Optional<Cliente> consultarCliente(@PathVariable("idCliente") Long idCliente) {
			return clienteRepository.findById(idCliente);	
		}
		
		@PostMapping
		@ApiOperation(value="Cadastra novo cliente.")
		public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
			return clienteRepository.save(cliente);	
		}
		
		@PutMapping
		@ApiOperation(value="Atualiza um cliente.")
		public Cliente atualizarCliente(@RequestBody Cliente cliente) {	
			return clienteRepository.save(cliente);	
		}
		
		@DeleteMapping("/{idCliente}")
		@ApiOperation(value="Remove um cliente pelo ID.")
		public void removerCliente(@PathVariable("idCliente") Long idCliente) {
			clienteRepository.deleteById(idCliente);	
		}
		
		@DeleteMapping
		@ApiOperation(value="Remove um cliente enviado no corpo da requisição.")
		public void removerCliente(@RequestBody Cliente cliente) {
			clienteRepository.delete(cliente);	
		}
}
