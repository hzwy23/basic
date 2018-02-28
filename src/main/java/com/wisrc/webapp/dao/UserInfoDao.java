package com.wisrc.webapp.dao;

import com.wisrc.webapp.entity.SysSecUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoDao {
    @Select("select user_id as userId, user_passwd as userPasswd from sys_sec_user")
    List<SysSecUser> getAll();
}
