package com.edu.huizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HuizhiEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuizhiEurekaServerApplication.class, args);
	}

}
