package br.com.brasilprev.desafio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CARRINHO")
public class Carrinho implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCarrinho;
	
	private Produto produto;
	
	private Long idCliente;
	
	private Long idCupomCliente;
	
	private double vlTotal;

	public Long getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(Long idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setListaProdutos(Produto produto) {
		this.produto = produto;
	}
	
	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getIdCupomCliente() {
		return idCupomCliente;
	}

	public void setIdCupomCliente(Long idCupomCliente) {
		this.idCupomCliente = idCupomCliente;
	}

	public double getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(double vlTotal) {
		this.vlTotal = vlTotal;
	}
}
