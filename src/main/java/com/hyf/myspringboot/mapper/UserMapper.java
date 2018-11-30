package com.hyf.myspringboot.mapper;

import com.hyf.myspringboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author howinfun
 * @version 1.0
 * @desc t_user 操作，继承BaseMapper<T>就可以进行增删改查等基础操作。还可以自己添加复杂的方法（注解或者xml形式）
 * @date 2018/11/29
 * @company XMJBQ
 */
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {

    @Select("select id,user_name,password,user_age,birthday,locked from t_user where user_name = #{userName}")
    public User findUserByName(@Param("userName") String userName);
}
