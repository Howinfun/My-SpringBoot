package com.hyf.myspringboot.controller;

import com.hyf.myspringboot.common.PageBean;
import com.hyf.myspringboot.common.ResponseJson;
import com.hyf.myspringboot.pojo.User;
import com.hyf.myspringboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@Api(description = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/insertUser")
    @ApiOperation(value = "插入用户")
    @ApiImplicitParam(name = "user", value = "用户")
    public ResponseJson insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @GetMapping("/user/getUser")
    @ApiOperation(value = "根据id获取用户")
    @ApiImplicitParam(name = "user", value = "用户")
    public ResponseJson getUserById(@RequestBody User user){
        return userService.getUserById(user.getId());
    }


    @DeleteMapping("/user/delUser")
    @ApiOperation(value = "根据id删除用户")
    @ApiImplicitParam(name = "user", value = "用户")
    public ResponseJson delUserById(@RequestBody User user){
        return userService.delUserById(user.getId());
    }

    @GetMapping("/user/getList")
    @ApiOperation(value = "获取用户列表")
    public ResponseJson getUseList(){
        return userService.getUserList();
    }

    @PutMapping("/user/updateUser")
    public ResponseJson updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PostMapping("/user/getListByPage")
    @ApiOperation(value = "分页查询用户")
    @ApiImplicitParam(name = "pageBean", value = "分页实体")
    public ResponseJson getListByPage(PageBean<User> pageBean){
        return userService.getUerListByPage(pageBean);
    }
}
