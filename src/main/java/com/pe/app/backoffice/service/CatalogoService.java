package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.CatalogoDetalleRequest;
import com.pe.app.backoffice.model.request.CatalogoRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface CatalogoService {

	public DataResponse verificarCatalogo(CatalogoRequest request) throws Exception;
	public DataResponse verificarCatalogoDetalle(CatalogoRequest request) throws Exception;
	public DataResponse listarCatalogo(CatalogoRequest request) throws Exception;
	public DataResponse listarCatalogoDetalle(CatalogoDetalleRequest request) throws Exception;
	public DataResponse eliminarCatalogo(CatalogoRequest request) throws Exception;
	public DataResponse procesaCatalogo(CatalogoRequest request) throws Exception;
	public DataResponse eliminarCatalogoDetalle(CatalogoRequest request) throws Exception;
	public DataResponse procesaCatalogoDetalle(CatalogoRequest request) throws Exception;
	
}
