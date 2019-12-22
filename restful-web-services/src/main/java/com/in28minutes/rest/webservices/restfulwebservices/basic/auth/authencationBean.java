package com.in28minutes.rest.webservices.restfulwebservices.basic.auth;

public class authencationBean {

	private String message;

	public authencationBean(String string) {
		this.message =string;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "authencationBean [message=" + message + "]";
	}

	
}
