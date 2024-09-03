package com.pe.app.backoffice.model.response;

public class ListarRubroResponse {
	private Integer idrubro;
	private Integer idcatalogo;
	private String descripcion;

	public Integer getIdrubro() {
		return idrubro;
	}

	public void setIdrubro(Integer idrubro) {
		this.idrubro = idrubro;
	}

	public Integer getIdcatalogo() {
		return idcatalogo;
	}

	public void setIdcatalogo(Integer idcatalogo) {
		this.idcatalogo = idcatalogo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
