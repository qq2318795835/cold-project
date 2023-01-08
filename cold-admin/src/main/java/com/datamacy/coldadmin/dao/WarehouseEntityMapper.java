package com.datamacy.coldadmin.dao;

import com.datamacy.common.admin.entity.WarehouseEntity;

/**
* Created by Mybatis Generator on 2023/01/06
*/
public interface WarehouseEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(WarehouseEntity record);

    int insertSelective(WarehouseEntity record);

    WarehouseEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WarehouseEntity record);

    int updateByPrimaryKey(WarehouseEntity record);
}