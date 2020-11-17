package com.appdevloper.photoapp.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDiscoveryClient
@PropertySource("classpath:application.properties")
public class PhotoAppUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppUsersApplication.class, args);
	}

}
 