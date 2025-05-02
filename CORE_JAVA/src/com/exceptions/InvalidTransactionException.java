package com.exceptions;

public class InvalidTransactionException extends Exception{
	public InvalidTransactionException(String str) {
		super(str);
	}
}
