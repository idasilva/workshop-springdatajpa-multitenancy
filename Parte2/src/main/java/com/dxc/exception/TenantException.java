package com.dxc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TenantException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -5588328248090476564L;

	public TenantException(String message) {
		super(message);			}


	public TenantException(String message, Throwable cause) {
		super(message, cause);
	}
}