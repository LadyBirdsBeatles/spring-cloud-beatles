package com.cloud.pandas.controller;

import com.cloud.pandas.pojo.Users;
import com.cloud.pandas.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping("/feign")
public class FeigeConsumerController {

    @Autowired
    private UserClientService service;

    @RequestMapping("/")
    @ResponseBody
    public boolean showUser() {
        return service.showUser();
    }

    @ResponseBody
    @RequestMapping(value = "/addUser", produces = {"application/json;charset=UTF-8"})
    public boolean adduser(@RequestBody String data) {
        System.out.println(data);
        return service.addUser(data);
    }

    @ResponseBody
    @RequestMapping(value = "/getUid/{id}", produces = {"application/json;charset=UTF-8"})
    public Users queryuid(@PathVariable long id) {
        System.out.println(id);
        return service.getUid(id);
    }

    @ResponseBody
    @RequestMapping(value = "/getUser", produces = {"application/json;charset=UTF-8"})
    public List queryuser() {
        List user = service.getUserAll();
        assert user != null;
        for (Object users : user) {
            System.out.println(users);
        }
        return user;
    }
}
