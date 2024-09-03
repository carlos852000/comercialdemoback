package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.UsuarioSistemaRequest;
import com.pe.app.backoffice.model.request.VerificaPermisosRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoBotonRequest;
import com.pe.app.backoffice.model.response.ActualizaDatosUsuarioResponse;
import com.pe.app.backoffice.model.response.CambioClaveResponse;
import com.pe.app.backoffice.model.response.ListaMenuSistemaResponse;
import com.pe.app.backoffice.model.response.ListaUsuarioPerfilResponse;
import com.pe.app.backoffice.model.response.VerificarAccesoBotonResponse;
import com.pe.app.backoffice.model.response.VerificarPermisoFormularioResponse;

@Mapper
public interface UsuarioSistemaMapper {

	List<ListaUsuarioPerfilResponse> verificarPerfil(UsuarioSistemaRequest request) throws Exception;
	List<ListaMenuSistemaResponse> obtieneMenuSistema(UsuarioSistemaRequest request) throws Exception;
	CambioClaveResponse cambiaClave(UsuarioSistemaRequest request) throws Exception;
	VerificarPermisoFormularioResponse verificarPermisosFormulario(VerificaPermisosRequest request) throws Exception;
	VerificarPermisoFormularioResponse verificarAccesoBoton(VerificarAccesoBotonRequest request) throws Exception;
	List<VerificarAccesoBotonResponse> verificarPermisosBoton(VerificaPermisosRequest request) throws Exception;
	ActualizaDatosUsuarioResponse actualizaDatosUsuario(UsuarioSistemaRequest request) throws Exception;
}
