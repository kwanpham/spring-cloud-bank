package io.github.kwanpham.systemregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SystemRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemRegistryApplication.class, args);
    }

}
