package com.tipstocode.springvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tipstocode.*"})
public class SpringvalidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringvalidationApplication.class, args);
	}

}
