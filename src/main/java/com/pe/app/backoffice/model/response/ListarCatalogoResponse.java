package com.pe.app.backoffice.model.response;

public class ListarCatalogoResponse {
	private Integer idcatalogo;
	private Integer idcatalogodetalle;
	private Integer idcatalogopadre;
	private Integer indicadormodificable;
	private String descripcion;
	private String abreviatura;

	public Integer getIdcatalogo() {
		return idcatalogo;
	}

	public void setIdcatalogo(Integer idcatalogo) {
		this.idcatalogo = idcatalogo;
	}

	public Integer getIdcatalogopadre() {
		return idcatalogopadre;
	}

	public void setIdcatalogopadre(Integer idcatalogopadre) {
		this.idcatalogopadre = idcatalogopadre;
	}

	public Integer getIndicadormodificable() {
		return indicadormodificable;
	}

	public void setIndicadormodificable(Integer indicadormodificable) {
		this.indicadormodificable = indicadormodificable;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdcatalogodetalle() {
		return idcatalogodetalle;
	}

	public void setIdcatalogodetalle(Integer idcatalogodetalle) {
		this.idcatalogodetalle = idcatalogodetalle;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	

}
