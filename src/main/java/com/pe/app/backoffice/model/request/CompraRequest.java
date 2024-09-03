package com.pe.app.backoffice.model.request;

import java.util.Date;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class CompraRequest extends BaseBeanRequest {
	private Integer tipoAccion;
	private Integer idcompra;
	private Integer idproveedor;
	private Integer idtienda;
	private Date fechacompra;
	private Date fechaentrega;
	private Integer aprobacion;
	private Integer idtipoemision;
	private Integer incluidoigv;
	private String numdocumento;
	private String referencia;
	private String proveedor;
	private Float montosinigv;
	private Float montoconigv;
	private Float montototal;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	private Integer nrocompra; //Solo para front
	public Integer getTipoAccion() {
		return tipoAccion;
	}
	public void setTipoAccion(Integer tipoAccion) {
		this.tipoAccion = tipoAccion;
	}
	public Integer getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}
	public Integer getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}
	public Integer getIdtienda() {
		return idtienda;
	}
	public void setIdtienda(Integer idtienda) {
		this.idtienda = idtienda;
	}
	public Date getFechacompra() {
		return fechacompra;
	}
	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}
	public Date getFechaentrega() {
		return fechaentrega;
	}
	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}
	public Integer getAprobacion() {
		return aprobacion;
	}
	public void setAprobacion(Integer aprobacion) {
		this.aprobacion = aprobacion;
	}
	public Integer getIdtipoemision() {
		return idtipoemision;
	}
	public void setIdtipoemision(Integer idtipoemision) {
		this.idtipoemision = idtipoemision;
	}
	public Integer getIncluidoigv() {
		return incluidoigv;
	}
	public void setIncluidoigv(Integer incluidoigv) {
		this.incluidoigv = incluidoigv;
	}
	public String getNumdocumento() {
		return numdocumento;
	}
	public void setNumdocumento(String numdocumento) {
		this.numdocumento = numdocumento;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public Float getMontosinigv() {
		return montosinigv;
	}
	public void setMontosinigv(Float montosinigv) {
		this.montosinigv = montosinigv;
	}
	public Float getMontoconigv() {
		return montoconigv;
	}
	public void setMontoconigv(Float montoconigv) {
		this.montoconigv = montoconigv;
	}
	public Float getMontototal() {
		return montototal;
	}
	public void setMontototal(Float montototal) {
		this.montototal = montototal;
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
	public Integer getNrocompra() {
		return nrocompra;
	}
	public void setNrocompra(Integer nrocompra) {
		this.nrocompra = nrocompra;
	}
	
}
