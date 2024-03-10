package com.example.api_calls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiCallsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCallsApplication.class, args);
	}

}
