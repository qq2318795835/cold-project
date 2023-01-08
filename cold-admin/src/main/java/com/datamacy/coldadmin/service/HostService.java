package com.datamacy.coldadmin.service;
import com.datamacy.common.admin.entity.HostEntity;
import java.util.Map;

public interface HostService{
    Map<String,Object> selectForPage(Integer start, Integer pageSize);

    HostEntity getHostById(String id);

    int addHost(HostEntity host);

    int updateHost(HostEntity host);

    int delHost(String id);
}

