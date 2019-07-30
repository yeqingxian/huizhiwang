package com.edu.huizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@MapperScan("com.edu.huizhi.dao")
@EnableEurekaClient
@SpringBootApplication
public class HuizhiCourseProvider19101Application {

	public static void main(String[] args) {
		SpringApplication.run(HuizhiCourseProvider19101Application.class, args);
	}

}
