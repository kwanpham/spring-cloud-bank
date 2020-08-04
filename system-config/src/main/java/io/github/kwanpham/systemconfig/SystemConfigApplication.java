package io.github.kwanpham.systemconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SystemConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemConfigApplication.class, args);
    }

}
