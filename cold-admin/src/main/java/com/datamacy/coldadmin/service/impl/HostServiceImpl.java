package com.datamacy.coldadmin.service.impl;

import com.datamacy.coldadmin.dao.HostEntityMapper;
import com.datamacy.coldadmin.service.HostService;
import com.datamacy.common.admin.entity.HostEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("HostService")
@Slf4j
public class HostServiceImpl implements HostService {
    @Autowired
    private HostEntityMapper hostEntityMapper;

    @Override
    public Map<String, Object> selectForPage(Integer start, Integer pageSize) {
        Map<String,Object> resMap = new HashMap<>();
        if (start > 0 && pageSize >0){
            List<HostEntity> hostList = hostEntityMapper.selectForPage(((start - 1) * pageSize), pageSize);
            if (hostList !=null){
                resMap.put("items",hostList);
                resMap.put("total",pageSize);
                resMap.put("page",start);
                resMap.put("msg","success");
                resMap.put("code","0");
                return resMap;
            }else {
                log.error("cold-admin ---> HostService ---> selectForPage : resMap.hostList is null");
            }
        }else {
            log.error("cold-admin ---> HostService ---> selectForPage : params is not right");
        }
        return resMap;
    }

    @Override
    public HostEntity getHostById(String id) {
        return hostEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addHost(HostEntity host) {
        return hostEntityMapper.insertSelective(host);
    }

    @Override
    public int updateHost(HostEntity host) {
        return hostEntityMapper.updateByPrimaryKey(host);
    }

    @Override
    public int delHost(String id) {
        return hostEntityMapper.deleteByPrimaryKey(id);
    }
}
