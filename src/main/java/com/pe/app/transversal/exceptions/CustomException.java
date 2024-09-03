package com.pe.app.transversal.exceptions;

public class CustomException extends RuntimeException{
	private String mensajeInterno;
	private String mensaje;

	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CustomException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomException(String message, Throwable rootCause) {
		super(message, rootCause);
		// TODO Auto-generated constructor stub
	}

	public CustomException(String mensaje, String mensajeInterno) {
		this.setMensaje(mensaje);
		this.setMensajeInterno(mensajeInterno);
		// TODO Auto-generated constructor stub
	}

	public CustomException(Throwable rootCause) {
		super(rootCause);
		// TODO Auto-generated constructor stub
	}

	public String getMensajeInterno() {
		return mensajeInterno;
	}

	public void setMensajeInterno(String mensajeInterno) {
		this.mensajeInterno = mensajeInterno;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
