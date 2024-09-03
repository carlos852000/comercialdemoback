package com.pe.app.backoffice.model.response;

public class ListarRubroUnidadMedidaResponse {
	private Integer idrubrounidadmedida;
	private Integer idrubro;
	private Integer idunidadmedida;
	private Integer cantidad;
	private String descripcion;

	public Integer getIdrubrounidadmedida() {
		return idrubrounidadmedida;
	}

	public void setIdrubrounidadmedida(Integer idrubrounidadmedida) {
		this.idrubrounidadmedida = idrubrounidadmedida;
	}

	public Integer getIdrubro() {
		return idrubro;
	}

	public void setIdrubro(Integer idrubro) {
		this.idrubro = idrubro;
	}

	public Integer getIdunidadmedida() {
		return idunidadmedida;
	}

	public void setIdunidadmedida(Integer idunidadmedida) {
		this.idunidadmedida = idunidadmedida;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
