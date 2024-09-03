package com.pe.app.backoffice.model.response;

import java.util.Date;

public class ListarProductosHistorialPrecioResponse {
	private Integer idhistorialprecio;
	private Float preciocosto;
	private Float margenutilidad;
	private Float preciosinimp;
	private Integer igv;
	private Float igvvalor;
	private Float preciounitario;
	private Float preciofinal;
	private String motivoBD;
	private Date fecharegistra;
	private Integer ultimoregistro;
	private String numerodocumento;
	private String usuario;
	public Integer getIdhistorialprecio() {
		return idhistorialprecio;
	}
	public void setIdhistorialprecio(Integer idhistorialprecio) {
		this.idhistorialprecio = idhistorialprecio;
	}
	public Float getPreciocosto() {
		return preciocosto;
	}
	public void setPreciocosto(Float preciocosto) {
		this.preciocosto = preciocosto;
	}
	public Float getMargenutilidad() {
		return margenutilidad;
	}
	public void setMargenutilidad(Float margenutilidad) {
		this.margenutilidad = margenutilidad;
	}
	public Float getPreciosinimp() {
		return preciosinimp;
	}
	public void setPreciosinimp(Float preciosinimp) {
		this.preciosinimp = preciosinimp;
	}
	public Integer getIgv() {
		return igv;
	}
	public void setIgv(Integer igv) {
		this.igv = igv;
	}
	public Float getIgvvalor() {
		return igvvalor;
	}
	public void setIgvvalor(Float igvvalor) {
		this.igvvalor = igvvalor;
	}
	public Float getPreciounitario() {
		return preciounitario;
	}
	public void setPreciounitario(Float preciounitario) {
		this.preciounitario = preciounitario;
	}
	public Float getPreciofinal() {
		return preciofinal;
	}
	public void setPreciofinal(Float preciofinal) {
		this.preciofinal = preciofinal;
	}
	public String getMotivoBD() {
		return motivoBD;
	}
	public void setMotivoBD(String motivoBD) {
		this.motivoBD = motivoBD;
	}
	public Date getFecharegistra() {
		return fecharegistra;
	}
	public void setFecharegistra(Date fecharegistra) {
		this.fecharegistra = fecharegistra;
	}
	public Integer getUltimoregistro() {
		return ultimoregistro;
	}
	public void setUltimoregistro(Integer ultimoregistro) {
		this.ultimoregistro = ultimoregistro;
	}
	public String getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
}
