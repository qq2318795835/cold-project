package com.datamacy.colduser.service.impl;
import com.datamacy.colduser.dao.SysUserTokenEntityMapper;
import com.datamacy.colduser.service.SysUserTokenService;
import com.datamacy.common.user.entity.SysUserTokenEntity;
import com.datamacy.common.utils.Result;
import com.datamacy.common.utils.TokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;


@Service("sysUserTokenService")
public class SysUserTokenServiceImpl implements SysUserTokenService {
	@Autowired
	SysUserTokenEntityMapper sysUserTokenEntityMapper;

	//12小时后过期
	private final static int EXPIRE = 3600 * 12;

	@Override
	public Result createToken(long userId) {
		//生成一个token
		String token = TokenGenerator.generateValue();

		//当前时间
		Date now = new Date();
		//过期时间
		Date expireTime = new Date(now.getTime() + EXPIRE * 1000);

		//判断是否生成过token
		SysUserTokenEntity tokenEntity = sysUserTokenEntityMapper.selectByPrimaryKey(userId);
		if(tokenEntity == null){
			tokenEntity = new SysUserTokenEntity();
			tokenEntity.setUser_id(userId);
			tokenEntity.setToken(token);
			tokenEntity.setUpdate_time(now);
			tokenEntity.setExpire_time(expireTime);

			//保存token
			sysUserTokenEntityMapper.insertSelective(tokenEntity);
		}else{
			tokenEntity.setToken(token);
			tokenEntity.setUpdate_time(now);
			tokenEntity.setExpire_time(expireTime);

			//更新token
			sysUserTokenEntityMapper.updateByPrimaryKeySelective(tokenEntity);
		}

		return Result.ok().put("token", token).put("expire", EXPIRE);
	}

	@Override
	public void logout(String token) {
		sysUserTokenEntityMapper.deleteByToken(token);
	}
}
