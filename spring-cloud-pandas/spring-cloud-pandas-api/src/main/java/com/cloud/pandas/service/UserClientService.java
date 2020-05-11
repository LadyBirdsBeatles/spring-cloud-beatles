package com.cloud.pandas.service;


import com.cloud.pandas.pojo.Users;
import com.cloud.pandas.service.impl.UserClientServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author xiaochen
 * @Description
 * @Date 11:28 2020/5/10
 * @Param
 * @Return
 **/
@Component
@FeignClient(value = "SPRING-CLOUD-PANDAS-PROVIDER-USER", fallbackFactory = UserClientServiceFallbackFactory.class)
public interface UserClientService {
    @PostMapping("/user")
    public boolean showUser();

    @PostMapping("/user/addUser")
    public boolean addUser(String users);

    @GetMapping("/user/getUid/{id}")
    public Users getUid(@PathVariable("id") long id);

    @GetMapping("/user/getUser")
    public List getUserAll();
}
