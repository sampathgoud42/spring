package com.tipstocode.springbootmongocrud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import com.tipstocode.model.EntityAuditing;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tipstocode.*"})
@EnableMongoAuditing
public class SpringbootmongocrudApplication {
	
	@Bean
    public AuditorAware<String> auditorAware(){
        return new EntityAuditing();
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmongocrudApplication.class, args);
	}

}
