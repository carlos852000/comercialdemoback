package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.BotonAccesoRequest;
import com.pe.app.backoffice.model.request.OpcionAccesoBotonRequest;
import com.pe.app.backoffice.model.request.OpcionAccesoRequest;
import com.pe.app.backoffice.model.request.OpcionBotonRequest;
import com.pe.app.backoffice.model.request.OpcionPerfilRequest;
import com.pe.app.backoffice.model.request.OpcionRequest;
import com.pe.app.backoffice.model.request.PerfilRequest;
import com.pe.app.backoffice.model.request.ProcesaUsuarioPerfilRequest;
import com.pe.app.backoffice.model.request.SistemaRequest;
import com.pe.app.backoffice.model.request.UsuarioRequest;
import com.pe.app.backoffice.model.request.VerificaUsuarioPerfilRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoBotonRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoRequest;
import com.pe.app.backoffice.model.response.AccesoResponse;
import com.pe.app.backoffice.model.response.EliminarOpcionResponse;
import com.pe.app.backoffice.model.response.ListaBotonesAccesoResponse;
import com.pe.app.backoffice.model.response.ListaOpcionesAccesoResponse;
import com.pe.app.backoffice.model.response.ListaPerfilResponse;
import com.pe.app.backoffice.model.response.ListaSistemaResponse;
import com.pe.app.backoffice.model.response.ListaUsuarioPersonaPerfilResponse;
import com.pe.app.backoffice.model.response.OpcionBotonResponse;
import com.pe.app.backoffice.model.response.OpcionResponse;
import com.pe.app.backoffice.model.response.PerfilResponse;
import com.pe.app.backoffice.model.response.ProcesaUsuarioPerfilResponse;
import com.pe.app.backoffice.model.response.SistemaResponse;
import com.pe.app.backoffice.model.response.UsuarioResponse;
import com.pe.app.backoffice.model.response.VerificaAccesoBotonSistResponse;
import com.pe.app.backoffice.model.response.VerificaAccesoResponse;
import com.pe.app.backoffice.model.response.VerificaUsuarioPerfilResponse;

@Mapper
public interface SistemaMapper {

	AccesoResponse procesaAcceso(OpcionAccesoRequest request) throws Exception;
	AccesoResponse ProcesarAccesoBoton(OpcionAccesoBotonRequest request) throws Exception;
	VerificaAccesoResponse VerificarAcceso(VerificarAccesoRequest request) throws Exception;
	VerificaAccesoBotonSistResponse VerificarAccesoBoton(VerificarAccesoBotonRequest request) throws Exception;
	List<ListaOpcionesAccesoResponse> listaOpcionesAcceso(OpcionPerfilRequest request) throws Exception;
	List<ListaBotonesAccesoResponse> ListarBotones(BotonAccesoRequest request) throws Exception;
	OpcionBotonResponse ProcesarOpcionBoton(OpcionBotonRequest request) throws Exception;
	OpcionBotonResponse EliminarOpcionBoton(OpcionBotonRequest request) throws Exception;
	EliminarOpcionResponse EliminarOpcion(OpcionRequest request) throws Exception;
	List<ListaOpcionesAccesoResponse> ListarOpciones(OpcionRequest request) throws Exception;
	List<ListaOpcionesAccesoResponse> ObtenerMenu(OpcionRequest request) throws Exception;
	OpcionResponse OrdenarOpcion(OpcionRequest request) throws Exception;
	OpcionResponse ProcesarOpcion(OpcionRequest request) throws Exception;
	PerfilResponse EliminarPerfil(PerfilRequest request) throws Exception;
	List<ListaPerfilResponse> ListarPerfil(PerfilRequest request) throws Exception;
	PerfilResponse ProcesarPerfil(PerfilRequest request) throws Exception;
	ListaSistemaResponse VerificarSistema(SistemaRequest request) throws Exception;
	SistemaResponse ProcesarSistema(SistemaRequest request) throws Exception;
	UsuarioResponse CambiarClave(UsuarioRequest request) throws Exception;
	UsuarioResponse EliminarUsuario(UsuarioRequest request) throws Exception;
	List<ListaUsuarioPersonaPerfilResponse> ListarUsuarioPerfil(UsuarioRequest request) throws Exception;
	List<ListaUsuarioPersonaPerfilResponse> ListarUsuario(UsuarioRequest request) throws Exception;
	UsuarioResponse ProcesarUsuario(UsuarioRequest request) throws Exception;
	UsuarioResponse BuscarUsuarioxDNI(UsuarioRequest request) throws Exception;
	VerificaUsuarioPerfilResponse VerificarUsuarioPerfil(VerificaUsuarioPerfilRequest request) throws Exception;
	ProcesaUsuarioPerfilResponse ProcesarUsuarioPerfil(ProcesaUsuarioPerfilRequest request) throws Exception;
}
