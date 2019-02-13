package com.yongtao.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author yt
 * @description 开启了权限验证并且SpringBoot版本为2.0以上的话还需要一个操作,因为2.0默认开启了csrf，如果我们现在直接启动Eureka服务的话客户端是注册不上的，所以需要把csrf关闭
 * @date 2019/2/13
 **/
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
