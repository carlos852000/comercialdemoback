package com.pe.app.seguridad.repository;

import com.pe.app.seguridad.model.request.LoginUsuarioRequest;
import com.pe.app.seguridad.model.request.UsuarioAuditoriaDto;
import com.pe.app.seguridad.model.response.LoginUsuarioResponse;
import com.pe.app.seguridad.model.response.ObtieneInfoUsuarioResponse;

public interface UsuarioMapper {

	public LoginUsuarioResponse loginUsuario(LoginUsuarioRequest request) throws Exception;
	public ObtieneInfoUsuarioResponse obtieneInfoUsuario(UsuarioAuditoriaDto request) throws Exception;
 
}
