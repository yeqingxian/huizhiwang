package com.edu.huizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class HuizhiNanageFeign18201Application {

	public static void main(String[] args) {
		SpringApplication.run(HuizhiNanageFeign18201Application.class, args);
	}

}
