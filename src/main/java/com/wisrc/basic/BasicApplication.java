package com.wisrc.basic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan(
   basePackages = {"com.wisrc.webapp.dao"}
)
@ComponentScan(
   basePackages = {"com"}
)
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(
    basePackages = {"com"},
    defaultConfiguration = FeignConfiguration.class
)
@ImportResource(locations = {"bean/spring-config.xml"})
public class BasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }
}
