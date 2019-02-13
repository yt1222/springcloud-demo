package com.yongtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yt
 * @description TODO
 * @date 2019/2/13
 **/

@SpringBootApplication
@EnableEurekaServer
public class CloudDemoEureApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDemoEureApplication.class, args);
    }
}
