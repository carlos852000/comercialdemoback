package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class SistemaRequest extends BaseBeanRequest{
	private Integer idsistema;
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
