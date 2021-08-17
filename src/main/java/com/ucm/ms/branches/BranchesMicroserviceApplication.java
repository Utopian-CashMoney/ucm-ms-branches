package com.ucm.ms.branches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// Excluded spring security. Will do later.
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BranchesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BranchesMicroserviceApplication.class, args);
	}

}
