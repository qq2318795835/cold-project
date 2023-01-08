package com.datamacy.colduser.service;

import com.datamacy.common.utils.Result;

/**
 * 用户Token
 *
 *
 */
public interface SysUserTokenService{

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	Result createToken(long userId);

	/**
	 * 退出，删除token记录
	 */
	void logout(String token);

}
