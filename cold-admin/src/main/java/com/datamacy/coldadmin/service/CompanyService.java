package com.datamacy.coldadmin.service;

import com.datamacy.common.admin.entity.CompanyEntity;
import java.util.Map;

/**
 * 企业信息表
 *
 */
public interface CompanyService {

    Map<String,Object> selectForPage(Integer start, Integer pageSize);

    CompanyEntity getCompanyById(String id);

    int addCompany(CompanyEntity company);

    int updateCompany(CompanyEntity company);

    int delCompany(String id);
}

