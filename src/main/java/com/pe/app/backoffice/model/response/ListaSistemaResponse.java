package com.pe.app.backoffice.model.response;

public class ListaSistemaResponse {
	private Integer idsistema;
	private Integer idmodulo;
	private String nombre;
	private String abreviatura;
	private String version;
	private String enlace;
	public Integer getIdsistema() {
		return idsistema;
	}
	public void setIdsistema(Integer idsistema) {
		this.idsistema = idsistema;
	}
	public Integer getIdmodulo() {
		return idmodulo;
	}
	public void setIdmodulo(Integer idmodulo) {
		this.idmodulo = idmodulo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	
	
	
}
