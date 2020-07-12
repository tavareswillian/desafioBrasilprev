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

import br.com.brasilprev.desafio.model.NotaFiscal;
import br.com.brasilprev.desafio.repository.NotaFiscalRepository;

@RestController
@RequestMapping(value="/notaFiscal")
public class NotaFiscalController {

		@Autowired
		NotaFiscalRepository notaFiscalRepository;
		
		@GetMapping("/{idNotaFiscal}")
		public Optional<NotaFiscal> consultarNotaFiscal(@PathVariable("idNotaFiscal") Long idNotaFiscal) {
			return notaFiscalRepository.findById(idNotaFiscal);	
		}
		
		@PostMapping
		public NotaFiscal cadastrarNotaFiscal(@RequestBody NotaFiscal notaFiscal) {
			return notaFiscalRepository.save(notaFiscal);	
		}
		
		@PutMapping
		public NotaFiscal atualizarNotaFiscal(@RequestBody NotaFiscal notaFiscal) {	
			return notaFiscalRepository.save(notaFiscal);	
		}
		
		@DeleteMapping("/{idNotaFiscal}")
		public void removerNotaFiscal(@PathVariable("idNotaFiscal") Long idNotaFiscal) {
			notaFiscalRepository.deleteById(idNotaFiscal);	
		}
}
