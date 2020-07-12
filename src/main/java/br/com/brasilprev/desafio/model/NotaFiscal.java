package br.com.brasilprev.desafio.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_NOTA_FISCAL")
public class NotaFiscal implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idNotaFiscal;
	
	private Long idCliente;
	
	private Long idCategoria;
	
	private String nmNotaFiscal;
	
	private String notaFiscalB64;

	public Long getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(Long idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNmNotaFiscal() {
		return nmNotaFiscal;
	}

	public void setNmNotaFiscal(String nmNotaFiscal) {
		this.nmNotaFiscal = nmNotaFiscal;
	}

	public String getNotaFiscalB64() {
		return notaFiscalB64;
	}

	public void setNotaFiscalB64(String notaFiscalB64) {
		this.notaFiscalB64 = notaFiscalB64;
	}
}
