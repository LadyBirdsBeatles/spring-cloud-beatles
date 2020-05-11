package com.cloud.pandas.mapper;
import com.cloud.pandas.pojo.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Insert(value = "INSERT INTO users(user_name,user_password,user_phonenumber,user_sources)" + "Values(#{userName},#{userPhonenumber},#{userPassword},DATABASE())")
    public boolean adduser(Users user);
    @Results({
            @Result(property = "userId", column = "users_id"),
            @Result(property = "userName", column = "users_name"),
            @Result(property = "userPassword", column = "users_password"),
            @Result(property = "userPhoneNumber", column = "users_phonenumber"),
            @Result(property = "userSources", column = "user_sources")
    })
    @Select(value = "select users_id,users_name,users_password,users_phonenumber,user_sources from users where users_id=#{userId}")
    public Users queryuserid(@Param("userId") long userId);

    @Results(
            id = "userId", value = {
            @Result(property = "userId", column = "users_id"),
            @Result(property = "userName", column = "users_name"),
            @Result(property = "userPassword", column = "users_password"),
            @Result(property = "userPhoneNumber", column = "users_phonenumber"),
            @Result(property = "userSources", column = "user_sources")
        })
    @Select(value = "select *from  users")
    public List<Users> queryuser();
}
