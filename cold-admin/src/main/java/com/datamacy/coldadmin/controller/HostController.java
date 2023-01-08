package com.datamacy.coldadmin.controller;

import com.datamacy.coldadmin.service.HostService;
import com.datamacy.common.admin.entity.HostEntity;
import com.datamacy.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.UUID;


/**
 * 主机表
 *
 */
@RestController
@RequestMapping("admin/host")
public class HostController {
    @Autowired
    private HostService hostService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Integer start,@RequestParam Integer pageSize){
        Map<String, Object> resMap = hostService.selectForPage(start, pageSize);

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
		HostEntity host = hostService.getHostById(id);

        return Result.ok().put("host", host);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody HostEntity host){
        String uuid = UUID.randomUUID().toString();
        host.setId(uuid);
		hostService.addHost(host);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody HostEntity host){
		hostService.updateHost(host);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete/{id}")
    public Result delete(@PathVariable String id){
		hostService.delHost(id);

        return Result.ok();
    }
}
