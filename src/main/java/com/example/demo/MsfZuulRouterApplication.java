package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class MsfZuulRouterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsfZuulRouterApplication.class, args);
	}
	@RequestMapping("/abcd")
	String hi() {
		return "hi from zuul";
	}
	
	@Bean
	MyZuulFilter myZuulFilter() {
		return new MyZuulFilter();
	}
}
