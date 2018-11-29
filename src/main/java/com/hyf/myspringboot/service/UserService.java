package com.hyf.myspringboot.service;

import com.hyf.myspringboot.common.PageBean;
import com.hyf.myspringboot.common.ResponseJson;
import com.hyf.myspringboot.pojo.User;

/**
 * @author howinfun
 * @version 1.0
 * @desc
 * @date 2018/11/29
 * @company XMJBQ
 */
public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     */
    public ResponseJson insertUser(User user);

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    public ResponseJson getUserById(Integer id);

    public ResponseJson getUserList();

    public ResponseJson updateUser(User user);

    public ResponseJson delUserById(Integer id);

    public ResponseJson getUerListByPage(PageBean<User> pageBean);
}
