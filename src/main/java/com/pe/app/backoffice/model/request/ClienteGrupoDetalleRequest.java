package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class ClienteGrupoDetalleRequest extends BaseBeanRequest {
	private Integer idclientegrupodet;
	private Integer idclientegrupo;
	private Integer idcliente;
	private String cliente;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	public Integer getIdclientegrupodet() {
		return idclientegrupodet;
	}
	public void setIdclientegrupodet(Integer idclientegrupodet) {
		this.idclientegrupodet = idclientegrupodet;
	}
	public Integer getIdclientegrupo() {
		return idclientegrupo;
	}
	public void setIdclientegrupo(Integer idclientegrupo) {
		this.idclientegrupo = idclientegrupo;
	}
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Integer getTotalFilasPorPage() {
		return totalFilasPorPage;
	}
	public void setTotalFilasPorPage(Integer totalFilasPorPage) {
		this.totalFilasPorPage = totalFilasPorPage;
	}
	public Integer getNroPage() {
		return nroPage;
	}
	public void setNroPage(Integer nroPage) {
		this.nroPage = nroPage;
	}
	public Integer getTotalFilas() {
		return totalFilas;
	}
	public void setTotalFilas(Integer totalFilas) {
		this.totalFilas = totalFilas;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	
}
