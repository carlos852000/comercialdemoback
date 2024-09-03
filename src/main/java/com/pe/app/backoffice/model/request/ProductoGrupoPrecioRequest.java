package com.pe.app.backoffice.model.request;

import java.util.Date;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class ProductoGrupoPrecioRequest extends BaseBeanRequest {
	private Integer tipoaccion;
	private Integer idproductogrupoprecio;
	private Integer idproducto;
	private String nombre;
	private Integer tipoaplicacion;
	private Integer idclientegrupo;
	private Integer ilimitado;
	private Date fechainicio;
	private Date fechafin;
	private Integer tipocantidad;
	private Integer cantidad;
	private Integer tipodcto;
	private Float descuento;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	public Integer getTipoaccion() {
		return tipoaccion;
	}
	public void setTipoaccion(Integer tipoaccion) {
		this.tipoaccion = tipoaccion;
	}
	public Integer getIdproductogrupoprecio() {
		return idproductogrupoprecio;
	}
	public void setIdproductogrupoprecio(Integer idproductogrupoprecio) {
		this.idproductogrupoprecio = idproductogrupoprecio;
	}
	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTipoaplicacion() {
		return tipoaplicacion;
	}
	public void setTipoaplicacion(Integer tipoaplicacion) {
		this.tipoaplicacion = tipoaplicacion;
	}
	public Integer getIdclientegrupo() {
		return idclientegrupo;
	}
	public void setIdclientegrupo(Integer idclientegrupo) {
		this.idclientegrupo = idclientegrupo;
	}
	public Integer getIlimitado() {
		return ilimitado;
	}
	public void setIlimitado(Integer ilimitado) {
		this.ilimitado = ilimitado;
	}
	public Date getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	public Integer getTipocantidad() {
		return tipocantidad;
	}
	public void setTipocantidad(Integer tipocantidad) {
		this.tipocantidad = tipocantidad;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getTipodcto() {
		return tipodcto;
	}
	public void setTipodcto(Integer tipodcto) {
		this.tipodcto = tipodcto;
	}
	public Float getDescuento() {
		return descuento;
	}
	public void setDescuento(Float descuento) {
		this.descuento = descuento;
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
	
}
