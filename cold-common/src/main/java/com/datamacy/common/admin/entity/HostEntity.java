package com.datamacy.common.admin.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2023/01/06
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HostEntity implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 主机编码
     */
    private String hostCode;

    /**
     * 主机名称
     */
    private String hostName;

    /**
     * 仓库Id
     */
    private String houseId;

    /**
     * 仓库编码
     */
    private String houseCode;

    /**
     * 仓库名称
     */
    private String houseName;

    /**
     * 主机状态：1-正常，0-停用
     */
    private Integer hostStatus;

    /**
     * 设备型号
     */
    private String hostModel;

    /**
     * sim卡号
     */
    private String simCode;

    /**
     * 创建时间
     */
    private Timestamp createdTime;

    /**
     * 修改时间
     */
    private Timestamp updateTime;


    private static final long serialVersionUID = 1L;
}