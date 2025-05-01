package com.telusko;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JTest {

	private static final Logger logger= LogManager.getLogger(Log4JTest.class); 
	
	public static void main(String[] args) {
		process();
	}
	
	public static void process() {
		
		// logic
		logger.trace("from the trace method");
		logger.debug("from the debug method");
		logger.info("from the info method");
		logger.warn("from the warn method");
		logger.error("from the error method");
		logger.fatal("from the fatal method");
	}
}
