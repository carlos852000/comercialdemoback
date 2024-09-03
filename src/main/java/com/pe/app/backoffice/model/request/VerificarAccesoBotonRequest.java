package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class VerificarAccesoBotonRequest extends BaseBeanRequest{
	private Integer idacceso;
	private Integer idopcionboton;
	private String nombreboton;
	public Integer getIdacceso() {
		return idacceso;
	}
	public void setIdacceso(Integer idacceso) {
		this.idacceso = idacceso;
	}
	public Integer getIdopcionboton() {
		return idopcionboton;
	}
	public void setIdopcionboton(Integer idopcionboton) {
		this.idopcionboton = idopcionboton;
	}
	public String getNombreboton() {
		return nombreboton;
	}
	public void setNombreboton(String nombreboton) {
		this.nombreboton = nombreboton;
	}
	
	
}
