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
import com.pe.app.backoffice.model.request.ParametroRequest;
import com.pe.app.backoffice.service.ParametroService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/parametro")
public class ParametroController extends BaseController{

	@Autowired
	private ParametroService parametroService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-parametro-ab"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> verificarParametroxAbreviatura(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ParametroRequest request = mapper.readValue(param.getDato().toString(), ParametroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   parametroService.verificarParametroxAbreviatura(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
}
