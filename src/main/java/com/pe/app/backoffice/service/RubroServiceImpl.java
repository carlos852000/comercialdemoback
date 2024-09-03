package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.app.backoffice.model.request.RubroRequest;
import com.pe.app.backoffice.model.response.EliminarRubroCaracteristicaResponse;
import com.pe.app.backoffice.model.response.EliminarRubroResponse;
import com.pe.app.backoffice.model.response.EliminarRubroUnidadMedidaResponse;
import com.pe.app.backoffice.model.response.ListarRubroCaracteristicaDetalleResponse;
import com.pe.app.backoffice.model.response.ListarRubroCaracteristicaResponse;
import com.pe.app.backoffice.model.response.ListarRubroResponse;
import com.pe.app.backoffice.model.response.ListarRubroUnidadMedidaResponse;
import com.pe.app.backoffice.model.response.ProcesaRubroCaracteristicaResponse;
import com.pe.app.backoffice.model.response.ProcesaRubroResponse;
import com.pe.app.backoffice.model.response.ProcesaRubroUnidadMedidaResponse;
import com.pe.app.backoffice.repository.RubroMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class RubroServiceImpl implements RubroService {

	@Autowired
	public RubroMapper mapper;

	@Override
	public DataResponse listarRubro(RubroRequest request) throws Exception {
		List<ListarRubroResponse> dataDB = mapper.listarRubro(request);
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
	public DataResponse procesaRubro(RubroRequest request) throws Exception {
		ProcesaRubroResponse dataDB = mapper.procesaRubro(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse eliminarRubro(RubroRequest request) throws Exception {
		EliminarRubroResponse dataDB = mapper.eliminarRubro(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	/////////////////////////
	/// RUBRO UNIDAD MEDIDA///
	/////////////////////////
	@Override
	public DataResponse listarRubroUnidadMedida(RubroRequest request) throws Exception {
		List<ListarRubroUnidadMedidaResponse> dataDB = mapper.listarRubroUnidadMedida(request);
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
	public DataResponse listarRubroUnidadMedidaxRubro(RubroRequest request) throws Exception {
		List<ListarRubroUnidadMedidaResponse> dataDB = mapper.listarRubroUnidadMedidaxRubro(request);
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
	public DataResponse procesaRubroUnidadMedida(RubroRequest request) throws Exception {
		ProcesaRubroUnidadMedidaResponse dataDB = mapper.procesaRubroUnidadMedida(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse eliminarRubroUnidadMedida(RubroRequest request) throws Exception {
		EliminarRubroUnidadMedidaResponse dataDB = mapper.eliminarRubroUnidadMedida(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

/////////////////////////
/// RUBRO CARACTERISTICA///
/////////////////////////
	@Override
	public DataResponse listarRubroCaracteristica(RubroRequest request) throws Exception {
		List<ListarRubroCaracteristicaResponse> dataDB = mapper.listarRubroCaracteristica(request);
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
	public DataResponse procesaRubroCaracteristica(RubroRequest request) throws Exception {
		ProcesaRubroCaracteristicaResponse dataDB = mapper.procesaRubroCaracteristica(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse eliminarRubroCaracteristica(RubroRequest request) throws Exception {
		EliminarRubroCaracteristicaResponse dataDB = mapper.eliminarRubroCaracteristica(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse listarRubroCaracteristicaDetalle(RubroRequest request) throws Exception {
		List<ListarRubroCaracteristicaDetalleResponse> dataDB = mapper.listarRubroCaracteristicaDetalle(request);
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
	public DataResponse listarRubroCaracteristicaDetalleRubro(RubroRequest request) throws Exception {
		List<ListarRubroCaracteristicaDetalleResponse> dataDB = mapper.listarRubroCaracteristicaDetalleRubro(request);
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
	public DataResponse procesaRubroCaracteristicaDetalle(RubroRequest request) throws Exception {
		ProcesaRubroCaracteristicaResponse dataDB = mapper.procesaRubroCaracteristicaDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse eliminarRubroCaracteristicaDetalle(RubroRequest request) throws Exception {
		EliminarRubroCaracteristicaResponse dataDB = mapper.eliminarRubroCaracteristicaDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
}
