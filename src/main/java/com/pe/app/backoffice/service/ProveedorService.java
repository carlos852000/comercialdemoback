package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.ProveedorRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface ProveedorService {
	
	public DataResponse listarProveedor(ProveedorRequest request) throws Exception;
	public DataResponse procesaProveedor(ProveedorRequest request) throws Exception;
	public DataResponse eliminarProveedor(ProveedorRequest request) throws Exception;
	
}
