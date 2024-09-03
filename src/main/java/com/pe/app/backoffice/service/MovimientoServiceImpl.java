package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pe.app.backoffice.model.request.MovimientoDetalleRequest;
import com.pe.app.backoffice.model.request.MovimientoRequest;
import com.pe.app.backoffice.model.request.ParametroRequest;
import com.pe.app.backoffice.model.request.ProductoRequest;
import com.pe.app.backoffice.model.response.ListarKardexResponse;
import com.pe.app.backoffice.model.response.ListarKardexTiendasResponse;
import com.pe.app.backoffice.model.response.ListarMovimientoDetalleResponse;
import com.pe.app.backoffice.model.response.ListarMovimientoResponse;
import com.pe.app.backoffice.model.response.VerificaParametroResponse;
import com.pe.app.backoffice.repository.MovimientoMapper;
import com.pe.app.backoffice.repository.ParametroMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.model.response.DataResponseDB;
import com.pe.app.transversal.utils.Funciones;

@Service
public class MovimientoServiceImpl implements MovimientoService {

	@Autowired
	public MovimientoMapper mapper;
	
	@Autowired
	public ParametroMapper parametroMapper;
	
	@Value("${estado.registrado}")
	private String estadoRegistrado;
	
	@Value("${estado.enproceso}")
	private String estadoEnProceso;
	
	@Value("${estado.ingresado}")
	private String estadoIngresado;
	
	@Value("${estado.salida}")
	private String estadoSalida;
	
	@Value("${tipomov.ingresoCompras}")
	private String tipoMovimientoIngresoxCompras;
	
	@Value("${tipomov.ingresoTransferencia}")
	private String tipoMovimientoIngresoxTransferencia;
	
	@Value("${tipomov.ingresoOtros}")
	private String tipoMovimientoIngresoxOtros;
	
	@Value("${tipomov.salidaTransferencia}")
	private String tipoMovimientoSalidasxTransferencias;

