package com.tipstocode.captchavalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.tipstocode.captcha.CaptchaServlet;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tipstocode.*"})
public class CaptchavalidationApplication {
	

	@Bean
	public ServletRegistrationBean customServletBean() {
	    ServletRegistrationBean bean = new ServletRegistrationBean(new CaptchaServlet(), "/secure/captcha/captcha.jpg");
	    return bean;
	}

	public static void main(String[] args) {
		SpringApplication.run(CaptchavalidationApplication.class, args);
	}

}
