package org.sam.tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class TmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(TmsApplication.class, args);
	}
}
