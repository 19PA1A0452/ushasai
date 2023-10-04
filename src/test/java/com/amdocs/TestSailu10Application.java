package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSailu10Application {

	public static void main(String[] args) {
		SpringApplication.from(Sailu10Application::main).with(TestSailu10Application.class).run(args);
	}

}
