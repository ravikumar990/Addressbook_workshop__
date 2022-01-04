package com.example.demo.expection;

/**
 * custom Exception
 */
public class PersonException extends RuntimeException {
	public PersonException(String message) {
		super(message);
	}
}