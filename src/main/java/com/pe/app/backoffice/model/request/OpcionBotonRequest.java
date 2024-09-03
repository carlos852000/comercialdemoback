package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class OpcionBotonRequest extends BaseBeanRequest{
	private Integer tipoaccion;
	private Integer idopcion;
	private Integer idboton;
	private String boton;
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
	public Integer getIdboton() {
		return idboton;
	}
	public void setIdboton(Integer idboton) {
		this.idboton = idboton;
	}
	public String getBoton() {
		return boton;
	}
	public void setBoton(String boton) {
		this.boton = boton;
	}
	
}
