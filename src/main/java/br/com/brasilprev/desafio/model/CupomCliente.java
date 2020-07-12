package br.com.brasilprev.desafio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CUPOM_CLIENTE")
public class CupomCliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCupomCliente;
	
	private Long idCupomPromocao;
	
	private int nbQtdUso;
	
	private Long idCliente;

	public Long getIdCupomCliente() {
		return idCupomCliente;
	}

	public void setIdCupomCliente(Long idCupomCliente) {
		this.idCupomCliente = idCupomCliente;
	}

	public Long getIdCupomPromocao() {
		return idCupomPromocao;
	}

	public void setIdCupomPromocao(Long idCupomPromocao) {
		this.idCupomPromocao = idCupomPromocao;
	}

	public int getNbQtdUso() {
		return nbQtdUso;
	}

	public void setNbQtdUso(int nbQtdUso) {
		this.nbQtdUso = nbQtdUso;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
}
