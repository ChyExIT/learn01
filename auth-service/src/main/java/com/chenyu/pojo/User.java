package com.chenyu.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("itcast_auth_user") // 交易订单表
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private long id;
    private String account;
    private String name;
    private long orgId;
    private long stationId;
    private String email;
    private String mobile;
    private String sex;
    private String status;
    private String avatar;
    private String workDescribe;
    private java.sql.Timestamp passwordErrorLastTime;
    private long passwordErrorNum;
    private java.sql.Timestamp passwordExpireTime;
    private String password;
    private java.sql.Timestamp lastLoginTime;
    private long superior;
    private String administrator;
    private long createUser;
    private java.sql.Timestamp createTime;
    private long updateUser;
    private java.sql.Timestamp updateTime;
}
