package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class ProductoRequest extends BaseBeanRequest {

	private Integer tipoAccion;
	private Integer idproducto;
	private Integer cproducto;
	private String nombre;
	private String codigointerno;
	private String codigobarra;
	private Integer idproveedor;
	private Integer idmarca;
	private Integer cambioprecio;
	private Integer nuevoproducto;
	private Float preciocostonuevo;
	private Float preciocosto;
	private Float margenutilidad;
	private Float preciosinimp;
	private Integer igv;
	private Float igvvalor;
	private Float preciounitario;
	private Float preciofinal;
	private Integer idmoneda;
	private String imagen;
	private Integer cantidad;
	private Integer cantidadunidad;
	private Integer idunidadmedida;
	private Integer cantidadminparacompra;
	private Integer activoparacompra;
	private Integer cantidadminparaventa;
	private Integer activoparaventa;
	private Integer alertastockminimo;
	private Integer permisostockminimo;
	private String etiquetastock;
	private String etiquetastockmin;
	private String etiquetasinstock;
	private Integer tipoproducto;
	private Integer desagrega;
	private String edades;
	private String modelo;
	private String familia;
	private String genero;
	private Integer redondeo;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	public Integer getTipoAccion() {
		return tipoAccion;
	}
	public void setTipoAccion(Integer tipoAccion) {
		this.tipoAccion = tipoAccion;
	}
	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public Integer getCproducto() {
		return cproducto;
	}
	public void setCproducto(Integer cproducto) {
		this.cproducto = cproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigointerno() {
		return codigointerno;
	}
	public void setCodigointerno(String codigointerno) {
		this.codigointerno = codigointerno;
	}
	public String getCodigobarra() {
		return codigobarra;
	}
	public void setCodigobarra(String codigobarra) {
		this.codigobarra = codigobarra;
	}
	public Integer getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}
	public Integer getIdmarca() {
		return idmarca;
	}
	public void setIdmarca(Integer idmarca) {
		this.idmarca = idmarca;
	}
	public Integer getCambioprecio() {
		return cambioprecio;
	}
	public void setCambioprecio(Integer cambioprecio) {
		this.cambioprecio = cambioprecio;
	}
	public Integer getNuevoproducto() {
		return nuevoproducto;
	}
	public void setNuevoproducto(Integer nuevoproducto) {
		this.nuevoproducto = nuevoproducto;
	}
	public Float getPreciocostonuevo() {
		return preciocostonuevo;
	}
	public void setPreciocostonuevo(Float preciocostonuevo) {
		this.preciocostonuevo = preciocostonuevo;
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
	public Integer getIdmoneda() {
		return idmoneda;
	}
	public void setIdmoneda(Integer idmoneda) {
		this.idmoneda = idmoneda;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getCantidadunidad() {
		return cantidadunidad;
	}
	public void setCantidadunidad(Integer cantidadunidad) {
		this.cantidadunidad = cantidadunidad;
	}
	public Integer getIdunidadmedida() {
		return idunidadmedida;
	}
	public void setIdunidadmedida(Integer idunidadmedida) {
		this.idunidadmedida = idunidadmedida;
	}
	public Integer getCantidadminparacompra() {
		return cantidadminparacompra;
	}
	public void setCantidadminparacompra(Integer cantidadminparacompra) {
		this.cantidadminparacompra = cantidadminparacompra;
	}
	public Integer getActivoparacompra() {
		return activoparacompra;
	}
	public void setActivoparacompra(Integer activoparacompra) {
		this.activoparacompra = activoparacompra;
	}
	public Integer getCantidadminparaventa() {
		return cantidadminparaventa;
	}
	public void setCantidadminparaventa(Integer cantidadminparaventa) {
		this.cantidadminparaventa = cantidadminparaventa;
	}
	public Integer getActivoparaventa() {
		return activoparaventa;
	}
	public void setActivoparaventa(Integer activoparaventa) {
		this.activoparaventa = activoparaventa;
	}
	public Integer getAlertastockminimo() {
		return alertastockminimo;
	}
	public void setAlertastockminimo(Integer alertastockminimo) {
		this.alertastockminimo = alertastockminimo;
	}
	public Integer getPermisostockminimo() {
		return permisostockminimo;
	}
	public void setPermisostockminimo(Integer permisostockminimo) {
		this.permisostockminimo = permisostockminimo;
	}
	public String getEtiquetastock() {
		return etiquetastock;
	}
	public void setEtiquetastock(String etiquetastock) {
		this.etiquetastock = etiquetastock;
	}
	public String getEtiquetastockmin() {
		return etiquetastockmin;
	}
	public void setEtiquetastockmin(String etiquetastockmin) {
		this.etiquetastockmin = etiquetastockmin;
	}
	public String getEtiquetasinstock() {
		return etiquetasinstock;
	}
	public void setEtiquetasinstock(String etiquetasinstock) {
		this.etiquetasinstock = etiquetasinstock;
	}
	public Integer getTipoproducto() {
		return tipoproducto;
	}
	public void setTipoproducto(Integer tipoproducto) {
		this.tipoproducto = tipoproducto;
	}
	public Integer getDesagrega() {
		return desagrega;
	}
	public void setDesagrega(Integer desagrega) {
		this.desagrega = desagrega;
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
	public String getEdades() {
		return edades;
	}
	public void setEdades(String edades) {
		this.edades = edades;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getRedondeo() {
		return redondeo;
	}
	public void setRedondeo(Integer redondeo) {
		this.redondeo = redondeo;
	}
	
}
