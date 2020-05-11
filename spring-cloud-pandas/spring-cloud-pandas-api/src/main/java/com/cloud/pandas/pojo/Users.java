package com.cloud.pandas.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author xiaochen
 */
@Data
@Accessors(chain = true)
public class Users implements Serializable {
    private int userId;
    private String userName;
    private String userPassword;
    private String userPhoneNumber;
    private String userSources;
}
