package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.CompraDetalleRequest;
import com.pe.app.backoffice.model.request.CompraRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface CompraService {
	public DataResponse listarCompra(CompraRequest request) throws Exception;
	public DataResponse verificarCompraxIdUsuario(CompraRequest request) throws Exception;
	public DataResponse procesaCompra(CompraRequest request) throws Exception;
	public DataResponse procesaPreCompra(CompraRequest request) throws Exception;
	public DataResponse eliminarCompra(CompraRequest request) throws Exception;
	public DataResponse listarCompraDetallexId(CompraDetalleRequest request) throws Exception;
	public DataResponse procesaCompraDetalle(CompraDetalleRequest request) throws Exception;
	public DataResponse eliminarCompraDetalle(CompraDetalleRequest request) throws Exception;
}
