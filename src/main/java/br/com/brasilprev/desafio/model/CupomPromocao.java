package br.com.brasilprev.desafio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CUPOM_PROMOCAO")
public class CupomPromocao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long idCupom;
	
	private String nmCupom;
	
	private double vlPercentualDesconto;
	
	private int qtdLimiteUso;
	
	private Long idCategoria;

	public Long getIdCupom() {
		return idCupom;
	}

	public void setIdCupom(Long idCupom) {
		this.idCupom = idCupom;
	}

	public String getNmCupom() {
		return nmCupom;
	}

	public void setNmCupom(String nmCupom) {
		this.nmCupom = nmCupom;
	}

	public double getVlPercentualDesconto() {
		return vlPercentualDesconto;
	}

	public void setVlPercentualDesconto(double vlPercentualDesconto) {
		this.vlPercentualDesconto = vlPercentualDesconto;
	}

	public int getQtdLimiteUso() {
		return qtdLimiteUso;
	}

	public void setQtdLimiteUso(int qtdLimiteUso) {
		this.qtdLimiteUso = qtdLimiteUso;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}	
}
