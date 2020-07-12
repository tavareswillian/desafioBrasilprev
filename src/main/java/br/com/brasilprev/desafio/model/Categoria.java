package br.com.brasilprev.desafio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CATEGORIA")
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCategoria;
	
	private String nmCategoria;
	
	private String dsCategoria;
	
	private Long idCategoriaMae;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNmCategoria() {
		return nmCategoria;
	}

	public void setNmCategoria(String nmCategoria) {
		this.nmCategoria = nmCategoria;
	}

	public String getDsCategoria() {
		return dsCategoria;
	}

	public void setDsCategoria(String dsCategoria) {
		this.dsCategoria = dsCategoria;
	}

	public Long getIdCategoriaMae() {
		return idCategoriaMae;
	}

	public void setIdCategoriaMae(Long idCategoriaMae) {
		this.idCategoriaMae = idCategoriaMae;
	}
}
