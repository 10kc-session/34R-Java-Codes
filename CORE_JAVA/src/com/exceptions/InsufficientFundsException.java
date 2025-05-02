package com.exceptions;

public class InsufficientFundsException extends RuntimeException{
	public InsufficientFundsException(String str) {
		super(str);
	}
}
