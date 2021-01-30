package com.mohshub.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MohshubServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MohshubServiceRegistryApplication.class, args);
	}

}
