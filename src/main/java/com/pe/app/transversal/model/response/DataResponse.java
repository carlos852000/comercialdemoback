package com.pe.app.transversal.model.response;

public class DataResponse {

	private String mensaje;
	private Object dato;
	private Integer totalFilas;
	private Integer totalPages;
	private Integer cregistro;

	public Integer getTotalFilas() {
		return totalFilas;
	}

	public void setTotalFilas(Integer totalFilas) {
		this.totalFilas = totalFilas;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	private int resultado;

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Object getDato() {
		return this.dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public Integer getCregistro() {
		return cregistro;
	}

	public void setCregistro(Integer cregistro) {
		this.cregistro = cregistro;
	}

}