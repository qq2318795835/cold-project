package com.datamacy.coldadmin;

import com.datamacy.coldadmin.dao.CompanyEntityMapper;
import com.datamacy.common.admin.entity.CompanyEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.List;

@SpringBootTest
class ColdAdminApplicationTests {

    @Autowired
    CompanyEntityMapper companyEntityMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void selectForPage(){
        List<CompanyEntity> companyEntities = companyEntityMapper.selectForPage(10, 10);
        for (CompanyEntity c:companyEntities) {
            System.out.println(c.toString());
        }
    }

    @Test
    void selectByPrimaryKey(){
        CompanyEntity a1 = companyEntityMapper.selectByPrimaryKey("a1");
        System.out.println(a1);
    }
    @Test
    void deleteByPrimaryKey(){
        companyEntityMapper.deleteByPrimaryKey("a9");
    }

    @Test
    void insertSelective(){
        CompanyEntity a = new CompanyEntity();
        a.setId("a9");
        a.setCompany("阿里巴巴");
        a.setAbbreviation("阿里");
        a.setCompanyNumber("001001");
        a.setCompanyAddress("杭州");
        a.setCompanyPhone("8888");
        a.setManagementName("李经理");
        a.setManagementPhone("18202223082");
        a.setLeader("杨经理");
        a.setLeaderPhone("18202223082");
        a.setMessage("156489456415458");
        a.setWebAddress("北京");
        a.setCompanyType("互联网");
        a.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        a.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        companyEntityMapper.insertSelective(a);
    }

    @Test
    void updateByPrimaryKeySelective(){
        CompanyEntity a = new CompanyEntity();
        a.setId("a9");
        a.setCompany("京东商城");
        a.setAbbreviation("京东");
        a.setCompanyNumber("625188");
        a.setCompanyAddress("北京");
        a.setCompanyPhone("8888");
        a.setManagementName("李经理");
        a.setManagementPhone("18202223082");
        a.setLeader("杨经理");
        a.setLeaderPhone("18202223082");
        a.setMessage("156489456415458");
        a.setWebAddress("北京");
        a.setCompanyType("互联网");
        a.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        a.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        companyEntityMapper.updateByPrimaryKeySelective(a);
    }
}
