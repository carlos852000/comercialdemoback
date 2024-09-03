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
import com.pe.app.backoffice.model.request.ProveedorRequest;
import com.pe.app.backoffice.service.ProveedorService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController extends BaseController{

	@Autowired
	private ProveedorService proveedorService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-proveedor"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarProveedor(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProveedorRequest request = mapper.readValue(param.getDato().toString(), ProveedorRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   proveedorService.listarProveedor(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-proveedor"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarProveedor(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProveedorRequest request = mapper.readValue(param.getDato().toString(), ProveedorRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   proveedorService.eliminarProveedor(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-proveedor"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaProveedor(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProveedorRequest request = mapper.readValue(param.getDato().toString(), ProveedorRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   proveedorService.procesaProveedor(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
}
