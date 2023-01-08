package com.datamacy.colduser.dao;

import com.datamacy.common.user.entity.SysUserTokenEntity;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2023/01/01
*/
@Repository
public interface SysUserTokenEntityMapper {
    int deleteByPrimaryKey(Long user_id);

    int insert(SysUserTokenEntity record);

    int insertSelective(SysUserTokenEntity record);

    SysUserTokenEntity selectByPrimaryKey(Long user_id);

    int updateByPrimaryKeySelective(SysUserTokenEntity record);

    int updateByPrimaryKey(SysUserTokenEntity record);

    SysUserTokenEntity queryByToken(String token);

    int deleteByToken(String token);
}