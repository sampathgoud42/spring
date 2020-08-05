package com.tipstocode.springbootmongocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tipstocode.*"})
public class SpringbootmongocrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmongocrudApplication.class, args);
	}

}
