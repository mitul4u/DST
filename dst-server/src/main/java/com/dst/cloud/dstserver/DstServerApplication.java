package com.dst.cloud.dstserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DstServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DstServerApplication.class, args);
	}
}
