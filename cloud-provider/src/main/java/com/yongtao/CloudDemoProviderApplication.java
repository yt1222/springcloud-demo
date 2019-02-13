package com.yongtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yt
 * @description TODO
 * @date 2019/1/30
 **/

@SpringBootApplication
@EnableEurekaClient
public class CloudDemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDemoProviderApplication.class, args);
    }
}
