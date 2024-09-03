package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class CatalogoRequest extends BaseBeanRequest {

	private Integer tipoaccion;
	private Integer idcatalogo;
	private Integer idcatalogopadre;
	private Integer indicadormodificable;
	private String descripcion;
	private String abreviatura;
	private Integer idusuariosistema;
	private Integer idcatalogodetalle;
	public Integer getTipoaccion() {
		return tipoaccion;
	}
	public void setTipoaccion(Integer tipoaccion) {
		this.tipoaccion = tipoaccion;
	}
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
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public Integer getIdusuariosistema() {
		return idusuariosistema;
	}
	public void setIdusuariosistema(Integer idusuariosistema) {
		this.idusuariosistema = idusuariosistema;
	}
	public Integer getIdcatalogodetalle() {
		return idcatalogodetalle;
	}
	public void setIdcatalogodetalle(Integer idcatalogodetalle) {
		this.idcatalogodetalle = idcatalogodetalle;
	}

	

}
