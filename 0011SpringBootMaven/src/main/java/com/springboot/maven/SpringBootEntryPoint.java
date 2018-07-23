package com.springboot.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.springboot.maven")
@EnableJpaRepositories("com.springboot.maven.repository")
@EntityScan ("com.springboot.maven.entity")
public class SpringBootEntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootEntryPoint.class, args);
	}

}
