package com.hyf.myspringboot.controller;

import com.hyf.myspringboot.common.PageBean;
import com.hyf.myspringboot.common.ResponseJson;
import com.hyf.myspringboot.pojo.User;
import com.hyf.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author howinfun
 * @version 1.0
 * @desc
 * @date 2018/11/22
 * @company XMJBQ
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/insertUser")
    public ResponseJson insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @GetMapping("/user/getUser")
    public ResponseJson getUserById(@RequestBody User user){
        return userService.getUserById(user.getId());
    }

    @DeleteMapping("/user/delUser")
    public ResponseJson delUserById(@RequestBody User user){
        return userService.delUserById(user.getId());
    }

    @GetMapping("/user/getList")
    public ResponseJson getUseList(){
        return userService.getUserList();
    }

    @PutMapping("/user/updateUser")
    public ResponseJson updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PostMapping("/user/getListByPage")
    public ResponseJson getListByPage(PageBean<User> pageBean){
        return userService.getUerListByPage(pageBean);
    }
}
