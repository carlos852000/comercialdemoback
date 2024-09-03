package com.pe.app.backoffice.model.response;

public class ListarRubroCaracteristicaResponse {
	private Integer idrubrocaracteristica;
	private Integer idrubro;
	private Integer idcaracteristica;
	private String descripcion;

	public Integer getIdrubrocaracteristica() {
		return idrubrocaracteristica;
	}

	public void setIdrubrocaracteristica(Integer idrubrocaracteristica) {
		this.idrubrocaracteristica = idrubrocaracteristica;
	}

	public Integer getIdrubro() {
		return idrubro;
	}

	public void setIdrubro(Integer idrubro) {
		this.idrubro = idrubro;
	}

	public Integer getIdcaracteristica() {
		return idcaracteristica;
	}

	public void setIdcaracteristica(Integer idcaracteristica) {
		this.idcaracteristica = idcaracteristica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
