package com.cloud.pandas.controller;

import com.cloud.pandas.pojo.Users;
import com.cloud.pandas.servise.UserServise;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xiaochen
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServise userServise;


    @RequestMapping("/")
    @ResponseBody
    public String showUser() {
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public boolean addUser(@RequestBody String data) {
        System.out.println(data);
        return userServise.adduser(data);
    }

    @HystrixCommand(fallbackMethod = "hystrixGetUid")
    @ResponseBody
    @RequestMapping(value = "/getUid/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Users getUid(@PathVariable long id) {
        System.out.println(id);
        Users queryuserid = userServise.queryuserid(id);
        if (queryuserid == null) {
            throw new RuntimeException("id--> " + id + ", 不存在该用户,或用户不存在~");
        }
        return userServise.queryuserid(id);
    }

    //备选方法
    public Users hystrixGetUid(@PathVariable long id) {
        return new Users().setUserId((int) id).setUserName("id--> " + id + ", 没有对应的信息,null~@hystrix").setUserSources("no this database in MySQL");
    }

    @ResponseBody
    @RequestMapping(value = "/getUser", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List getUser() {
        for (Users o : userServise.queryuser()) {
            System.out.println(o);
        }
        return userServise.queryuser();
    }


}
