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

import br.com.brasilprev.desafio.model.Pedido;
import br.com.brasilprev.desafio.repository.PedidoRepository;

@RestController
@RequestMapping(value="/Pedido")
public class PedidoController {

		@Autowired
		PedidoRepository PedidoRepository;
		
		@GetMapping("/{idPedido}")
		public Optional<Pedido> consultarPedido(@PathVariable("idPedido") Long idPedido) {
			return PedidoRepository.findById(idPedido);	
		}
		
		@PostMapping
		public Pedido cadastrarPedido(@RequestBody Pedido Pedido) {
			return PedidoRepository.save(Pedido);	
		}
		
		@PutMapping
		public Pedido atualizarPedido(@RequestBody Pedido Pedido) {	
			return PedidoRepository.save(Pedido);	
		}
		
		@DeleteMapping("/{idPedido}")
		public void removerPedido(@PathVariable("idPedido") Long idPedido) {
			PedidoRepository.deleteById(idPedido);	
		}
}
