package com.exception;

public class InvalidUsernameAndPassword extends Exception {

	@Override
	public String toString() {
		String message ="inavlid username and password";
		return "InvalidUsernameAndPassword []";
	}

	
}
