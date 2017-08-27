package com.ricelink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ricelink")
@ServletComponentScan("com.ricelink")
@SpringBootApplication
public class NobeeWeixinIpadApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NobeeWeixinIpadApiApplication.class, args);

	}
}
