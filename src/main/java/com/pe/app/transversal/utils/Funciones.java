package com.pe.app.transversal.utils;

import com.pe.app.transversal.exceptions.CustomException;
import com.pe.app.transversal.model.request.BaseBeanRequest;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.model.response.DataResponseDB;

public class Funciones {

	public static void validar(DataResponseDB baseBean) {
		if (baseBean.getResultado() == 0) {
			throw new CustomException(baseBean.getMensaje(), baseBean.getMensaje());
		} else if (baseBean.getResultado() == -1) {
			throw new CustomException("Ocurrió un error interno.", baseBean.getMensaje());
		}
	}

	public static void validar(BaseBeanRequest baseBean) {
		// throw new CustomException(baseBean.getMensaje(),baseBean.getMensaje());
		if (baseBean.getResultado() == 0) {
			throw new CustomException(baseBean.getMensaje(), baseBean.getMensaje());
		} else if (baseBean.getResultado() == -1) {
			throw new CustomException("Ocurrió un error interno.", baseBean.getMensaje());
		}
	}

	public static void validar(DataResponse baseBean) {
		if (baseBean.getResultado() == 0) {
			throw new CustomException(baseBean.getMensaje(), baseBean.getMensaje());
		} else if (baseBean.getResultado() == -1) {
			throw new CustomException("Ocurrió un error interno.", baseBean.getMensaje());
		}
	}

}
