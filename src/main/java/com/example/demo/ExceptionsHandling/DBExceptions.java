package com.example.demo.ExceptionsHandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.dao.QuizDao;


public class DBExceptions extends Exception {
	private static final Logger LOGGER=LoggerFactory.getLogger(QuizDao.class);
	public DBExceptions() {}
	
	public DBExceptions(String message, Throwable t) {
		super(message, t);
	}

	public void IDNotFound(String message, NullPointerException e) {
		LOGGER.info(message);
	}
	public void IDNotFound(String message) {
		LOGGER.info(message);
	}
}