package com.cogent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;



@SpringBootApplication
public class SpringBootJenkinsApplication {

//	 static Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
//	
	 @PostConstruct
	 void init() {
		 log.debug("This is init constructor statement");
	 }
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
