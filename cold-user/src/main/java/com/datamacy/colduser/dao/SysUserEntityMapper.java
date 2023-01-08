package com.datamacy.colduser.dao;

import com.datamacy.common.user.entity.SysUserEntity;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2023/01/01
*/
@Repository
public interface SysUserEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserEntity record);

    int insertSelective(SysUserEntity record);

    SysUserEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserEntity record);

    int updateByPrimaryKey(SysUserEntity record);

    SysUserEntity queryByUserName(String userName);
}