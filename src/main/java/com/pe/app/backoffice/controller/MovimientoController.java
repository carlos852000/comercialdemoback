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
import com.pe.app.backoffice.model.request.MovimientoDetalleRequest;
import com.pe.app.backoffice.model.request.MovimientoRequest;
import com.pe.app.backoffice.model.request.ProductoRequest;
import com.pe.app.backoffice.service.MovimientoService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/movimiento")
public class MovimientoController extends BaseController{

	@Autowired
	private MovimientoService movimientoService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/buscar-compra"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> buscarCompra(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.buscarCompra(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verificar-movimiento-salida-transf-usuario"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> verificarMovimientoSalidaTransfxIdUsuario(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.verificarMovimientoSalidaTransfxIdUsuario(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-ingresos-compras"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarIngresosCompras(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.listarIngresosCompras(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-ingresos-transferencias"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarIngresosTransferencias(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.listarIngresosTransferencias(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-ingresos-otros"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarIngresosOtros(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.listarIngresosOtros(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-salidas-transferencias"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarSalidasTransferencias(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.listarSalidasTransferencias(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-pre-movimiento-salida-transferencia"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaPreMovimientoSalidaTransferencia(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.procesaPreMovimientoSalidaTransferencia(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-movimiento-ing-compras"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaMovimientoIngCompras(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.procesaMovimientoIngCompras(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-movimiento-sal-transferencias"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaMovimientoSalTransferencias(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.procesaMovimientoSalTransferencias(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-movimiento"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminaMovimiento(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoRequest request = mapper.readValue(param.getDato().toString(), MovimientoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.eliminaMovimiento(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"listar-movimiento-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarMovimientosDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoDetalleRequest request = mapper.readValue(param.getDato().toString(), MovimientoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.listarMovimientosDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-movimiento-detalle-salida-transferencia"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaMovimientoDetalleSalidaTransferencia(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoDetalleRequest request = mapper.readValue(param.getDato().toString(), MovimientoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.procesaMovimientoDetalleSalidaTransferencia(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-movimiento-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminaMovimientoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		MovimientoDetalleRequest request = mapper.readValue(param.getDato().toString(), MovimientoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.eliminaMovimientoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/kardex-producto"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarKardex(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoRequest request = mapper.readValue(param.getDato().toString(), ProductoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.listarKardex(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
	@RequestMapping(method = {RequestMethod.POST}, value = {"/kardex-producto-tienda"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarKardexTiendas(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoRequest request = mapper.readValue(param.getDato().toString(), ProductoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   movimientoService.listarKardexTiendas(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
	
}
