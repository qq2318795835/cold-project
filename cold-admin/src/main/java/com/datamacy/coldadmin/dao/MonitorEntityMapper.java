package com.datamacy.coldadmin.dao;

import com.datamacy.common.admin.entity.MonitorEntity;

/**
* Created by Mybatis Generator on 2023/01/06
*/
public interface MonitorEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(MonitorEntity record);

    int insertSelective(MonitorEntity record);

    MonitorEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MonitorEntity record);

    int updateByPrimaryKey(MonitorEntity record);
}