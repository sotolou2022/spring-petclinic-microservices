package com.roomstogo.rtgorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableConfigurationProperties()
@ComponentScan(basePackages = {"com.roomstogo.rtgorder"}) // to ensure spring finds all packages
@SpringBootApplication
@EnableDiscoveryClient
public class RtgOrderReversalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtgOrderReversalApplication.class, args);
	}

}
