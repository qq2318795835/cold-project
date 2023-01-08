package com.datamacy.coldadmin.dao;

import com.datamacy.common.admin.entity.MeterEntity;

/**
* Created by Mybatis Generator on 2023/01/06
*/
public interface MeterEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(MeterEntity record);

    int insertSelective(MeterEntity record);

    MeterEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MeterEntity record);

    int updateByPrimaryKey(MeterEntity record);
}