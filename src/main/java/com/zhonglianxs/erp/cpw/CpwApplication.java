package com.zhonglianxs.erp.cpw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CpwApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpwApplication.class, args);
	}
}
