package com.datamacy.coldadmin.controller;

import com.datamacy.coldadmin.service.CompanyService;
import com.datamacy.common.admin.entity.CompanyEntity;
import com.datamacy.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.UUID;


/**
 * 企业信息表
 */
@RestController
@RequestMapping("admin/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Integer start,@RequestParam Integer pageSize){
        Map<String, Object> resMap = companyService.selectForPage(start, pageSize);

        if (resMap != null){
            return Result.ok(resMap);
        }else {
            return Result.error(601,"resMap is null");
        }
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") String id){
		CompanyEntity company = companyService.getCompanyById(id);
        return Result.ok().put("company", company);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody CompanyEntity company){
        String uuid = UUID.randomUUID().toString();
        company.setId(uuid);

		companyService.addCompany(company);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody CompanyEntity company){
		companyService.updateCompany(company);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(String id){
        companyService.delCompany(id);

        return Result.ok();
    }

}
