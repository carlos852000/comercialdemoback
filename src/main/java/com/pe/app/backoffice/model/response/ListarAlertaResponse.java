package com.pe.app.backoffice.model.response;

public class ListarAlertaResponse {

	private Integer idtienda;
	private Integer idtipoalerta;
	private String asunto;
	private String mensaje;
	private Integer indicadorvisto;

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

	public Integer getIndicadorvisto() {
		return indicadorvisto;
	}

	public void setIndicadorvisto(Integer indicadorvisto) {
		this.indicadorvisto = indicadorvisto;
	}

}
