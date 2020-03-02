package com.example.weeksix;

import com.example.weeksix.Repo.DonutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class WeeksixApplication {


	// this method below is for testing
	public Integer returnsInteger(Integer i){
	return i;
	};

	public static void main(String[] args) {
		SpringApplication.run(WeeksixApplication.class, args);

		};
	}