	@Override
	public DataResponse buscarCompra(MovimientoRequest request) throws Exception {
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(tipoMovimientoIngresoxCompras);
		VerificaParametroResponse tipoIngresoXCompras = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		ParametroRequest parametroEstadoCompraRequest = new ParametroRequest();
		parametroEstadoCompraRequest.setAbreviatura(estadoRegistrado);
		VerificaParametroResponse estadoCompra = parametroMapper.verificarParametroxAbreviatura(parametroEstadoCompraRequest);
		
		ParametroRequest parametroEstadoMovimientoRequest = new ParametroRequest();
		parametroEstadoMovimientoRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoMovimiento = parametroMapper.verificarParametroxAbreviatura(parametroEstadoMovimientoRequest);
		
		request.setIdtabla(request.getNromodulo());
		request.setIdtipomovimiento(tipoIngresoXCompras.getIdparametro());
		request.setIdestadomovimiento(estadoMovimiento.getIdparametro());
		request.setIdestadomovimiento_secundario(estadoCompra.getIdparametro());
		DataResponseDB dataDB = mapper.abrirCompra(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		if (request.getResultado()==1) {
			MovimientoRequest requestMovimiento = new MovimientoRequest();
			requestMovimiento.setIdmovimiento(request.getCodigo());
			ListarMovimientoResponse dataMovimiento = mapper.verificarMovimientoxId(requestMovimiento);
			dataResponse.setDato(dataMovimiento);
		}else 
		{
			dataResponse.setDato(dataDB);
		}
		dataResponse.setCregistro(request.getCodigo());
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse verificarMovimientoSalidaTransfxIdUsuario(MovimientoRequest request) throws Exception {
		
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoEnProceso = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		ParametroRequest parametroTipoSalidaRequest = new ParametroRequest();
		parametroTipoSalidaRequest.setAbreviatura(tipoMovimientoSalidasxTransferencias);
		VerificaParametroResponse tipoSalidaXTransferencia = parametroMapper.verificarParametroxAbreviatura(parametroTipoSalidaRequest);
		
		request.setIdtipomovimiento(tipoSalidaXTransferencia.getIdparametro());
		request.setIdestadomovimiento(estadoEnProceso.getIdparametro());
		
		ListarMovimientoResponse dataDB = mapper.verificarMovimientoxIdUsuario(request);
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
	public DataResponse listarIngresosCompras(MovimientoRequest request) throws Exception {
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(tipoMovimientoIngresoxCompras);
		VerificaParametroResponse tipoIngresoXCompras = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		request.setIdtabla(request.getNromodulo());
		request.setIdmovimiento(request.getNromovimiento());
		request.setIdtipomovimiento(tipoIngresoXCompras.getIdparametro());
		List<ListarMovimientoResponse> dataDB = mapper.listarMovimientos(request);
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
	public DataResponse listarIngresosTransferencias(MovimientoRequest request) throws Exception {
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(tipoMovimientoIngresoxTransferencia);
		VerificaParametroResponse tipoIngresoXCompras = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		request.setIdtabla(request.getNromodulo());
		request.setIdmovimiento(request.getNromovimiento());
		request.setIdtipomovimiento(tipoIngresoXCompras.getIdparametro());
		List<ListarMovimientoResponse> dataDB = mapper.listarMovimientos(request);
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
	public DataResponse listarIngresosOtros(MovimientoRequest request) throws Exception {
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(tipoMovimientoIngresoxOtros);
		VerificaParametroResponse tipoIngresoXCompras = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		request.setIdtabla(request.getNromodulo());
		request.setIdmovimiento(request.getNromovimiento());
		request.setIdtipomovimiento(tipoIngresoXCompras.getIdparametro());
		List<ListarMovimientoResponse> dataDB = mapper.listarMovimientos(request);
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
	public DataResponse listarSalidasTransferencias(MovimientoRequest request) throws Exception {
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(tipoMovimientoSalidasxTransferencias);
		VerificaParametroResponse tipoIngresoXCompras = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		request.setIdtabla(request.getNromodulo());
		request.setIdmovimiento(request.getNromovimiento());
		request.setIdtipomovimiento(tipoIngresoXCompras.getIdparametro());
		List<ListarMovimientoResponse> dataDB = mapper.listarMovimientos(request);
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
	public DataResponse procesaPreMovimientoSalidaTransferencia(MovimientoRequest request) throws Exception {
		
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoEnProceso = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		ParametroRequest parametroTipoSalidaRequest = new ParametroRequest();
		parametroTipoSalidaRequest.setAbreviatura(tipoMovimientoSalidasxTransferencias);
		VerificaParametroResponse tipoSalidaXTransferencia = parametroMapper.verificarParametroxAbreviatura(parametroTipoSalidaRequest);
		
		request.setIdtipomovimiento(tipoSalidaXTransferencia.getIdparametro());
		request.setIdestadomovimiento(estadoEnProceso.getIdparametro());

		DataResponseDB dataDB = mapper.procesaPreMovimiento(request);

		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		dataResponse.setDato(dataDB);
		dataResponse.setCregistro(request.getCodigo());
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse procesaMovimientoIngCompras(MovimientoRequest request) throws Exception {
		
		//OBTENGO EL ESTADO
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(estadoIngresado);
		VerificaParametroResponse estadoIngresado = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		request.setConcepto("INGRESOXCOMPRA");
		request.setIdestadomovimiento(estadoIngresado.getIdparametro());
		request.setMontototal(request.getMontoconigv() + request.getMontosinigv());

		DataResponseDB dataDB = mapper.procesaMovimiento(request);

		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		dataResponse.setDato(dataDB);
		dataResponse.setCregistro(request.getCodigo());
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse procesaMovimientoSalTransferencias(MovimientoRequest request) throws Exception {
		
		//OBTENGO EL ESTADO
		ParametroRequest parametroRequest = new ParametroRequest();
		parametroRequest.setAbreviatura(estadoSalida);
		VerificaParametroResponse estadoSalida = parametroMapper.verificarParametroxAbreviatura(parametroRequest);
		
		request.setConcepto("SALXTRANSFERENCIAS");
		request.setIdestadomovimiento(estadoSalida.getIdparametro());
		request.setMontototal(request.getMontoconigv() + request.getMontosinigv());

		DataResponseDB dataDB = mapper.procesaMovimiento(request);

		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		dataResponse.setDato(dataDB);
		dataResponse.setCregistro(request.getCodigo());
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse eliminaMovimiento(MovimientoRequest request) throws Exception {
		ParametroRequest parametroEstadoMovimientoRequest = new ParametroRequest();
		parametroEstadoMovimientoRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoMovimiento = parametroMapper.verificarParametroxAbreviatura(parametroEstadoMovimientoRequest);
		
		request.setIdestadomovimiento(estadoMovimiento.getIdparametro());
		DataResponseDB dataDB = mapper.eliminaMovimiento(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse listarMovimientosDetalle(MovimientoDetalleRequest request) throws Exception {
		List<ListarMovimientoDetalleResponse> dataDB = mapper.listarMovimientosDetalle(request);
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
	public DataResponse procesaMovimientoDetalleSalidaTransferencia(MovimientoDetalleRequest request) throws Exception {
	
		ParametroRequest parametroEstadoMovimientoRequest = new ParametroRequest();
		parametroEstadoMovimientoRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoMovimiento = parametroMapper.verificarParametroxAbreviatura(parametroEstadoMovimientoRequest);
		
		MovimientoRequest requestMovimiento = new MovimientoRequest();
		requestMovimiento.setIdmovimiento(request.getIdmovimiento());
		ListarMovimientoResponse dataMovimiento = mapper.verificarMovimientoxId(requestMovimiento);
	
		DataResponse dataResponse = new DataResponse();
		if(dataMovimiento.getIdestadomovimiento() == estadoMovimiento.getIdparametro()) {
			request.setVistobueno(0);
			request.setTotal(request.getCantidad() * request.getPreciocosto());
			DataResponseDB dataDB = mapper.procesaMovimientoDetalle(request);
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
	public DataResponse eliminaMovimientoDetalle(MovimientoDetalleRequest request) throws Exception {
		ParametroRequest parametroEstadoMovimientoRequest = new ParametroRequest();
		parametroEstadoMovimientoRequest.setAbreviatura(estadoEnProceso);
		VerificaParametroResponse estadoMovimiento = parametroMapper.verificarParametroxAbreviatura(parametroEstadoMovimientoRequest);

		ListarMovimientoDetalleResponse dataMovimiento = mapper.verificarMovimientosDetallexId(request);

		DataResponse dataResponse = new DataResponse();
		if(dataMovimiento.getIdestadomovimiento() == estadoMovimiento.getIdparametro()) {
			DataResponseDB dataDB = mapper.eliminaMovimientoDetalle(request);
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
	
	@Override
	public DataResponse listarKardex(ProductoRequest request) throws Exception {
		List<ListarKardexResponse> dataDB = mapper.listarKardex(request);
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
	public DataResponse listarKardexTiendas(ProductoRequest request) throws Exception {
		List<ListarKardexTiendasResponse> dataDB = mapper.listarKardexTiendas(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	

}
