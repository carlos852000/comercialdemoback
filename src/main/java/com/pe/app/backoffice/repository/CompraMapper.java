package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.CompraDetalleRequest;
import com.pe.app.backoffice.model.request.CompraRequest;
import com.pe.app.backoffice.model.response.EliminarCompraResponse;
import com.pe.app.backoffice.model.response.ListarCompraDetalleResponse;
import com.pe.app.backoffice.model.response.ListarCompraResponse;
import com.pe.app.backoffice.model.response.ProcesaCompraResponse;
import com.pe.app.backoffice.model.response.VerificarCompraxIdResponse;

@Mapper
public interface CompraMapper {
	List<ListarCompraResponse> listarCompra(CompraRequest request) throws Exception;
	VerificarCompraxIdResponse verificarCompraxId(CompraRequest request) throws Exception;
	VerificarCompraxIdResponse verificarCompraxIdUsuario(CompraRequest request) throws Exception;
	ProcesaCompraResponse procesaCompra(CompraRequest request) throws Exception;
	ProcesaCompraResponse procesaPreCompra(CompraRequest request) throws Exception;
	EliminarCompraResponse eliminarCompra(CompraRequest request) throws Exception;
	ListarCompraDetalleResponse verificarCompraDetallexId(CompraDetalleRequest request) throws Exception;
	List<ListarCompraDetalleResponse> listarCompraDetallexId(CompraDetalleRequest request) throws Exception;
	ProcesaCompraResponse procesaCompraDetalle(CompraDetalleRequest request) throws Exception;
	EliminarCompraResponse eliminarCompraDetalle(CompraDetalleRequest request) throws Exception;
}
