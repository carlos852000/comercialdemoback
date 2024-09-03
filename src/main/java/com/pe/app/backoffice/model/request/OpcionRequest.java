package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class OpcionRequest extends BaseBeanRequest{
	private Integer tipoaccion;
	private Integer idopcion;
	private Integer idmodulo;
	private Integer veropcion;
	private Integer idpadre;
	private Integer idopcionpadre;
	private Integer habilitador;
	private Integer tipoorden;
	private Integer idsistema;
	private String icono;
	private String nombre;
	private String abreviatura;
	private String enlace;
	private Integer destino;
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
	public Integer getIdopcion() {
		return idopcion;
	}
	public void setIdopcion(Integer idopcion) {
		this.idopcion = idopcion;
	}
	public Integer getIdmodulo() {
		return idmodulo;
	}
	public void setIdmodulo(Integer idmodulo) {
		this.idmodulo = idmodulo;
	}
	public Integer getIdpadre() {
		return idpadre;
	}
	public void setIdpadre(Integer idpadre) {
		this.idpadre = idpadre;
	}
	public Integer getIdopcionpadre() {
		return idopcionpadre;
	}
	public void setIdopcionpadre(Integer idopcionpadre) {
		this.idopcionpadre = idopcionpadre;
	}
	public Integer getHabilitador() {
		return habilitador;
	}
	public void setHabilitador(Integer habilitador) {
		this.habilitador = habilitador;
	}
	public Integer getTipoorden() {
		return tipoorden;
	}
	public void setTipoorden(Integer tipoorden) {
		this.tipoorden = tipoorden;
	}
	public Integer getIdsistema() {
		return idsistema;
	}
	public void setIdsistema(Integer idsistema) {
		this.idsistema = idsistema;
	}
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public Integer getDestino() {
		return destino;
	}
	public void setDestino(Integer destino) {
		this.destino = destino;
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
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public Integer getVeropcion() {
		return veropcion;
	}
	public void setVeropcion(Integer veropcion) {
		this.veropcion = veropcion;
	}
	

}
