package com.example.weeksix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class WeeksixApplication {

	public Integer returnsInteger(Integer i){
	return i;
	};

	public static void main(String[] args) {
		SpringApplication.run(WeeksixApplication.class, args);
	}



}
