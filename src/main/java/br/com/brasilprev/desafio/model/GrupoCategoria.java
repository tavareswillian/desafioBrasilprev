package br.com.brasilprev.desafio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_GRUPO_CATEGORIA")
public class GrupoCategoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idGrupoCategoria;
	
	private String nmGrupoCategoria;

	public Long getIdGrupoCategoria() {
		return idGrupoCategoria;
	}

	public void setIdGrupoCategoria(Long idGrupoCategoria) {
		this.idGrupoCategoria = idGrupoCategoria;
	}

	public String getNmGrupoCategoria() {
		return nmGrupoCategoria;
	}

	public void setNmGrupoCategoria(String nmGrupoCategoria) {
		this.nmGrupoCategoria = nmGrupoCategoria;
	}
}
