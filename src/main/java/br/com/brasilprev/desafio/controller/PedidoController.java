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

import br.com.brasilprev.desafio.model.Pedido;
import br.com.brasilprev.desafio.model.Produto;
import br.com.brasilprev.desafio.repository.PedidoRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/Pedido")
public class PedidoController {

		@Autowired
		PedidoRepository pedidoRepository;
		
		@GetMapping
		@ApiOperation(value="Consulta a lista de pedidos.")
		public List<Pedido> consultarProduto() {
			return pedidoRepository.findAll();	
		}
		
		@GetMapping("/{idPedido}")
		@ApiOperation(value="Consulta um pedido pelo ID.")
		public Optional<Pedido> consultarPedido(@PathVariable("idPedido") Long idPedido) {
			return pedidoRepository.findById(idPedido);	
		}
		
		@PostMapping
		@ApiOperation(value="Cadastra novo  pedido.")
		public Pedido cadastrarPedido(@RequestBody Pedido pedido) {
			return pedidoRepository.save(pedido);	
		}
		
		@PutMapping
		@ApiOperation(value="Atualiza um pedido.")
		public Pedido atualizarPedido(@RequestBody Pedido pedido) {	
			return pedidoRepository.save(pedido);	
		}
		
		@DeleteMapping("/{idPedido}")
		@ApiOperation(value="Remove um pedido pelo ID.")
		public void removerPedido(@PathVariable("idPedido") Long idPedido) {
			pedidoRepository.deleteById(idPedido);	
		}
		
		@DeleteMapping
		@ApiOperation(value="Remove um pedido enviado no corpo da requisição.")
		public void removerPedido(@RequestBody Pedido pedido) {
			pedidoRepository.delete(pedido);	
		}
}
