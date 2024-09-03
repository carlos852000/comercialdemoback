package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.pe.app.backoffice.model.request.MovimientoDetalleRequest;
import com.pe.app.backoffice.model.request.MovimientoRequest;
import com.pe.app.backoffice.model.request.ProductoRequest;
import com.pe.app.backoffice.model.response.ListarKardexResponse;
import com.pe.app.backoffice.model.response.ListarKardexTiendasResponse;
import com.pe.app.backoffice.model.response.ListarMovimientoDetalleResponse;
import com.pe.app.backoffice.model.response.ListarMovimientoResponse;
import com.pe.app.transversal.model.response.DataResponseDB;

@Mapper
public interface MovimientoMapper {

	DataResponseDB abrirCompra(MovimientoRequest request) throws Exception;
	ListarMovimientoResponse verificarMovimientoxId(MovimientoRequest request) throws Exception;
	ListarMovimientoResponse verificarMovimientoxIdUsuario(MovimientoRequest request) throws Exception;
	List<ListarMovimientoResponse> listarMovimientos(MovimientoRequest request) throws Exception;
	DataResponseDB procesaPreMovimiento(MovimientoRequest request) throws Exception;
	DataResponseDB procesaMovimiento(MovimientoRequest request) throws Exception;
	DataResponseDB eliminaMovimiento(MovimientoRequest request) throws Exception;
	List<ListarMovimientoDetalleResponse> listarMovimientosDetalle(MovimientoDetalleRequest request) throws Exception;
	ListarMovimientoDetalleResponse verificarMovimientosDetallexId(MovimientoDetalleRequest request) throws Exception;
	DataResponseDB procesaMovimientoDetalle(MovimientoDetalleRequest request) throws Exception;
	DataResponseDB eliminaMovimientoDetalle(MovimientoDetalleRequest request) throws Exception;
	List<ListarKardexResponse> listarKardex(ProductoRequest request) throws Exception;
	List<ListarKardexTiendasResponse> listarKardexTiendas(ProductoRequest request) throws Exception;
}
