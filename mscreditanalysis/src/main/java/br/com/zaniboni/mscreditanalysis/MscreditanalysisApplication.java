package br.com.zaniboni.mscreditanalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MscreditanalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscreditanalysisApplication.class, args);
	}

}
