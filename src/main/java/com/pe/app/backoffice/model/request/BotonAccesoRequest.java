package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class BotonAccesoRequest extends BaseBeanRequest{
	private Integer idopcion;

	public Integer getIdopcion() {
		return idopcion;
	}

	public void setIdopcion(Integer idopcion) {
		this.idopcion = idopcion;
	}

}
