package br.com.brasilprev.desafio.controller;

import java.io.Serializable;
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

import br.com.brasilprev.desafio.model.GrupoCategoria;
import br.com.brasilprev.desafio.model.NotaFiscal;
import br.com.brasilprev.desafio.repository.GrupoCategoriaRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/grupoCategoria")
public class GrupoCategoriaController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Autowired
	GrupoCategoriaRepository grupoCategoriaRepository;
	
	@GetMapping
	@ApiOperation(value="Consulta a lista de grupos de categorias.")
	public List<GrupoCategoria> consultarGrupoCategoria() {
		return grupoCategoriaRepository.findAll();	
	}
	
	@GetMapping("/{idGrupoCategoria")
	@ApiOperation(value="Consulta um grupo de categorias pelo ID.")
	public Optional<GrupoCategoria> consultarGrupoCategoria(@PathVariable("/idGrupoCategoria") Long idGrupoCategoria) {
		return grupoCategoriaRepository.findById(idGrupoCategoria);
	}
	
	@PostMapping
	@ApiOperation(value="Cadastra grupo de categorias.")
	public GrupoCategoria cadastrarGrupoCategoria(@RequestBody GrupoCategoria grupoCategoria) {
		return grupoCategoriaRepository.save(grupoCategoria);
	}
	
	@PutMapping
	@ApiOperation(value="Atualiza grupo de categorias.")
	public GrupoCategoria atualizarGrupoCategoria(@RequestBody GrupoCategoria grupoCategoria) {
		return grupoCategoriaRepository.save(grupoCategoria);
	}
	
	@DeleteMapping
	@ApiOperation(value="Remove grupo de categorias.")
	public void removerGrupoCategoria(@RequestBody GrupoCategoria grupoCategoria) {
		grupoCategoriaRepository.delete(grupoCategoria);
	}
}
