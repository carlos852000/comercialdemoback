package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.app.backoffice.model.request.ProveedorRequest;
import com.pe.app.backoffice.model.response.EliminarProveedorResponse;
import com.pe.app.backoffice.model.response.ListarProveedorResponse;
import com.pe.app.backoffice.model.response.ProcesaProveedorResponse;
import com.pe.app.backoffice.repository.ProveedorMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	public ProveedorMapper mapper;

	@Override
	public DataResponse listarProveedor(ProveedorRequest request) throws Exception {
		List<ListarProveedorResponse> dataDB = mapper.listarProveedor(request);
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
	public DataResponse procesaProveedor(ProveedorRequest request) throws Exception {
		ProcesaProveedorResponse dataDB = mapper.procesaProveedor(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse eliminarProveedor(ProveedorRequest request) throws Exception {
		EliminarProveedorResponse dataDB = mapper.eliminarProveedor(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

}
