package com.datamacy.coldadmin.dao;

import com.datamacy.common.admin.entity.HostEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator on 2023/01/06
*/
public interface HostEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(HostEntity record);

    int insertSelective(HostEntity record);

    HostEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HostEntity record);

    int updateByPrimaryKey(HostEntity record);

    List<HostEntity> selectForPage (@Param("start") Integer start, @Param("pageSize") Integer pageSize);
}