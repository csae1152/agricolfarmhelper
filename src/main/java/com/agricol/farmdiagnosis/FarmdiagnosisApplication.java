package com.agricol.farmdiagnosis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrix
/**
 * @autor Helmut Steiner
 *
 */
public class FarmdiagnosisApplication {
	public static void main(String[] args) {
		run(FarmdiagnosisApplication.class, args);
	}
}
