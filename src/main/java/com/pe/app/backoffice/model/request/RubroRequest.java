package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class RubroRequest extends BaseBeanRequest {
	private Integer idcatalogo;
	private String rubro;
	private String nombre;
	private String abreviatura;
	private Integer idrubro;
	private Integer idrubrounidadmedida;
	private Integer tipoaccion;
	private Integer cantidad;
	private Integer idunidadmedida;
	private Integer idrubrocaracteristica;
	private Integer idrubrocaracteristicadetalle;
	private Integer idcaracteristica;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	public Integer getIdcatalogo() {
		return idcatalogo;
	}
	public void setIdcatalogo(Integer idcatalogo) {
		this.idcatalogo = idcatalogo;
	}
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	public Integer getIdrubro() {
		return idrubro;
	}
	public void setIdrubro(Integer idrubro) {
		this.idrubro = idrubro;
	}
	public Integer getIdrubrounidadmedida() {
		return idrubrounidadmedida;
	}
	public void setIdrubrounidadmedida(Integer idrubrounidadmedida) {
		this.idrubrounidadmedida = idrubrounidadmedida;
	}
	public Integer getTipoaccion() {
		return tipoaccion;
	}
	public void setTipoaccion(Integer tipoaccion) {
		this.tipoaccion = tipoaccion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getIdunidadmedida() {
		return idunidadmedida;
	}
	public void setIdunidadmedida(Integer idunidadmedida) {
		this.idunidadmedida = idunidadmedida;
	}
	public Integer getIdrubrocaracteristica() {
		return idrubrocaracteristica;
	}
	public void setIdrubrocaracteristica(Integer idrubrocaracteristica) {
		this.idrubrocaracteristica = idrubrocaracteristica;
	}
	public Integer getIdcaracteristica() {
		return idcaracteristica;
	}
	public void setIdcaracteristica(Integer idcaracteristica) {
		this.idcaracteristica = idcaracteristica;
	}
	public Integer getTotalFilasPorPage() {
		return totalFilasPorPage;
	}
	public void setTotalFilasPorPage(Integer totalFilasPorPage) {
		this.totalFilasPorPage = totalFilasPorPage;
	}
	public Integer getNroPage() {
		return nroPage;
	}
	public void setNroPage(Integer nroPage) {
		this.nroPage = nroPage;
	}
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdrubrocaracteristicadetalle() {
		return idrubrocaracteristicadetalle;
	}
	public void setIdrubrocaracteristicadetalle(Integer idrubrocaracteristicadetalle) {
		this.idrubrocaracteristicadetalle = idrubrocaracteristicadetalle;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
}
