package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.ProductoCaracteristicaRequest;
import com.pe.app.backoffice.model.request.ProductoDetalleRequest;
import com.pe.app.backoffice.model.request.ProductoGrupoPrecioRequest;
import com.pe.app.backoffice.model.request.ProductoRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface ProductoService {

	public DataResponse listarProducto(ProductoRequest request) throws Exception;
	public DataResponse eliminarProducto(ProductoRequest request) throws Exception;
	public DataResponse procesaProducto(ProductoRequest request) throws Exception;
	public DataResponse procesaProductoPrecio(ProductoRequest request) throws Exception;
	public DataResponse listarProductoGrupoPrecio(ProductoGrupoPrecioRequest request) throws Exception;
	public DataResponse procesaProductoGrupoPrecio(ProductoGrupoPrecioRequest request) throws Exception;
	public DataResponse eliminarProductoGrupoPrecio(ProductoGrupoPrecioRequest request) throws Exception;
	public DataResponse listarProductoCaracteristica(ProductoCaracteristicaRequest request) throws Exception;
	public DataResponse procesaProductoDetalle(ProductoDetalleRequest request) throws Exception;
	public DataResponse eliminarProductoDetalle(ProductoDetalleRequest request) throws Exception;
	public DataResponse listarProductoDetalle(ProductoDetalleRequest request) throws Exception;
	public DataResponse listarProductoHistorialPrecio(ProductoRequest request) throws Exception;
}
