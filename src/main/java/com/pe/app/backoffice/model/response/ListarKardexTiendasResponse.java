package com.pe.app.backoffice.model.response;

public class ListarKardexTiendasResponse {
	private String tienda;
	private Integer cantidad;
	private Integer cantidadunid;
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getCantidadunid() {
		return cantidadunid;
	}
	public void setCantidadunid(Integer cantidadunid) {
		this.cantidadunid = cantidadunid;
	}
	
}
