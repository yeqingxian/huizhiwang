package com.edu.huizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HuizhiManageClient18101Application {

	public static void main(String[] args) {
		SpringApplication.run(HuizhiManageClient18101Application.class, args);
	}

}
