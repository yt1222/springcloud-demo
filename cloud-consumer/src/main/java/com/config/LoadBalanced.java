package com.config;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yt
 * @description 第一种
 * 1.在CloudDemoConsumerApplication类上级新建包config，然后新建LoanBalanced类。使用此类注册一个IRule以达到替换Eureka的目的
 * 2.在CloudDemoConsumerApplication类上添加注解
 * @date 2019/2/13
 **/

@Configuration
public class LoadBalanced {

    @Bean
    public IRule ribbonRule() {
        return new RoundRobinRule(); //轮询
//        return new WeightedResponseTimeRule(); //加权重
//        return new RetryRule(); //带有重试机制的轮询
//        return new RandomRule(); //随机
    }
}
