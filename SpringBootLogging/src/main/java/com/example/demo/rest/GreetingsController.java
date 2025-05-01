package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IGreetService;

@RestController
public class GreetingsController {
	
	//private static final Logger logger = LogManager.getLogger(GreetingsController.class);		// log4j
	private static final Logger logger = LoggerFactory.getLogger(GreetingsController.class); 	//sl4j
	
	@Autowired
	private IGreetService service;
	
	@GetMapping("/api")
	public ResponseEntity<String> generateGreetings(){
		
		logger.info("Control in api1");
		String body = service.generateWishes();
		logger.debug("Service logic is been invocked and we got response");	
		// be default, enabled logging levels are - info,warn,error. So explicitly given in prop file
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
}
