package com.cloud.pandas.controller;

import com.cloud.pandas.pojo.Users;
import com.cloud.pandas.servise.UserServise;
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

    @Autowired
    DiscoveryClient client;

    @RequestMapping("/")
    @ResponseBody
    public String showuser() {
        List<String> services = client.getServices();
        for (String service : services) {
            System.out.println("service: "+service);
        }
        List<ServiceInstance> instances = client.getInstances("SPRING-CLOUD-PANDAS-PROVIDER-USER");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost());
            System.out.println(instance.getInstanceId());
            System.out.println(instance.getMetadata());
            System.out.println(instance.getPort());
            System.out.println(instance.getScheme());
            System.out.println(instance.getUri());
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public boolean adduser(@RequestBody String data) {
        System.out.println(data);
        return userServise.adduser(data);
    }

    @ResponseBody
    @RequestMapping(value = "/getUid/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Users queryuid(@PathVariable long id) {
        System.out.println(id);
        return userServise.queryuserid(id);
    }

    @ResponseBody
    @RequestMapping(value = "/getUser", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List queryuser() {
        for (Users o : userServise.queryuser()) {
            System.out.println(o);
        }
        return userServise.queryuser();
    }
}
