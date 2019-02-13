package com.yongtao;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Configuration;

/**
 * @author yt
 * @description TODO
 * 1.自定义一个注解
 * public @interface ExcludeFromComponentScan { }
 * 2.类使用刚才自定义的注解标示
 * 3.Application中指定包扫描忽略使用上方注解的类，然后注册规则
 * @date 2019/2/13
 **/
@Configuration
@ExcludeFromComponentScan
public class AvoidLoanbalanced {
    public IRule ribbonRule() {
        return new RoundRobinRule();
    }
}
