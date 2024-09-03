package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class CatalogoDetalleRequest extends BaseBeanRequest {
	
	private Integer tipoaccion;
	private Integer tipo;
	private Integer idcatalogodetalle;
	private Integer idcatalogo;
	private String descripcion;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	public Integer getTipoaccion() {
		return tipoaccion;
	}
	public void setTipoaccion(Integer tipoaccion) {
		this.tipoaccion = tipoaccion;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Integer getIdcatalogodetalle() {
		return idcatalogodetalle;
	}
	public void setIdcatalogodetalle(Integer idcatalogodetalle) {
		this.idcatalogodetalle = idcatalogodetalle;
	}
	public Integer getIdcatalogo() {
		return idcatalogo;
	}
	public void setIdcatalogo(Integer idcatalogo) {
		this.idcatalogo = idcatalogo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
