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
public class SysUserTokenEntity implements Serializable {
    /**
     * id
     */
    private Long user_id;

    /**
     * token
     */
    private String token;

    /**
     * 过期时间
     */
    private Date expire_time;

    /**
     * 更新时间
     */
    private Date update_time;

    private static final long serialVersionUID = 1L;
}