package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.BotonAccesoRequest;
import com.pe.app.backoffice.model.request.OpcionAccesoBotonRequest;
import com.pe.app.backoffice.model.request.OpcionAccesoRequest;
import com.pe.app.backoffice.model.request.OpcionBotonRequest;
import com.pe.app.backoffice.model.request.OpcionRequest;
import com.pe.app.backoffice.model.request.PerfilRequest;
import com.pe.app.backoffice.model.request.ProcesaUsuarioPerfilRequest;
import com.pe.app.backoffice.model.request.SistemaRequest;
import com.pe.app.backoffice.model.request.UsuarioRequest;
import com.pe.app.backoffice.model.request.VerificaUsuarioPerfilRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoBotonRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface SistemaService {
	
	public DataResponse procesaAcceso(OpcionAccesoRequest request) throws Exception;
	public DataResponse ProcesarAccesoBoton(OpcionAccesoBotonRequest request) throws Exception;
	public DataResponse VerificarAcceso(VerificarAccesoRequest request) throws Exception;
	public DataResponse VerificarAccesoBoton(VerificarAccesoBotonRequest request) throws Exception;
	public DataResponse ListarOpcionesAcceso(OpcionAccesoRequest request) throws Exception;
	public DataResponse ListarBotones(BotonAccesoRequest request) throws Exception;
	public DataResponse ProcesarOpcionBoton(OpcionBotonRequest request) throws Exception;
	public DataResponse EliminarOpcionBoton(OpcionBotonRequest request) throws Exception;
	public DataResponse EliminarOpcion(OpcionRequest request) throws Exception;
	public DataResponse ListarOpciones(OpcionRequest request) throws Exception;
	public DataResponse ObtenerMenu(OpcionRequest request) throws Exception;
	public DataResponse OrdenarOpcion(OpcionRequest request) throws Exception;
	public DataResponse ProcesarOpcion(OpcionRequest request) throws Exception;
	public DataResponse EliminarPerfil(PerfilRequest request) throws Exception;
	public DataResponse ListarPerfil(PerfilRequest request) throws Exception;
	public DataResponse ProcesarPerfil(PerfilRequest request) throws Exception;
	public DataResponse VerificarSistema(SistemaRequest request) throws Exception;
	public DataResponse ProcesarSistema(SistemaRequest request) throws Exception;
	public DataResponse CambiarClave(UsuarioRequest request) throws Exception;
	public DataResponse EliminarUsuario(UsuarioRequest request) throws Exception;
	public DataResponse ListarUsuarioPerfil(UsuarioRequest request) throws Exception;
	public DataResponse ListarUsuario(UsuarioRequest request) throws Exception;
	public DataResponse ProcesarUsuario(UsuarioRequest request) throws Exception;
	public DataResponse BuscarUsuarioxDNI(UsuarioRequest request) throws Exception;
	public DataResponse VerificarUsuarioPerfil(VerificaUsuarioPerfilRequest request) throws Exception;
	public DataResponse ProcesarUsuarioPerfil(ProcesaUsuarioPerfilRequest request) throws Exception;
}
