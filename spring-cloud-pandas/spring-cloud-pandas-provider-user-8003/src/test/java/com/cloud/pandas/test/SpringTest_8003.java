package com.cloud.pandas.test;

import com.cloud.pandas.pojo.Users;
import com.cloud.pandas.servise.UserServise;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTest_8003 {

    @Autowired
    private UserServise userServise;

    @Test
    public void getBean() {
        for (Users o : userServise.queryuser()) {
            System.out.println(o);
        }
        System.out.println(userServise.queryuserid(1));
    }
}
