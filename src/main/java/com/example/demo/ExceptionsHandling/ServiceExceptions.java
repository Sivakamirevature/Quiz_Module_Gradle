package com.example.demo.ExceptionsHandling;

public class ServiceExceptions extends Exception {

	public ServiceExceptions() {}
	public void ArgumentMismatching(String string, IllegalArgumentException e) {
		new Exception(string,e);	
	}

}
