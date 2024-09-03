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
import com.pe.app.backoffice.model.request.ClienteGrupoDetalleRequest;
import com.pe.app.backoffice.model.request.ClienteGrupoRequest;
import com.pe.app.backoffice.model.request.ClienteRequest;
import com.pe.app.backoffice.service.ClienteService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/cliente")
public class ClienteController extends BaseController{

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/buscar-cliente"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> buscarCliente(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteRequest request = mapper.readValue(param.getDato().toString(), ClienteRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.buscarCliente(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/buscar-cliente-02"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> buscarCliente02(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteRequest request = mapper.readValue(param.getDato().toString(), ClienteRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.buscarCliente02(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-cliente"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarCliente(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteRequest request = mapper.readValue(param.getDato().toString(), ClienteRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.listarCliente(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-cliente"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarCliente(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteRequest request = mapper.readValue(param.getDato().toString(), ClienteRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.eliminarCliente(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-cliente"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaCliente(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteRequest request = mapper.readValue(param.getDato().toString(), ClienteRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.procesaCliente(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-cliente-grupo"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarClienteGrupo(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteGrupoRequest request = mapper.readValue(param.getDato().toString(), ClienteGrupoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.listarClienteGrupo(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-cliente-grupo"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarClienteGrupo(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteGrupoRequest request = mapper.readValue(param.getDato().toString(), ClienteGrupoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.eliminarClienteGrupo(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-cliente-grupo"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaClienteGrupo(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteGrupoRequest request = mapper.readValue(param.getDato().toString(), ClienteGrupoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.procesaClienteGrupo(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-cliente-grupo-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarClienteGrupoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteGrupoDetalleRequest request = mapper.readValue(param.getDato().toString(), ClienteGrupoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.listarClienteGrupoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-cliente-grupo-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarClienteGrupoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteGrupoDetalleRequest request = mapper.readValue(param.getDato().toString(), ClienteGrupoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.eliminarClienteGrupoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-cliente-grupo-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaClienteGrupoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ClienteGrupoDetalleRequest request = mapper.readValue(param.getDato().toString(), ClienteGrupoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   clienteService.procesaClienteGrupoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
}
