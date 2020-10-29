package io.lpd.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConFigClient3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConFigClient3355.class, args);
    }

}
