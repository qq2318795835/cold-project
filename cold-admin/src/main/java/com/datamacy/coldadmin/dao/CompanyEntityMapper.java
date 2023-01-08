package com.datamacy.coldadmin.dao;

import com.datamacy.common.admin.entity.CompanyEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* Created by Mybatis Generator on 2023/01/06
*/
@Repository
public interface CompanyEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(CompanyEntity record);

    int insertSelective(CompanyEntity record);

    CompanyEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CompanyEntity record);

    int updateByPrimaryKey(CompanyEntity record);

    List<CompanyEntity> selectForPage (@Param("start") Integer start,@Param("pageSize") Integer pageSize);

}