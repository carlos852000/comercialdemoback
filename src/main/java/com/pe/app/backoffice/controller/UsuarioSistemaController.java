package com.pe.app.backoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pe.app.backoffice.model.request.UsuarioSistemaRequest;
import com.pe.app.backoffice.model.request.VerificaPermisosRequest;
import com.pe.app.backoffice.model.request.VerificarAccesoBotonRequest;
import com.pe.app.backoffice.service.UsuarioSistemaService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/usuario-sistema")
public class UsuarioSistemaController extends BaseController{

	@Autowired
	private UsuarioSistemaService usuarioService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-perfil"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> verificaUsuarioPerfil(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioSistemaRequest request = mapper.readValue(param.getDato().toString(), UsuarioSistemaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   usuarioService.verificarPerfil(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/obtiene-menu"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> obtieneMenuSistema(@RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioSistemaRequest request = mapper.readValue(param.getDato().toString(), UsuarioSistemaRequest.class);
		dataResponse =   usuarioService.obtieneMenuSistema(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/cambia-clave"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> cambiaClave(@RequestHeader (name="Authorization") String token,@RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioSistemaRequest request = mapper.readValue(param.getDato().toString(), UsuarioSistemaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   usuarioService.cambiaClave(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-permisos"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> verificarPermisos(@RequestHeader (name="Authorization") String token,@RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		VerificaPermisosRequest request = mapper.readValue(param.getDato().toString(), VerificaPermisosRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   usuarioService.verificarPermisos(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-acceso-boton"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> verificarAccesoBoton(@RequestHeader (name="Authorization") String token,@RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		VerificarAccesoBotonRequest request = mapper.readValue(param.getDato().toString(), VerificarAccesoBotonRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   usuarioService.verificarAccesoBoton(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paUsuarioActualizaDatos
	@RequestMapping(method = {RequestMethod.POST}, value = {"/actualiza-datos-usuario"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> actualizaDatosUsuario(@RequestHeader (name="Authorization") String token,@RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioSistemaRequest request = mapper.readValue(param.getDato().toString(), UsuarioSistemaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   usuarioService.actualizaDatosUsuario(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
}
