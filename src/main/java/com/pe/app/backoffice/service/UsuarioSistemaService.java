package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.UsuarioSistemaRequest;
import com.pe.app.backoffice.model.request.VerificaPermisosRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoBotonRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface UsuarioSistemaService {
	
	public DataResponse verificarPerfil(UsuarioSistemaRequest request) throws Exception;
	public DataResponse obtieneMenuSistema(UsuarioSistemaRequest request) throws Exception;
	public DataResponse cambiaClave(UsuarioSistemaRequest request) throws Exception;
	public DataResponse verificarPermisos(VerificaPermisosRequest request) throws Exception;
	public DataResponse verificarAccesoBoton(VerificarAccesoBotonRequest request) throws Exception;
	public DataResponse actualizaDatosUsuario(UsuarioSistemaRequest request) throws Exception;
}
