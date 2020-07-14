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

import br.com.brasilprev.desafio.model.NotaFiscal;
import br.com.brasilprev.desafio.model.Pedido;
import br.com.brasilprev.desafio.repository.NotaFiscalRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/notaFiscal")
public class NotaFiscalController {

		@Autowired
		NotaFiscalRepository notaFiscalRepository;
		
		@GetMapping
		@ApiOperation(value="Consulta a lista de notas fiscais.")
		public List<NotaFiscal> consultarProduto() {
			return notaFiscalRepository.findAll();	
		}
		
		@GetMapping("/{idNotaFiscal}")
		@ApiOperation(value="Consulta nota fiscal pelo ID.")
		public Optional<NotaFiscal> consultarNotaFiscal(@PathVariable("idNotaFiscal") Long idNotaFiscal) {
			return notaFiscalRepository.findById(idNotaFiscal);	
		}
		
		@PostMapping
		@ApiOperation(value="Cadastra nota fiscal.")
		public NotaFiscal cadastrarNotaFiscal(@RequestBody NotaFiscal notaFiscal) {
			return notaFiscalRepository.save(notaFiscal);	
		}
		
		@PutMapping
		@ApiOperation(value="Atualiza nota fiscal.")
		public NotaFiscal atualizarNotaFiscal(@RequestBody NotaFiscal notaFiscal) {	
			return notaFiscalRepository.save(notaFiscal);	
		}
		
		@DeleteMapping("/{idNotaFiscal}")
		@ApiOperation(value="Remove nota fiscal pelo ID.")
		public void removerNotaFiscal(@PathVariable("idNotaFiscal") Long idNotaFiscal) {
			notaFiscalRepository.deleteById(idNotaFiscal);	
		}
		
		@DeleteMapping
		@ApiOperation(value="Remove nota fiscal pelo ID.")
		public void removerNotaFiscal(@RequestBody NotaFiscal notaFiscal) {
			notaFiscalRepository.delete(notaFiscal);	
		}
}
