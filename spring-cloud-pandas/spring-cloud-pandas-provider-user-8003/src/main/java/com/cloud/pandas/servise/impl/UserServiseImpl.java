package com.cloud.pandas.servise.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cloud.pandas.mapper.UserMapper;
import com.cloud.pandas.pojo.Users;
import com.cloud.pandas.servise.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiseImpl implements UserServise {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean adduser(String user) {
        JSONObject jsonObject = JSON.parseObject(user);
        Users users = new Users();
        users.setUserName(jsonObject.getString("username"));
        users.setUserPassword(jsonObject.getString("userpassword"));
        users.setUserPhoneNumber(jsonObject.getString("userphonenuber"));
        return userMapper.adduser(users);
    }

    @Override
    public Users queryuserid(long id) {
        return userMapper.queryuserid(id);
    }

    @Override
    public List<Users> queryuser() {
        return userMapper.queryuser();
    }

}
