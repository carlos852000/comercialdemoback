package com.pe.app.transversal.exceptions;

import javax.servlet.ServletException;

public class TokenExpiredException extends ServletException{

	private static final long serialVersionUID = 1L;

	public TokenExpiredException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TokenExpiredException(String message, Throwable rootCause) {
		super(message, rootCause);
		// TODO Auto-generated constructor stub
	}

	public TokenExpiredException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TokenExpiredException(Throwable rootCause) {
		super(rootCause);
		// TODO Auto-generated constructor stub
	}
	
}
