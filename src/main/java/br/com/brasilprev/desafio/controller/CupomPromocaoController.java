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
import br.com.brasilprev.desafio.model.CupomPromocao;
import br.com.brasilprev.desafio.repository.CupomPromocaoRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/cupomPromocao")
public class CupomPromocaoController {

		@Autowired
		CupomPromocaoRepository cupomPromocaoRepository;
		
		@GetMapping("/{idCupomPromocao}")
		@ApiOperation(value="Consulta um cupom de promoção pelo ID.")
		public Optional<CupomPromocao> consultarCupomPromocao(@PathVariable("idCupomPromocao") Long idCupomPromocao) {
			return cupomPromocaoRepository.findById(idCupomPromocao);	
		}
		
		@GetMapping
		@ApiOperation(value="Consulta a lista de cupons de promoção.")
		public List<CupomPromocao> consultarCupomPromocao() {
			return cupomPromocaoRepository.findAll();	
		}
		
		@PostMapping
		@ApiOperation(value="Cadastra um cupom de promoção.")
		public CupomPromocao cadastrarCupomPromocao(@RequestBody CupomPromocao cupomPromocao) {
			return cupomPromocaoRepository.save(cupomPromocao);	
		}
		
		@PutMapping
		@ApiOperation(value="Atualiza um cupom de promoção.")
		public CupomPromocao atualizarCupomPromocao(@RequestBody CupomPromocao cupomPromocao) {	
			return cupomPromocaoRepository.save(cupomPromocao);	
		}
		
		@DeleteMapping("/{idCupomPromocao}")
		@ApiOperation(value="Remove um cupom de promoção pelo ID")
		public void removerCupomPromocao(@PathVariable("idCupomPromocao") Long idCupomPromocao) {
			cupomPromocaoRepository.deleteById(idCupomPromocao);	
		}
		
		@DeleteMapping
		@ApiOperation(value="Remove um cupom de promoção.")
		public void removerCupomPromocao(@RequestBody  CupomPromocao cupomPromocao) {
			cupomPromocaoRepository.delete(cupomPromocao);	
		}
}
