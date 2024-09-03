package com.pe.app.transversal.exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//import io.jsonwebtoken.ExpiredJwtException;

@Order()
@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody ExceptionResponse methodArgumentNotValidException(
			final MethodArgumentNotValidException exception,
			final HttpServletRequest request) {

		// get spring errors
        BindingResult result = exception.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        
        List<FieldErrorModel> errors = new ArrayList<>();
        
        fieldErrors.forEach(f->{
        	FieldErrorModel err = new FieldErrorModel(f.getField(),f.getDefaultMessage());
        	errors.add(err);
        });
        StackTraceElement l = exception.getStackTrace()[0];
		ExceptionResponse error = new ExceptionResponse();
		error.mensaje = "Error de campos";
		error.mensajeInteno = exception.getMessage();
		error.errorsField = errors;
		error.requestedURI = request.getRequestURI();
		error.timestamp = LocalDateTime.now();
		error.estado=0;
		error.resultado = 0;
		error.metodo = l.getMethodName();
		error.clase = l.getClassName();
		error.lineaCodigoError = "Linea: " + l.getLineNumber();		

		exception.getStackTrace();
		//System.out.println(exception.getMessage());
		return error;
	}
	
	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse nullPointerException(final NullPointerException exception,
			final HttpServletRequest request) {
	
		ExceptionResponse error = new ExceptionResponse();
	    StackTraceElement l = exception.getStackTrace()[0];
	    
	    error.mensaje = "Existe un campo con valor nulo.";
	    error.mensajeInteno = exception.getMessage();
	    error.requestedURI = request.getRequestURI();
	    error.timestamp = LocalDateTime.now();
	    error.estado = -1;
	    error.resultado = -1;
	    error.metodo = l.getMethodName();
	    error.clase = l.getClassName();
	    error.lineaCodigoError =  "Linea: " + l.getLineNumber();	    

		//exception.getStackTrace();

		return error;
	}
	
	@ExceptionHandler(CustomException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse customException(final CustomException exception,
			final HttpServletRequest request) {
	
		ExceptionResponse error = new ExceptionResponse();
	    StackTraceElement l = exception.getStackTrace()[0];
	    
	    error.mensaje = exception.getMensaje();
	    error.mensajeInteno = exception.getMensajeInterno();
	    error.requestedURI = request.getRequestURI();
	    error.timestamp = LocalDateTime.now();
	    error.estado = -1;
	    error.resultado = -1;
	    error.metodo = l.getMethodName();
	    error.clase = l.getClassName();
	    error.lineaCodigoError =  "Linea: " + l.getLineNumber();	    

		//exception.getStackTrace();

		return error;
	}
	
	@ExceptionHandler(ServletException.class)
	@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
	public @ResponseBody ExceptionResponse servletException(final ServletException exception,
			final HttpServletRequest request) {
	
		ExceptionResponse error = new ExceptionResponse();
	    //StackTraceElement l = exception.getStackTrace()[0];
	    System.out.println("INGRESE ERROR");
	    error.mensaje = exception.getMessage();
	    error.mensajeInteno = exception.getMessage();
	    error.requestedURI = request.getRequestURI();
	    error.timestamp = LocalDateTime.now();
	    error.estado = -1;
	    error.resultado = -1;
	   // error.metodo = l.getMethodName();
	   // error.clase = l.getClassName();
	    //error.lineaCodigoError =  "Linea: " + l.getLineNumber();	    

		//exception.getStackTrace();

		return error;
	}
	
	@ExceptionHandler(java.io.IOException.class)
	@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
	public @ResponseBody ExceptionResponse IOException(final java.io.IOException exception,
			final HttpServletRequest request) {
	
		ExceptionResponse error = new ExceptionResponse();
	    StackTraceElement l = exception.getStackTrace()[0];
	    
	    error.mensaje = exception.getMessage();
	    error.mensajeInteno = exception.getMessage();
	    error.requestedURI = request.getRequestURI();
	    error.timestamp = LocalDateTime.now();
	    error.estado = -1;
	    error.resultado = -1;
	    error.metodo = l.getMethodName();
	    error.clase = l.getClassName();
	    error.lineaCodigoError =  "Linea: " + l.getLineNumber();	    

		//exception.getStackTrace();

		return error;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleException(final Exception exception,
			final HttpServletRequest request) {

		ExceptionResponse error = new ExceptionResponse();
	    StackTraceElement l = exception.getStackTrace()[0];			
	    error.mensaje = "Ocurrió un error interno.";
	    error.mensajeInteno = exception.getMessage();
	    error.requestedURI = request.getRequestURI();
	    error.timestamp = LocalDateTime.now();
	    error.estado = -1;
	    error.resultado = -1;
	    error.metodo = l.getMethodName();
	    error.clase = l.getClassName();
	    error.lineaCodigoError =  "Linea: " + l.getLineNumber();

		//exception.getStackTrace();
		return error;
	}
}
