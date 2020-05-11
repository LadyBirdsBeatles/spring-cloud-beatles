package com.cloud.pandas.controller;

import com.cloud.pandas.pojo.Users;
import com.cloud.pandas.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 客服端使用ribbon做负载均衡
 */
@Controller
@RequestMapping("/consumer")
public class UserConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    // private static final String REST_URL = "http://localhost:8001";
    private static final String REST_URL = "http://SPRING-CLOUD-PANDAS-PROVIDER-USER"+"/user";

   @Autowired
    UserClientService service;
    @RequestMapping("/")
    @ResponseBody
    public String showuser() {
        return restTemplate.postForObject(REST_URL, "", String.class);
    }

    @ResponseBody
    @RequestMapping(value = "/addUser", produces = {"application/json;charset=UTF-8"})
    public boolean adduser(@RequestBody String data) {
        System.out.println(data);
        return restTemplate.postForObject(REST_URL + "/addUser", data, Boolean.class);
    }

    @ResponseBody
    @RequestMapping(value = "/getUid/{id}", produces = {"application/json;charset=UTF-8"})
    public Users queryuid(@PathVariable long id) {
        System.out.println(id);
        return restTemplate.getForObject(REST_URL + "/getUid/" + id, Users.class);
    }

    @ResponseBody
    @RequestMapping(value = "/getUser", produces = {"application/json;charset=UTF-8"})
    public List queryuser() {
        System.out.println(REST_URL);
        List user = restTemplate.getForObject(REST_URL + "/getUser", List.class);
        assert user != null;
        for (Object users : user) {
            System.out.println(users);
        }
        return user;
    }
}
