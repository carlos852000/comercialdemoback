package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.AlertaRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface AlertaService {

	public DataResponse listarAlerta(AlertaRequest request) throws Exception;
	public DataResponse procesaAlerta(AlertaRequest request) throws Exception;
	public DataResponse procesaContadorAlerta(AlertaRequest request) throws Exception;
	public DataResponse eliminarAlerta(AlertaRequest request) throws Exception;

}
