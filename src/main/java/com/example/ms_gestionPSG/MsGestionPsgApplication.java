package com.example.ms_gestionPSG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsGestionPsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionPsgApplication.class, args);
	}

}
