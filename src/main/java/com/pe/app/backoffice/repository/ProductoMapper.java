package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.ProductoCaracteristicaRequest;
import com.pe.app.backoffice.model.request.ProductoDetalleRequest;
import com.pe.app.backoffice.model.request.ProductoGrupoPrecioRequest;
import com.pe.app.backoffice.model.request.ProductoRequest;
import com.pe.app.backoffice.model.response.EliminarProductoDetalleResponse;
import com.pe.app.backoffice.model.response.EliminarProductoGrupoPrecioResponse;
import com.pe.app.backoffice.model.response.EliminarProductoResponse;
import com.pe.app.backoffice.model.response.ListarProductosCaracteristicaResponse;
import com.pe.app.backoffice.model.response.ListarProductosDetalleResponse;
import com.pe.app.backoffice.model.response.ListarProductosGrupoPrecioResponse;
import com.pe.app.backoffice.model.response.ListarProductosHistorialPrecioResponse;
import com.pe.app.backoffice.model.response.ListarProductosResponse;
import com.pe.app.backoffice.model.response.ProcesaProductoDetalleResponse;
import com.pe.app.backoffice.model.response.VerificarProductoxIdResponse;
import com.pe.app.backoffice.model.response.ProcesaProductoGrupoPrecioResponse;
import com.pe.app.backoffice.model.response.ProcesaProductoResponse;

@Mapper
public interface ProductoMapper {

	List<ListarProductosResponse> listarProducto(ProductoRequest request) throws Exception;
	VerificarProductoxIdResponse verificarProductoxId(ProductoRequest request) throws Exception;
	EliminarProductoResponse eliminarProducto(ProductoRequest request) throws Exception;
	ProcesaProductoResponse procesaProducto(ProductoRequest request) throws Exception;
	ProcesaProductoResponse procesaProductoPrecio(ProductoRequest request) throws Exception;
	List<ListarProductosGrupoPrecioResponse> listarProductoGrupoPrecio(ProductoGrupoPrecioRequest request) throws Exception;
	ProcesaProductoGrupoPrecioResponse procesaProductoGrupoPrecio(ProductoGrupoPrecioRequest request) throws Exception;
	EliminarProductoGrupoPrecioResponse eliminarProductoGrupoPrecio(ProductoGrupoPrecioRequest request) throws Exception;
	List<ListarProductosCaracteristicaResponse> listarProductoCaracteristica(ProductoCaracteristicaRequest request) throws Exception;
	ProcesaProductoDetalleResponse procesaProductoDetalle(ProductoDetalleRequest request) throws Exception;
	EliminarProductoDetalleResponse eliminarProductoDetalle(ProductoDetalleRequest request) throws Exception;
	List<ListarProductosDetalleResponse> listarProductoDetalle(ProductoDetalleRequest request) throws Exception;
	List<ListarProductosHistorialPrecioResponse> listarProductoHistorialPrecio(ProductoRequest request) throws Exception;
}
