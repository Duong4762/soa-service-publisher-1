package org.example.servicepublisher1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicePublisher1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServicePublisher1Application.class, args);
    }

}
