package io.lpd.orderfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "PROVIDER-PAYMENT-8001", configuration = MySelfRule.class)
public class Order80 {

    public static void main(String[] args) {
        SpringApplication.run(Order80.class, args);
    }
}
