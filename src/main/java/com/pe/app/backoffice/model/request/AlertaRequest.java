package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class AlertaRequest extends BaseBeanRequest {

	private Integer idtienda;
	private Integer idtipoalerta;
	private String asunto;
	private String mensaje;
	private Integer idusuariosistema;

	public Integer getIdtienda() {
		return idtienda;
	}

	public void setIdtienda(Integer idtienda) {
		this.idtienda = idtienda;
	}

	public Integer getIdtipoalerta() {
		return idtipoalerta;
	}

	public void setIdtipoalerta(Integer idtipoalerta) {
		this.idtipoalerta = idtipoalerta;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Integer getIdusuariosistema() {
		return idusuariosistema;
	}

	public void setIdusuariosistema(Integer idusuariosistema) {
		this.idusuariosistema = idusuariosistema;
	}

}
