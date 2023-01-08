package com.datamacy.coldadmin.service.impl;

import com.datamacy.coldadmin.dao.CompanyEntityMapper;
import com.datamacy.coldadmin.service.CompanyService;
import com.datamacy.common.admin.entity.CompanyEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("companyService")
@Slf4j
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyEntityMapper companyEntityMapper;

    @Override
    public Map<String, Object> selectForPage(Integer start, Integer pageSize) {
        Map<String,Object> resMap = new HashMap<>();
        if (start > 0 && pageSize >0){
            List<CompanyEntity> companyList = companyEntityMapper.selectForPage(((start - 1) * pageSize), pageSize);
            if (companyList !=null){
                resMap.put("items",companyList);
                resMap.put("total",pageSize);
                resMap.put("page",start);
                resMap.put("msg","success");
                resMap.put("code","0");
                return resMap;
            }else {
                log.error("cold-admin ---> companyService ---> selectForPage : resMap.companyList is null");
            }
        }else {
            log.error("cold-admin ---> companyService ---> selectForPage : params is not right");
        }
        return resMap;
    }

    @Override
    public CompanyEntity getCompanyById(String id) {
        return companyEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addCompany(CompanyEntity company) {
        return companyEntityMapper.insertSelective(company);
    }

    @Override
    public int updateCompany(CompanyEntity company) {
        return companyEntityMapper.updateByPrimaryKey(company);
    }

    @Override
    public int delCompany(String id) {
        return companyEntityMapper.deleteByPrimaryKey(id);
    }
}
