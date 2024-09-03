package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class ConfiguracionRequest extends BaseBeanRequest {
	private Integer idconfiguracion;
	private String empresa;
	private String direccion;
	private String ruc;
	private String telefono;
	private Float igv;
	private Float cambiodolar;
	private Integer indicadorfactelectronica;
	private Integer idrubro;
	private String codigoproductointerno;
	private Integer diasnovedad;
	private Integer indicadordctsventas;
	private Integer indicadorprecioporlocal;
	private Integer indicadorprecioporgrupos;
	private Integer gestionarstock;
	private Integer indicadorenviarcorreocliente;
	private Integer indicadordesagregarproducto;
	private Integer nummostrarprodventas;
	private Integer nummostrarprodcompras;
	private Integer indicadoretiquetaprodsinstock;
	private String etiquetaprodsinstock;
	private Integer indicadoretiquetaprodconstockmin;
	private String etiquetaprodconstockmin;
	private Integer indicadoretiquetaprodconstock;
	private String etiquetaprodconstock;
	private String correoenvio;
	public Integer getIdconfiguracion() {
		return idconfiguracion;
	}
	public void setIdconfiguracion(Integer idconfiguracion) {
		this.idconfiguracion = idconfiguracion;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Float getIgv() {
		return igv;
	}
	public void setIgv(Float igv) {
		this.igv = igv;
	}
	public Float getCambiodolar() {
		return cambiodolar;
	}
	public void setCambiodolar(Float cambiodolar) {
		this.cambiodolar = cambiodolar;
	}
	public Integer getIndicadorfactelectronica() {
		return indicadorfactelectronica;
	}
	public void setIndicadorfactelectronica(Integer indicadorfactelectronica) {
		this.indicadorfactelectronica = indicadorfactelectronica;
	}
	public Integer getIdrubro() {
		return idrubro;
	}
	public void setIdrubro(Integer idrubro) {
		this.idrubro = idrubro;
	}
	public String getCodigoproductointerno() {
		return codigoproductointerno;
	}
	public void setCodigoproductointerno(String codigoproductointerno) {
		this.codigoproductointerno = codigoproductointerno;
	}
	public Integer getDiasnovedad() {
		return diasnovedad;
	}
	public void setDiasnovedad(Integer diasnovedad) {
		this.diasnovedad = diasnovedad;
	}
	public Integer getIndicadordctsventas() {
		return indicadordctsventas;
	}
	public void setIndicadordctsventas(Integer indicadordctsventas) {
		this.indicadordctsventas = indicadordctsventas;
	}
	public Integer getIndicadorprecioporlocal() {
		return indicadorprecioporlocal;
	}
	public void setIndicadorprecioporlocal(Integer indicadorprecioporlocal) {
		this.indicadorprecioporlocal = indicadorprecioporlocal;
	}
	public Integer getIndicadorprecioporgrupos() {
		return indicadorprecioporgrupos;
	}
	public void setIndicadorprecioporgrupos(Integer indicadorprecioporgrupos) {
		this.indicadorprecioporgrupos = indicadorprecioporgrupos;
	}
	public Integer getGestionarstock() {
		return gestionarstock;
	}
	public void setGestionarstock(Integer gestionarstock) {
		this.gestionarstock = gestionarstock;
	}
	public Integer getIndicadorenviarcorreocliente() {
		return indicadorenviarcorreocliente;
	}
	public void setIndicadorenviarcorreocliente(Integer indicadorenviarcorreocliente) {
		this.indicadorenviarcorreocliente = indicadorenviarcorreocliente;
	}
	public Integer getIndicadordesagregarproducto() {
		return indicadordesagregarproducto;
	}
	public void setIndicadordesagregarproducto(Integer indicadordesagregarproducto) {
		this.indicadordesagregarproducto = indicadordesagregarproducto;
	}
	public Integer getNummostrarprodventas() {
		return nummostrarprodventas;
	}
	public void setNummostrarprodventas(Integer nummostrarprodventas) {
		this.nummostrarprodventas = nummostrarprodventas;
	}
	public Integer getNummostrarprodcompras() {
		return nummostrarprodcompras;
	}
	public void setNummostrarprodcompras(Integer nummostrarprodcompras) {
		this.nummostrarprodcompras = nummostrarprodcompras;
	}
	public Integer getIndicadoretiquetaprodsinstock() {
		return indicadoretiquetaprodsinstock;
	}
	public void setIndicadoretiquetaprodsinstock(Integer indicadoretiquetaprodsinstock) {
		this.indicadoretiquetaprodsinstock = indicadoretiquetaprodsinstock;
	}
	public String getEtiquetaprodsinstock() {
		return etiquetaprodsinstock;
	}
	public void setEtiquetaprodsinstock(String etiquetaprodsinstock) {
		this.etiquetaprodsinstock = etiquetaprodsinstock;
	}
	public Integer getIndicadoretiquetaprodconstockmin() {
		return indicadoretiquetaprodconstockmin;
	}
	public void setIndicadoretiquetaprodconstockmin(Integer indicadoretiquetaprodconstockmin) {
		this.indicadoretiquetaprodconstockmin = indicadoretiquetaprodconstockmin;
	}
	public String getEtiquetaprodconstockmin() {
		return etiquetaprodconstockmin;
	}
	public void setEtiquetaprodconstockmin(String etiquetaprodconstockmin) {
		this.etiquetaprodconstockmin = etiquetaprodconstockmin;
	}
	public Integer getIndicadoretiquetaprodconstock() {
		return indicadoretiquetaprodconstock;
	}
	public void setIndicadoretiquetaprodconstock(Integer indicadoretiquetaprodconstock) {
		this.indicadoretiquetaprodconstock = indicadoretiquetaprodconstock;
	}
	public String getEtiquetaprodconstock() {
		return etiquetaprodconstock;
	}
	public void setEtiquetaprodconstock(String etiquetaprodconstock) {
		this.etiquetaprodconstock = etiquetaprodconstock;
	}
	public String getCorreoenvio() {
		return correoenvio;
	}
	public void setCorreoenvio(String correoenvio) {
		this.correoenvio = correoenvio;
	}

}
