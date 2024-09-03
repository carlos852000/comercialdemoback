package com.pe.app.backoffice.model.response;

public class ListarCompraDetalleResponse {
	private Integer idcompradetalle;
	private Integer idcompra;
	private Integer idproducto;
	private Integer idproductodetalle;
	private String nombreProducto;
	private Integer cantidad;
	private Integer stock;
	private Float preciocosto;
	private Float total;
	private Float pcostohistorico;
	private Integer idunidadmedida;
	private String unidadmedida;
	private String marca;
	private String representante;
	private Integer idestadocompra;
	public Integer getIdcompradetalle() {
		return idcompradetalle;
	}
	public void setIdcompradetalle(Integer idcompradetalle) {
		this.idcompradetalle = idcompradetalle;
	}
	public Integer getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}
	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public Integer getIdproductodetalle() {
		return idproductodetalle;
	}
	public void setIdproductodetalle(Integer idproductodetalle) {
		this.idproductodetalle = idproductodetalle;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Float getPreciocosto() {
		return preciocosto;
	}
	public void setPreciocosto(Float preciocosto) {
		this.preciocosto = preciocosto;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Integer getIdunidadmedida() {
		return idunidadmedida;
	}
	public void setIdunidadmedida(Integer idunidadmedida) {
		this.idunidadmedida = idunidadmedida;
	}
	public String getUnidadmedida() {
		return unidadmedida;
	}
	public void setUnidadmedida(String unidadmedida) {
		this.unidadmedida = unidadmedida;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Float getPcostohistorico() {
		return pcostohistorico;
	}
	public void setPcostohistorico(Float pcostohistorico) {
		this.pcostohistorico = pcostohistorico;
	}
	public Integer getIdestadocompra() {
		return idestadocompra;
	}
	public void setIdestadocompra(Integer idestadocompra) {
		this.idestadocompra = idestadocompra;
	}
	
}
