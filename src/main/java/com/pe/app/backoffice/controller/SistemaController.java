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
import com.pe.app.backoffice.service.SistemaService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/sistema")
public class SistemaController extends BaseController{

	@Autowired
	private SistemaService sistemaService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	//paAccesoProcesa
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-acceso"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ProcesarAcceso(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionAccesoRequest request = mapper.readValue(param.getDato().toString(), OpcionAccesoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.procesaAcceso(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paAccesoBotonProcesa
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-acceso-boton"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ProcesarAccesoBoton(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionAccesoBotonRequest request = mapper.readValue(param.getDato().toString(), OpcionAccesoBotonRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ProcesarAccesoBoton(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paAccesoVerifica
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-acceso"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> VerificarAcceso(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		VerificarAccesoRequest request = mapper.readValue(param.getDato().toString(), VerificarAccesoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.VerificarAcceso(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paAccesoBotonVerifica
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-acceso-boton"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> VerificarAccesoBoton(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		VerificarAccesoBotonRequest request = mapper.readValue(param.getDato().toString(), VerificarAccesoBotonRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.VerificarAccesoBoton(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
		
	//paOpcionAccesosListaDatos
	@RequestMapping(method = {RequestMethod.POST}, value = {"/lista-opciones-acceso"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ListarOpcionAcceso(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionAccesoRequest request = mapper.readValue(param.getDato().toString(), OpcionAccesoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ListarOpcionesAcceso(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paOpcionBotonListaDatos
	@RequestMapping(method = {RequestMethod.POST}, value = {"/lista-botones"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ListarBotones(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		BotonAccesoRequest request = mapper.readValue(param.getDato().toString(), BotonAccesoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ListarBotones(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paOpcionBotonElimina
	@RequestMapping(method = {RequestMethod.POST}, value = {"/opcion-boton-procesa"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ProcesarOpcionBoton(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionBotonRequest request = mapper.readValue(param.getDato().toString(), OpcionBotonRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ProcesarOpcionBoton(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
		
	//paOpcionBotonElimina
	@RequestMapping(method = {RequestMethod.POST}, value = {"/opcion-boton-elimina"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> EliminarOpcionBoton(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionBotonRequest request = mapper.readValue(param.getDato().toString(), OpcionBotonRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.EliminarOpcionBoton(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paOpcionElimina
	@RequestMapping(method = {RequestMethod.POST}, value = {"/opcion-elimina"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> EliminarOpcion(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionRequest request = mapper.readValue(param.getDato().toString(), OpcionRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.EliminarOpcion(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
		
	//paOpcionListaDatos
	@RequestMapping(method = {RequestMethod.POST}, value = {"/lista-opciones"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ListarOpciones(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionRequest request = mapper.readValue(param.getDato().toString(), OpcionRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ListarOpciones(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paOpcionLista
	@RequestMapping(method = {RequestMethod.POST}, value = {"/obtiene-menu"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ObtenerMenu(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionRequest request = mapper.readValue(param.getDato().toString(), OpcionRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ObtenerMenu(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paOpcionOrdena
	@RequestMapping(method = {RequestMethod.POST}, value = {"/ordena-opcion"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> OrdenarOpcion(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionRequest request = mapper.readValue(param.getDato().toString(), OpcionRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.OrdenarOpcion(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paOpcionProcesa
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-opcion"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ProcesarOpcion(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		OpcionRequest request = mapper.readValue(param.getDato().toString(), OpcionRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ProcesarOpcion(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paPerfilElimina
	@RequestMapping(method = {RequestMethod.POST}, value = {"/elimina-perfil"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> EliminarPerfil(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		PerfilRequest request = mapper.readValue(param.getDato().toString(), PerfilRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.EliminarPerfil(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paPerfilListaDatos
	@RequestMapping(method = {RequestMethod.POST}, value = {"/lista-perfil"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ListarPerfil(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		PerfilRequest request = mapper.readValue(param.getDato().toString(), PerfilRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ListarPerfil(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
		
	//paPerfilProcesa
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-perfil"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ProcesarPerfil(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		PerfilRequest request = mapper.readValue(param.getDato().toString(), PerfilRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ProcesarPerfil(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
		
	//paSistemaObtieneDatos
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-sistema"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> VerificarSistema(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		SistemaRequest request = mapper.readValue(param.getDato().toString(), SistemaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.VerificarSistema(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paSistemaProcesa
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-sistema"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ProcesarSistema(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		SistemaRequest request = mapper.readValue(param.getDato().toString(), SistemaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ProcesarSistema(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paUsuarioCambiaClave
	@RequestMapping(method = {RequestMethod.POST}, value = {"/cambia-clave"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> CambiarClave(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioRequest request = mapper.readValue(param.getDato().toString(), UsuarioRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.CambiarClave(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paUsuarioElimina
	@RequestMapping(method = {RequestMethod.POST}, value = {"/elimina-usuario"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> EliminarUsuario(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioRequest request = mapper.readValue(param.getDato().toString(), UsuarioRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.EliminarUsuario(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paUsuarioPerfilListaDatos
	@RequestMapping(method = {RequestMethod.POST}, value = {"/lista-usuario-perfil"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ListarUsuarioPerfil(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioRequest request = mapper.readValue(param.getDato().toString(), UsuarioRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ListarUsuarioPerfil(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paUsuarioListaDatos
	@RequestMapping(method = {RequestMethod.POST}, value = {"/lista-usuario"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ListarUsuario(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioRequest request = mapper.readValue(param.getDato().toString(), UsuarioRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ListarUsuario(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paUsuarioProcesa
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-usuario"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ProcesarUsuario(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioRequest request = mapper.readValue(param.getDato().toString(), UsuarioRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ProcesarUsuario(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paUsuarioBuscarxDni
	@RequestMapping(method = {RequestMethod.POST}, value = {"/buscar-usuario-dni"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> BuscarUsuarioxDNI(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		UsuarioRequest request = mapper.readValue(param.getDato().toString(), UsuarioRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.BuscarUsuarioxDNI(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paUsuarioPerfilVerifica
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-usuario-perfil"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> VerificarUsuarioPerfil(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		VerificaUsuarioPerfilRequest request = mapper.readValue(param.getDato().toString(), VerificaUsuarioPerfilRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.VerificarUsuarioPerfil(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	//paUsuarioPerfilProcesa
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-usuario-perfil"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> ProcesarUsuarioPerfil(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProcesaUsuarioPerfilRequest request = mapper.readValue(param.getDato().toString(), ProcesaUsuarioPerfilRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   sistemaService.ProcesarUsuarioPerfil(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
		

}
