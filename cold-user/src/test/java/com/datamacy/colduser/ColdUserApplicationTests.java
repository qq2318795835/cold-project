package com.datamacy.colduser;

import com.datamacy.colduser.dao.SysUserEntityMapper;
import com.datamacy.colduser.dao.SysUserTokenEntityMapper;
import com.datamacy.common.user.entity.SysUserEntity;
import com.datamacy.common.user.entity.SysUserTokenEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

@SpringBootTest
class ColdUserApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    SysUserEntityMapper sysUserEntityMapper;
    @Autowired
    SysUserTokenEntityMapper sysUserTokenEntityMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testDurid(){
        //查看数据源
        System.out.println(dataSource.getClass());
        //获得数据库连接
        try {
            Connection connection = dataSource.getConnection();
            System.out.println("connection: " + connection);
            //关闭连接
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void sysUserEntityMapper(){
        SysUserEntity admin = sysUserEntityMapper.queryByUserName("admin");
        System.out.println(admin.toString());
    }

    @Test
    void queryByToken(){
        SysUserTokenEntity token = sysUserTokenEntityMapper.queryByToken("920d0b8ca698b56ea68f6b396465f075");
        System.out.println(token.toString());
    }

    @Test
    void select(){
        SysUserEntity user = sysUserEntityMapper.selectByPrimaryKey(1L);
        System.out.println(user.toString());
        System.out.println(user.getUser_id());
    }

    @Test
    void delToken(){
        sysUserTokenEntityMapper.deleteByToken("920d0b8ca698b56ea68f6b396465f075");
    }

    @Test
    void selectByPrimaryKey(){

        System.out.println(sysUserTokenEntityMapper.selectByPrimaryKey(1L).toString());
    }

    @Test
    void insertSelective(){
        SysUserTokenEntity token = new SysUserTokenEntity();
        token.setUser_id(2L);
        token.setToken("920d0b8ca698b56ea68f6b396465f075");
        Date now = new Date();
        token.setExpire_time(new Date(now.getTime() + 3600 * 12 * 1000));
        token.setUpdate_time(now);
        sysUserTokenEntityMapper.insertSelective(token);
    }

    @Test
    void updateByPrimaryKeySelective(){
        SysUserTokenEntity tokenEntity = sysUserTokenEntityMapper.selectByPrimaryKey(2L);
        tokenEntity.setToken("920d0b8ca698b56ea68f6b396465f076");
        Date now = new Date();
        tokenEntity.setUpdate_time(now);
        tokenEntity.setExpire_time(new Date(now.getTime() + 3600 * 12 * 1000));
        sysUserTokenEntityMapper.updateByPrimaryKeySelective(tokenEntity);
    }

}
