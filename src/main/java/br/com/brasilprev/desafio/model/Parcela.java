package br.com.brasilprev.desafio.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.brasilprev.desafio.util.StatusPagamento;

@Entity
@Table(name="TB_PARCELA")
public class Parcela implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idParcela;
	
	private double vlParcela;
	
	private Date dtVencimento;
	
	private StatusPagamento statusPagamento;
	
	private double vljurosAtraso;

	public Long getIdParcela() {
		return idParcela;
	}

	public void setIdParcela(Long idParcela) {
		this.idParcela = idParcela;
	}

	public double getVlParcela() {
		return vlParcela;
	}

	public void setVlParcela(double vlParcela) {
		this.vlParcela = vlParcela;
	}

	public Date getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public StatusPagamento getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(StatusPagamento statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public double getVljurosAtraso() {
		return vljurosAtraso;
	}

	public void setVljurosAtraso(double vljurosAtraso) {
		this.vljurosAtraso = vljurosAtraso;
	}
}
