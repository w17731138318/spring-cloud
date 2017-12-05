package com.xrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
//		new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
	}
}
