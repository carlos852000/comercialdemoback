package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pe.app.backoffice.model.request.UsuarioSistemaRequest;
import com.pe.app.backoffice.model.request.VerificaPermisosRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoBotonRequest;
import com.pe.app.backoffice.model.response.ActualizaDatosUsuarioResponse;
import com.pe.app.backoffice.model.response.CambioClaveResponse;
import com.pe.app.backoffice.model.response.ListaMenuSistemaResponse;
import com.pe.app.backoffice.model.response.ListaUsuarioPerfilResponse;
import com.pe.app.backoffice.model.response.VerificarAccesoBotonResponse;
import com.pe.app.backoffice.model.response.VerificarPermisoFormularioResponse;
import com.pe.app.backoffice.repository.UsuarioSistemaMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class UsuarioSistemaServiceImpl implements UsuarioSistemaService{

	@Autowired
	public UsuarioSistemaMapper mapper;

	@Override
	public DataResponse verificarPerfil(UsuarioSistemaRequest request) throws Exception {
		List<ListaUsuarioPerfilResponse> dataDB = mapper.verificarPerfil(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse obtieneMenuSistema(UsuarioSistemaRequest request) throws Exception {
		List<ListaMenuSistemaResponse> dataDB = mapper.obtieneMenuSistema(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		/*if(dataDB.size()>0){
			for(ListaMenuSistemaResponse listaMenus : dataDB) {
				//ListaSubMenus
				UsuarioSistemaRequest requestSubMenu = new
			}
		}*/
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse cambiaClave(UsuarioSistemaRequest request) throws Exception {
		//request.getNuevoNickname()
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		request.setNuevaclave(passwordEncoder.encode(request.getNuevonickname()));
		CambioClaveResponse dataDB = mapper.cambiaClave(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse verificarPermisos(VerificaPermisosRequest request) throws Exception {
		VerificarPermisoFormularioResponse dataDB = mapper.verificarPermisosFormulario(request);
		request.setIdacceso(dataDB.getIdacceso());
		dataDB.setListBotones(mapper.verificarPermisosBoton(request));
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse verificarAccesoBoton(VerificarAccesoBotonRequest request) throws Exception {
		VerificarPermisoFormularioResponse dataDB = mapper.verificarAccesoBoton(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse actualizaDatosUsuario(UsuarioSistemaRequest request) throws Exception {
		ActualizaDatosUsuarioResponse dataDB = mapper.actualizaDatosUsuario(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		
		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
}
