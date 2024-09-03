package com.pe.app.backoffice.model.response;

public class ListarMovimientoDetalleResponse {
	private Integer idmovimientodetalle;
	private Integer idmovimiento;
	private Integer idproducto;
	private Integer idproductodetalle;
	private Integer idestadomovimiento;
	private String nombreProducto;
	private Integer stock;
	private Integer cantidad;
	private Integer idunidadmedida;
	private Float preciocosto;
	private Float total;
	private String unidadmedida;
	private String marca;
	private String representante;
	public Integer getIdmovimientodetalle() {
		return idmovimientodetalle;
	}
	public void setIdmovimientodetalle(Integer idmovimientodetalle) {
		this.idmovimientodetalle = idmovimientodetalle;
	}
	public Integer getIdmovimiento() {
		return idmovimiento;
	}
	public void setIdmovimiento(Integer idmovimiento) {
		this.idmovimiento = idmovimiento;
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
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
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
	public Integer getIdestadomovimiento() {
		return idestadomovimiento;
	}
	public void setIdestadomovimiento(Integer idestadomovimiento) {
		this.idestadomovimiento = idestadomovimiento;
	}
	
}
