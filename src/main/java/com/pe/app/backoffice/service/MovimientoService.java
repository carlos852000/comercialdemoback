package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.MovimientoDetalleRequest;
import com.pe.app.backoffice.model.request.MovimientoRequest;
import com.pe.app.backoffice.model.request.ProductoRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface MovimientoService {

	public DataResponse buscarCompra(MovimientoRequest request) throws Exception;
	public DataResponse verificarMovimientoSalidaTransfxIdUsuario(MovimientoRequest request) throws Exception;
	public DataResponse listarIngresosCompras(MovimientoRequest request) throws Exception;
	public DataResponse listarIngresosTransferencias(MovimientoRequest request) throws Exception;
	public DataResponse listarIngresosOtros(MovimientoRequest request) throws Exception;
	public DataResponse listarSalidasTransferencias(MovimientoRequest request) throws Exception;
	public DataResponse procesaPreMovimientoSalidaTransferencia(MovimientoRequest request) throws Exception;
	public DataResponse procesaMovimientoIngCompras(MovimientoRequest request) throws Exception;
	public DataResponse procesaMovimientoSalTransferencias(MovimientoRequest request) throws Exception;
	public DataResponse eliminaMovimiento(MovimientoRequest request) throws Exception;
	public DataResponse listarMovimientosDetalle(MovimientoDetalleRequest request) throws Exception;
	public DataResponse procesaMovimientoDetalleSalidaTransferencia(MovimientoDetalleRequest request) throws Exception;
	public DataResponse eliminaMovimientoDetalle(MovimientoDetalleRequest request) throws Exception;
	public DataResponse listarKardex(ProductoRequest request) throws Exception;
	public DataResponse listarKardexTiendas(ProductoRequest request) throws Exception;
}
