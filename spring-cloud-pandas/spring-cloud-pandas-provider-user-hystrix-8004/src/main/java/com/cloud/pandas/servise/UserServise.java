package com.cloud.pandas.servise;





import com.cloud.pandas.pojo.Users;

import java.util.List;


public interface UserServise {
    public boolean adduser(String user);

    public Users queryuserid(long id);

    public List<Users> queryuser();
}
