package com.example.demo.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GenerateWishesService implements IGreetService{

	private static final Logger logger = LoggerFactory.getLogger(GenerateWishesService.class); 	//sl4j
	
	@Override
	public String generateWishes() {
		
		logger.trace("Service / Business logic is been invocked");
		
		LocalDateTime dateTime = LocalDateTime.now();
		int hour = dateTime.getHour();
		String body = null;
		
		if(hour < 12) {
			body = "Good Morning";
		}else if(hour < 16) {
			body = "Good Afternoon";
		}else if(hour < 20) {
			body = "Good Evening";
		}else {
			body = "Good Night";
		}
		return body;
	}

}
