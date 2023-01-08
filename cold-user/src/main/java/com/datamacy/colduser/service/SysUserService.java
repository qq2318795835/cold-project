package com.datamacy.colduser.service;


import com.datamacy.common.user.entity.SysUserEntity;

/**
 * 系统用户
 *
 *
 */
public interface SysUserService{
	/**
	 * 根据用户名，查询系统用户
	 */
	SysUserEntity queryByUserName(String username);
}
