package com.vscode.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication

public class ProjectApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
