package com.datamacy.colduser.service.impl;

import com.datamacy.colduser.dao.SysUserEntityMapper;
import com.datamacy.colduser.service.SysUserService;
import com.datamacy.common.user.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 系统用户
 *
 *
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	SysUserEntityMapper sysUserEntityMapper;

	@Override
	public SysUserEntity queryByUserName(String username) {
		return sysUserEntityMapper.queryByUserName(username);

	}

}