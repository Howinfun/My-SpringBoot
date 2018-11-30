package com.hyf.myspringboot.mapper;

import com.hyf.myspringboot.pojo.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author howinfun
 * @version 1.0
 * @desc
 * @date 2018/11/29
 * @company XMJBQ
 */
@Mapper
@Component
public interface UserRoleMapper extends BaseMapper<UserRole> {
}
