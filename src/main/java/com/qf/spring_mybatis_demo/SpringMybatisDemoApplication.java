package com.qf.spring_mybatis_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
@EnableTransactionManagement
public class SpringMybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisDemoApplication.class, args);
	}

}

