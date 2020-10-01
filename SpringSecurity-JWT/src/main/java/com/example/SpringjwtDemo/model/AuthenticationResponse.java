/**
 * 
 */
package com.example.SpringjwtDemo.model;

import java.io.Serializable;

/**
 * @author kapil
 *
 */
public class AuthenticationResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 15213313165473L;

	private String token ;

	
	
	
	/**
	 * @param token
	 */
	public AuthenticationResponse(String token) {
		super();
		this.token = token;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
