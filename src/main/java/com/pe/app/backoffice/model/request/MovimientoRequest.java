package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class MovimientoRequest extends BaseBeanRequest {
	private Integer tipoAccion;
	private Integer idmovimiento;
	private Integer idproveedor;
	private String nomProveedor;
	private Integer idtiendaOrigen;
	private Integer idtienda;
	private Integer idtipodocumento;
	private String numdocumento;
	private Integer idestadomovimiento;
	private Integer idestadomovimiento_secundario;
	private Integer idtipomovimiento;
	private Integer idtabla;
	private Float montosinigv;
	private Float montoconigv;
	private Float montototal;
	private String referenciamovimiento;
	private String observacion;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	private Integer nromovimiento; //Solo para el Front
	private Integer nromodulo; //Solo para el Front
	private String concepto;
	public Integer getTipoAccion() {
		return tipoAccion;
	}
	public void setTipoAccion(Integer tipoAccion) {
		this.tipoAccion = tipoAccion;
	}
	public Integer getIdmovimiento() {
		return idmovimiento;
	}
	public void setIdmovimiento(Integer idmovimiento) {
		this.idmovimiento = idmovimiento;
	}
	public Integer getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}
	public String getNomProveedor() {
		return nomProveedor;
	}
	public void setNomProveedor(String nomProveedor) {
		this.nomProveedor = nomProveedor;
	}
	public Integer getIdtienda() {
		return idtienda;
	}
	public void setIdtienda(Integer idtienda) {
		this.idtienda = idtienda;
	}
	public Integer getIdtipodocumento() {
		return idtipodocumento;
	}
	public void setIdtipodocumento(Integer idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}
	public String getNumdocumento() {
		return numdocumento;
	}
	public void setNumdocumento(String numdocumento) {
		this.numdocumento = numdocumento;
	}
	public Integer getIdestadomovimiento() {
		return idestadomovimiento;
	}
	public void setIdestadomovimiento(Integer idestadomovimiento) {
		this.idestadomovimiento = idestadomovimiento;
	}
	public Integer getIdestadomovimiento_secundario() {
		return idestadomovimiento_secundario;
	}
	public void setIdestadomovimiento_secundario(Integer idestadomovimiento_secundario) {
		this.idestadomovimiento_secundario = idestadomovimiento_secundario;
	}
	public Integer getIdtipomovimiento() {
		return idtipomovimiento;
	}
	public void setIdtipomovimiento(Integer idtipomovimiento) {
		this.idtipomovimiento = idtipomovimiento;
	}
	public Integer getIdtabla() {
		return idtabla;
	}
	public void setIdtabla(Integer idtabla) {
		this.idtabla = idtabla;
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
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
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
	public Integer getNromovimiento() {
		return nromovimiento;
	}
	public void setNromovimiento(Integer nromovimiento) {
		this.nromovimiento = nromovimiento;
	}
	public Integer getNromodulo() {
		return nromodulo;
	}
	public void setNromodulo(Integer nromodulo) {
		this.nromodulo = nromodulo;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getReferenciamovimiento() {
		return referenciamovimiento;
	}
	public void setReferenciamovimiento(String referenciamovimiento) {
		this.referenciamovimiento = referenciamovimiento;
	}
	public Integer getIdtiendaOrigen() {
		return idtiendaOrigen;
	}
	public void setIdtiendaOrigen(Integer idtiendaOrigen) {
		this.idtiendaOrigen = idtiendaOrigen;
	}
}
