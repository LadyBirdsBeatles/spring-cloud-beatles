package com.cloud.pandas.service.impl;


import com.cloud.pandas.pojo.Users;
import com.cloud.pandas.service.UserClientService;
import feign.hystrix.FallbackFactory;

import java.util.List;

/**
 * @Author xiaochen
 * @Description 降级使用
 * @Date 15:17 2020/5/11
 * @Param
 * @Return
 **/
public class UserClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public UserClientService create(Throwable throwable) {
        return new UserClientService() {
            @Override
            public boolean showUser() {
                return false;
            }

            @Override
            public boolean addUser(String users) {
                return false;
            }

            @Override
            public Users getUid(long id) {
                return new Users().setUserId((int) id).setUserName("no" + id + "没有对应的信息,客服端提供了降级信息,这个服务已经被关闭").setUserSources("没有数据");
            }

            @Override
            public List getUserAll() {
                return null;
            }


        };
    }
}
