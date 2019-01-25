package com.cxsl.ims;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxsl.ims.impl.dao")
public class ImsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ImsApplication.class, args);
	}
}
