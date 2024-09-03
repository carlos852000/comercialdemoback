package com.pe.app.backoffice.model.response;

public class VerificaCatalogoResponse {
	private Integer idcatalogo;
	private Integer idcatalogodetalle;
	private String descripcion;
	private String abreviatura;
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
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public Integer getIdcatalogodetalle() {
		return idcatalogodetalle;
	}
	public void setIdcatalogodetalle(Integer idcatalogodetalle) {
		this.idcatalogodetalle = idcatalogodetalle;
	}
	
}
