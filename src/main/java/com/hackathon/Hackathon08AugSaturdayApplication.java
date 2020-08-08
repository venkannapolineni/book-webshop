package com.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("{com.hackathon.controller, com.hackathon.service, com.hackathon.repository}")
public class Hackathon08AugSaturdayApplication {
	public static void main(String[] args) {
		SpringApplication.run(Hackathon08AugSaturdayApplication.class, args);
	}

}
