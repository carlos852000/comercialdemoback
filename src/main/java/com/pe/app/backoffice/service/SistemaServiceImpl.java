package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pe.app.backoffice.model.request.BotonAccesoRequest;
import com.pe.app.backoffice.model.request.OpcionAccesoBotonRequest;
import com.pe.app.backoffice.model.request.OpcionPerfilRequest;
import com.pe.app.backoffice.model.request.OpcionRequest;
import com.pe.app.backoffice.model.request.PerfilRequest;
import com.pe.app.backoffice.model.request.ProcesaUsuarioPerfilRequest;
import com.pe.app.backoffice.model.request.SistemaRequest;
import com.pe.app.backoffice.model.request.UsuarioRequest;
import com.pe.app.backoffice.model.request.VerificaUsuarioPerfilRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoBotonRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoRequest;
import com.pe.app.backoffice.model.request.OpcionAccesoRequest;
import com.pe.app.backoffice.model.request.OpcionBotonRequest;
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
import com.pe.app.backoffice.repository.SistemaMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class SistemaServiceImpl implements SistemaService{

	@Autowired
	public SistemaMapper mapper;

	@Override
	public DataResponse procesaAcceso(OpcionAccesoRequest request) throws Exception {
			
		/*if(request.getDatosAcceso().size()>0){
			for (AccesoRequest accesoRequest: request.getDatosAcceso()) {
				AccesoResponse accesoResponse = mapper.procesaAcceso(accesoRequest);
				Funciones.validar(accesoRequest);
			}
		}
		OpcionPerfilRequest opcionperfil =  new OpcionPerfilRequest();
		opcionperfil.setIdperfil(request.getIdperfil());
		opcionperfil.setIdsistema(request.getIdsistema());
		List<ListaOpcionesAccesoResponse> dataDB = mapper.listaOpcionesAcceso(opcionperfil);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(opcionperfil);*/
		AccesoResponse dataDB = mapper.procesaAcceso(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		/*dataResponse.setDato(dataDB);
		dataResponse.setResultado(opcionperfil.getResultado());
		dataResponse.setMensaje(opcionperfil.getMensaje());
		return dataResponse;*/
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ProcesarAccesoBoton(OpcionAccesoBotonRequest request) throws Exception {
		AccesoResponse dataDB = mapper.ProcesarAccesoBoton(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse VerificarAcceso(VerificarAccesoRequest request) throws Exception {
		VerificaAccesoResponse dataDB = mapper.VerificarAcceso(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse VerificarAccesoBoton(VerificarAccesoBotonRequest request) throws Exception {
		VerificaAccesoBotonSistResponse dataDB = mapper.VerificarAccesoBoton(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ListarOpcionesAcceso(OpcionAccesoRequest request) throws Exception {
		OpcionPerfilRequest opcionperfil =  new OpcionPerfilRequest();
		opcionperfil.setIdperfil(request.getIdperfil());
		opcionperfil.setIdsistema(request.getIdsistema());
		List<ListaOpcionesAccesoResponse> dataDB = mapper.listaOpcionesAcceso(opcionperfil);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(opcionperfil);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(opcionperfil.getResultado());
		dataResponse.setMensaje(opcionperfil.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ListarBotones(BotonAccesoRequest request) throws Exception {
		List<ListaBotonesAccesoResponse> dataDB = mapper.ListarBotones(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ProcesarOpcionBoton(OpcionBotonRequest request) throws Exception {
		OpcionBotonResponse dataDB = mapper.ProcesarOpcionBoton(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse EliminarOpcionBoton(OpcionBotonRequest request) throws Exception {
		OpcionBotonResponse dataDB = mapper.EliminarOpcionBoton(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse EliminarOpcion(OpcionRequest request) throws Exception {
		EliminarOpcionResponse dataDB = mapper.EliminarOpcion(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ListarOpciones(OpcionRequest request) throws Exception {
		List<ListaOpcionesAccesoResponse> dataDB = mapper.ListarOpciones(request);
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
	public DataResponse ObtenerMenu(OpcionRequest request) throws Exception {
		List<ListaOpcionesAccesoResponse> dataDB = mapper.ObtenerMenu(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse OrdenarOpcion(OpcionRequest request) throws Exception {
		OpcionResponse dataDB = mapper.OrdenarOpcion(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ProcesarOpcion(OpcionRequest request) throws Exception {
		OpcionResponse dataDB = mapper.ProcesarOpcion(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse EliminarPerfil(PerfilRequest request) throws Exception {
		PerfilResponse dataDB = mapper.EliminarPerfil(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ListarPerfil(PerfilRequest request) throws Exception {
		List<ListaPerfilResponse> dataDB = mapper.ListarPerfil(request);
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
	public DataResponse ProcesarPerfil(PerfilRequest request) throws Exception {
		PerfilResponse dataDB = mapper.ProcesarPerfil(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse VerificarSistema(SistemaRequest request) throws Exception {
		ListaSistemaResponse dataDB = mapper.VerificarSistema(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ProcesarSistema(SistemaRequest request) throws Exception {
		SistemaResponse dataDB = mapper.ProcesarSistema(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse CambiarClave(UsuarioRequest request) throws Exception {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		request.setNuevaclave(passwordEncoder.encode(request.getNrodocumentousuario()));
		UsuarioResponse dataDB = mapper.CambiarClave(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse EliminarUsuario(UsuarioRequest request) throws Exception {
		UsuarioResponse dataDB = mapper.EliminarUsuario(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ListarUsuarioPerfil(UsuarioRequest request) throws Exception {
		List<ListaUsuarioPersonaPerfilResponse> dataDB = mapper.ListarUsuarioPerfil(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ListarUsuario(UsuarioRequest request) throws Exception {
		List<ListaUsuarioPersonaPerfilResponse> dataDB = mapper.ListarUsuario(request);
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
	public DataResponse ProcesarUsuario(UsuarioRequest request) throws Exception {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		request.setNuevaclave(passwordEncoder.encode(request.getNrodocumentousuario()));
		UsuarioResponse dataDB = mapper.ProcesarUsuario(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse BuscarUsuarioxDNI(UsuarioRequest request) throws Exception {
		UsuarioResponse dataDB = mapper.BuscarUsuarioxDNI(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse VerificarUsuarioPerfil(VerificaUsuarioPerfilRequest request) throws Exception {
		VerificaUsuarioPerfilResponse dataDB = mapper.VerificarUsuarioPerfil(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse ProcesarUsuarioPerfil(ProcesaUsuarioPerfilRequest request) throws Exception {
		ProcesaUsuarioPerfilResponse dataDB = mapper.ProcesarUsuarioPerfil(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
}
