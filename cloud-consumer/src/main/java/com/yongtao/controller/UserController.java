package com.yongtao.controller;

import com.yongtao.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yt
 * @description TODO
 * @date 2019/2/13
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable Long id) {
        return restTemplate.getForObject("http://provider-demo/user/getUser/" + id, User.class);
    }
}
