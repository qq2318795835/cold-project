package com.datamacy.common.user.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2023/01/01
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUserEntity implements Serializable {
    /**
     * id
     */
    private Long user_id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态  0：禁用   1：正常
     */
    private Integer status;

    /**
     * 创建者ID
     */
    private Long create_user_id;

    /**
     * 创建时间
     */
    private Date create_time;

    private static final long serialVersionUID = 1L;
}