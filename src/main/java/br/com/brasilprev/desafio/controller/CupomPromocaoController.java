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

import br.com.brasilprev.desafio.model.CupomPromocao;
import br.com.brasilprev.desafio.repository.CupomPromocaoRepository;

@RestController
@RequestMapping(value="/cupomPromocao")
public class CupomPromocaoController {

		@Autowired
		CupomPromocaoRepository cupomPromocaoRepository;
		
		@GetMapping("/{idCupomPromocao}")
		public Optional<CupomPromocao> consultarCupomPromocao(@PathVariable("idCupomPromocao") Long idCupomPromocao) {
			return cupomPromocaoRepository.findById(idCupomPromocao);	
		}
		
		@PostMapping
		public CupomPromocao cadastrarCupomPromocao(@RequestBody CupomPromocao cupomPromocao) {
			return cupomPromocaoRepository.save(cupomPromocao);	
		}
		
		@PutMapping
		public CupomPromocao atualizarCupomPromocao(@RequestBody CupomPromocao cupomPromocao) {	
			return cupomPromocaoRepository.save(cupomPromocao);	
		}
		
		@DeleteMapping("/{idCupomPromocao}")
		public void removerCupomPromocao(@PathVariable("idCupomPromocao") Long idCupomPromocao) {
			cupomPromocaoRepository.deleteById(idCupomPromocao);	
		}
}
