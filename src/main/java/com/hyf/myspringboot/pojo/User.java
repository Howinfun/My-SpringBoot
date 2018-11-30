package com.hyf.myspringboot.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author howinfun
 * @version 1.0
 * @desc
 * @date 2018/11/29
 * @company XMJBQ
 */
@Table(name="t_user")
@ApiModel(description = "用户表")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(name = "主键")
    private Integer id;

    @ApiModelProperty(name="用户名")
    private String userName;

    @ApiModelProperty(name="密码")
    private String password;

    @ApiModelProperty(name="年龄")
    private Integer userAge;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(name = "生日")
    private LocalDateTime birthday;

    @ApiModelProperty(name = "是否被锁定")
    private Boolean locked;

    public User() {
    }

    public User(String userName, String password,Integer userAge, LocalDateTime birthday) {
        this.userName = userName;
        this.password = password;
        this.userAge = userAge;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userAge='" + userAge + '\'' +
                ", birthday=" + birthday +
                ", locked=" + locked +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}
