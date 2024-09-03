package com.pe.app.transversal.exceptions;

public class FieldErrorModel {	
	
	public FieldErrorModel(String field, String defaultMessage) {
		// TODO Auto-generated constructor stub
		fieldName = field;
		fieldError = defaultMessage;
	}
	String fieldName;
	String fieldError;
}
