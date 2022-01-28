package com.example.covid19casetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19CaseTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19CaseTrackerApplication.class, args);
	}

}
