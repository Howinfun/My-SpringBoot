package com.hyf.myspringboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyf.myspringboot.common.PageBean;
import com.hyf.myspringboot.common.ResponseJson;
import com.hyf.myspringboot.mapper.UserMapper;
import com.hyf.myspringboot.pojo.User;
import com.hyf.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author howinfun
 * @version 1.0
 * @desc
 * @date 2018/11/29
 * @company XMJBQ
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public ResponseJson insertUser(User user) {
        ResponseJson json = new ResponseJson();
        try {
            Integer result = userMapper.insert(user);
            if(result == 1){
                json.setData(user);
                json.setMsg("添加用户成功");
            }else{
                json.setCode(400);
                json.setSuccess(false);
                json.setMsg("添加用户失败");
            }
        }catch (Exception e){
            json.setCode(500);
            json.setSuccess(false);
            return json;
        }
        return json;
    }

    public ResponseJson getUserById(Integer id) {
        ResponseJson json = new ResponseJson();
        try {
            User user = new User();
            user.setId(id);
            user = userMapper.selectOne(user);
            if(user != null){
                json.setData(user);
                json.setMsg("查询用户成功");
            }else{
                json.setCode(400);
                json.setSuccess(false);
                json.setMsg("查询用户失败");
            }
        }catch (Exception e){
            json.setCode(500);
            json.setSuccess(false);
            return json;
        }
        return json;
    }

    public ResponseJson getUserList() {
        ResponseJson json = new ResponseJson();
        try {
            List<User> list  = userMapper.selectAll();
            json.setData(list);
            json.setMsg("查询列表成功");
        }catch (Exception e){
            json.setCode(500);
            json.setSuccess(false);
            return json;
        }
        return json;
    }

    public ResponseJson updateUser(User user) {
        ResponseJson json = new ResponseJson();
        try {
            // updateByPrimaryKeySelective 根据主键，更新不为空的字段
            Integer result = userMapper.updateByPrimaryKeySelective(user);
            if(result == 1){
                json.setMsg("更新用户成功");
            }else{
                json.setCode(400);
                json.setSuccess(false);
                json.setMsg("更新用户失败");
            }
        }catch (Exception e){
            json.setCode(500);
            json.setSuccess(false);
            return json;
        }
        return json;

    }

    public ResponseJson delUserById(Integer id) {
        ResponseJson json = new ResponseJson();
        try {
            // updateByPrimaryKeySelective 根据主键，更新不为空的字段
            Integer result = userMapper.deleteByPrimaryKey(id);
            if(result == 1){
                json.setMsg("删除用户成功");
            }else{
                json.setCode(400);
                json.setSuccess(false);
                json.setMsg("删除用户失败");
            } }catch (Exception e){
            json.setCode(500);
            json.setSuccess(false);
            return json;
        }
        return json;
    }


    public ResponseJson getUerListByPage(PageBean<User> pageBean) {
        ResponseJson json = new ResponseJson();
        try {
            //根据当前页面和每页记录数查询出数据列表
            PageHelper.startPage(pageBean.getCurrentPage(),pageBean.getPageSize());
            List<User> list = userMapper.selectAll();
            pageBean.setDataList(list);
            //查询总数
            Integer totalRecord = userMapper.selectCount(new User());
            pageBean.setTotalRecord(totalRecord.longValue());
            json.setData(pageBean);
            json.setMsg("分页查询成功");
        }catch (Exception e){
            json.setCode(500);
            json.setSuccess(false);
            return json;
        }
        return json;
    }
}
