package com.air;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
//@ComponentScan("com.air")
public class EtherwApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtherwApplication.class, args);
	}


}
