/**
 * 
 */
package com.example.SpringjwtDemo.model;

import java.io.Serializable;

/**
 * @author kapil
 *
 */
public class AuthenticationRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 121354651321L;

	private String username;
	private String password;
	
	
	//constructor
	public AuthenticationRequest(String username, String password) {
		this.username=username;
		this.password =password;
     
    }
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
