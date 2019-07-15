package me.silentdoer.demoeurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaProviderApplication.class, args);
    }

}
