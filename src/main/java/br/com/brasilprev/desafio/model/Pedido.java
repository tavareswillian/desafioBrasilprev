package br.com.brasilprev.desafio.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.brasilprev.desafio.util.FormaPagamento;
import br.com.brasilprev.desafio.util.StatusPagamento;

@Entity
@Table(name="TB_PEDIDO")
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPedido;
	
	private Produto produto;
	
	private FormaPagamento formaPagamento;
	
	private double vlTotal;
	
	private Date dtVenda;
	
	private Long idCliente;
	
	private StatusPagamento statusPagamento;
	
	private Long idNotaFiscal;
	
	private Parcela parcela;

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Produto getListaProdutos() {
		return produto;
	}

	public void setListaProdutos(Produto produto) {
		this.produto = produto;
	}

	public double getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(double vlTotal) {
		this.vlTotal = vlTotal;
	}

	public Date getDtVenda() {
		return dtVenda;
	}

	public void setDtVenda(Date dtVenda) {
		this.dtVenda = dtVenda;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(Long idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Parcela getParcela() {
		return parcela;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public StatusPagamento getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(StatusPagamento statusPagamento) {
		this.statusPagamento = statusPagamento;
	}	
}
