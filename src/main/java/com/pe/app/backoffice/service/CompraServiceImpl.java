package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pe.app.backoffice.model.request.CompraDetalleRequest;
import com.pe.app.backoffice.model.request.CompraRequest;
import com.pe.app.backoffice.model.request.ParametroRequest;
import com.pe.app.backoffice.model.response.EliminarCompraResponse;
import com.pe.app.backoffice.model.response.ListarCompraDetalleResponse;
import com.pe.app.backoffice.model.response.ListarCompraResponse;
import com.pe.app.backoffice.model.response.ProcesaCompraResponse;
import com.pe.app.backoffice.model.response.VerificaParametroResponse;
import com.pe.app.backoffice.model.response.VerificarCompraxIdResponse;
import com.pe.app.backoffice.repository.CompraMapper;
import com.pe.app.backoffice.repository.ParametroMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class CompraServiceImpl implements CompraService {

	@Autowired
	public CompraMapper mapper;
	
	@Autowired
	public ParametroMapper parametroMapper;

	@Value("${estado.registrado}")
	private String estadoRegistrado;
	
	@Value("${estado.enproceso}")
	private String estadoEnProceso;
	
	@Override
	public DataResponse listarCompra(CompraRequest request) throws Exception {
		request.setIdcompra(request.getNrocompra());
		List<ListarCompraResponse> dataDB = mapper.listarCompra(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		dataResponse.setTotalFilas(request.getTotalFilas());
		dataResponse.setTotalPages(request.getTotalPages());
		return dataResponse;
	}

	@Override
	public DataResponse verificarCompraxIdUsuario(CompraRequest request) throws Exception {
		
		//OBTENGO EL ESTADO
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoEnProceso = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		request.setAprobacion(estadoEnProceso.getIdparametro());
		
		VerificarCompraxIdResponse dataDB = mapper.verificarCompraxIdUsuario(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse procesaPreCompra(CompraRequest request) throws Exception {
		
		//OBTENGO EL ESTADO
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoEnProceso = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		request.setAprobacion(estadoEnProceso.getIdparametro());
				
		ProcesaCompraResponse dataDB = mapper.procesaPreCompra(request);
		Integer idCodigo = request.getCodigo();
		Integer idResultado = request.getResultado();
		String msj = request.getMensaje();
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		if (request.getResultado()==1) {
			CompraRequest requestNew = new CompraRequest();
			requestNew.setIdcompra(idCodigo);
			VerificarCompraxIdResponse dataDBOK = mapper.verificarCompraxId(requestNew);
			dataResponse.setDato(dataDBOK);
			dataResponse.setCregistro(idCodigo);
			dataResponse.setResultado(idResultado);
			dataResponse.setMensaje(msj);
		} else 
		{
			dataResponse.setDato(dataDB);
			dataResponse.setCregistro(request.getCodigo());
			dataResponse.setResultado(request.getResultado());
			dataResponse.setMensaje(request.getMensaje());
		}
		return dataResponse;
	}
	
	@Override
	public DataResponse procesaCompra(CompraRequest request) throws Exception {
		
		//OBTENGO EL ESTADO
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(estadoRegistrado);
		VerificaParametroResponse estadoRegistrado = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		request.setAprobacion(estadoRegistrado.getIdparametro());
		ProcesaCompraResponse dataDB = mapper.procesaCompra(request);
		Integer idCodigo = request.getCodigo();
		Integer idResultado = request.getResultado();
		String msj = request.getMensaje();
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		if (request.getResultado()==1) {
			CompraRequest requestNew = new CompraRequest();
			requestNew.setIdcompra(idCodigo);
			VerificarCompraxIdResponse dataDBOK = mapper.verificarCompraxId(requestNew);
			dataResponse.setDato(dataDBOK);
			dataResponse.setCregistro(idCodigo);
			dataResponse.setResultado(idResultado);
			dataResponse.setMensaje(msj);
		} else 
		{
			dataResponse.setDato(dataDB);
			dataResponse.setCregistro(request.getCodigo());
			dataResponse.setResultado(request.getResultado());
			dataResponse.setMensaje(request.getMensaje());
		}
		return dataResponse;
	}
	
	@Override
	public DataResponse eliminarCompra(CompraRequest request) throws Exception {
		ParametroRequest parametroEstadoMovimientoRequest = new ParametroRequest();
		parametroEstadoMovimientoRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoEnProceso = parametroMapper.verificarParametroxAbreviatura(parametroEstadoMovimientoRequest);
		
		request.setAprobacion(estadoEnProceso.getIdparametro());
		EliminarCompraResponse dataDB = mapper.eliminarCompra(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse listarCompraDetallexId(CompraDetalleRequest request) throws Exception {
		List<ListarCompraDetalleResponse> dataDB = mapper.listarCompraDetallexId(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse procesaCompraDetalle(CompraDetalleRequest request) throws Exception {
		ParametroRequest parametroEstadoMovimientoRequest = new ParametroRequest();
		parametroEstadoMovimientoRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoMovimiento = parametroMapper.verificarParametroxAbreviatura(parametroEstadoMovimientoRequest);
		
		CompraRequest requestCompra = new CompraRequest();
		requestCompra.setIdcompra(request.getIdcompra());
		VerificarCompraxIdResponse dataCompra = mapper.verificarCompraxId(requestCompra);
		
		DataResponse dataResponse = new DataResponse();
		if(dataCompra.getIdestadocompra() == estadoMovimiento.getIdparametro()) {
			request.setTotal(request.getCantidad() * request.getPreciocosto());
			ProcesaCompraResponse dataDB = mapper.procesaCompraDetalle(request);
			
			Funciones.validar(request);
			dataResponse.setDato(dataDB);
			dataResponse.setResultado(request.getResultado());
			dataResponse.setMensaje(request.getMensaje());
		} else {
			dataResponse.setDato(null);
			dataResponse.setResultado(-1);
			dataResponse.setMensaje("Este registro no puede ser procesado.");
		}
		
		return dataResponse;
	}
	
	@Override
	public DataResponse eliminarCompraDetalle(CompraDetalleRequest request) throws Exception {
		ParametroRequest parametroEstadoMovimientoRequest = new ParametroRequest();
		parametroEstadoMovimientoRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoMovimiento = parametroMapper.verificarParametroxAbreviatura(parametroEstadoMovimientoRequest);
		
		ListarCompraDetalleResponse dataCompra = mapper.verificarCompraDetallexId(request);
		
		DataResponse dataResponse = new DataResponse();
		if(dataCompra.getIdestadocompra() == estadoMovimiento.getIdparametro()) {
			EliminarCompraResponse dataDB = mapper.eliminarCompraDetalle(request);
			Funciones.validar(request);
			dataResponse.setDato(dataDB);
			dataResponse.setResultado(request.getResultado());
			dataResponse.setMensaje(request.getMensaje());
		} else {
			dataResponse.setDato(null);
			dataResponse.setResultado(-1);
			dataResponse.setMensaje("Este registro no puede ser eliminado.");
		}
		return dataResponse;
	}

}
