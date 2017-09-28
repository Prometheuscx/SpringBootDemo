package com.silvanspace.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication();
		//屏蔽从命令行读取设置属性
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(DemoApplication.class, args);
	}
}
