package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class OpcionAccesoBotonRequest extends BaseBeanRequest{
	private Integer idacceso;
	private Integer idopcionboton;
	private Integer accion;
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
	public Integer getAccion() {
		return accion;
	}
	public void setAccion(Integer accion) {
		this.accion = accion;
	}

}
