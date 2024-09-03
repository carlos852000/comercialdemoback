package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class TiendaRequest extends BaseBeanRequest {
	private Integer tipoAccion;
	private Integer idtienda;
	private Integer idtipo;
	private String nombre;
	private String telefono;
	private String direccion;
	private String emailtienda;
	private Integer indicadorcentral;
	private Integer idusuariosistema;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	public Integer getTipoAccion() {
		return tipoAccion;
	}
	public void setTipoAccion(Integer tipoAccion) {
		this.tipoAccion = tipoAccion;
	}
	public Integer getIdtienda() {
		return idtienda;
	}
	public void setIdtienda(Integer idtienda) {
		this.idtienda = idtienda;
	}
	public Integer getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(Integer idtipo) {
		this.idtipo = idtipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmailtienda() {
		return emailtienda;
	}
	public void setEmailtienda(String emailtienda) {
		this.emailtienda = emailtienda;
	}
	public Integer getIndicadorcentral() {
		return indicadorcentral;
	}
	public void setIndicadorcentral(Integer indicadorcentral) {
		this.indicadorcentral = indicadorcentral;
	}
	public Integer getIdusuariosistema() {
		return idusuariosistema;
	}
	public void setIdusuariosistema(Integer idusuariosistema) {
		this.idusuariosistema = idusuariosistema;
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
