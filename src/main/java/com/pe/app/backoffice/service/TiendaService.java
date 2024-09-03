package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.TiendaRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface TiendaService {

	public DataResponse listarTienda(TiendaRequest request) throws Exception;
	public DataResponse procesaTienda(TiendaRequest request) throws Exception;
	public DataResponse eliminarTienda(TiendaRequest request) throws Exception;

}
