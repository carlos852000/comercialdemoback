package com.pe.app.transversal.model.response;

public class DataResponseDB {

	private int idoperacion;
	private String mensaje;
	private int filasafectadas;
	private int resultado;

	public int getFilasafectadas() {
		return filasafectadas;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void setFilasafectadas(int filasafectadas) {
		this.filasafectadas = filasafectadas;
	}

	public int getIdoperacion() {
		return idoperacion;
	}

	public void setIdoperacion(int idoperacion) {
		this.idoperacion = idoperacion;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

}