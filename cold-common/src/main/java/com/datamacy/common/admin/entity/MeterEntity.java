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
public class MeterEntity implements Serializable {
    /**
     * 主键ID
     */
    private String id;

    /**
     * 设备编码
     */
    private String meterCode;

    /**
     * 设备名称
     */
    private String meterName;

    /**
     * 主机ID
     */
    private String hostId;

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
     * 公司Id
     */
    private String companyId;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 仪表状态(1-在用,0-停用,2-异常)
     */
    private Integer meterStatus;

    /**
     * 温度上限
     */
    private Integer maxTem;

    /**
     * 温度下限
     */
    private Integer minTem;

    /**
     * 湿度上限
     */
    private Integer maxHum;

    /**
     * 湿度下限
     */
    private Integer minHum;

    /**
     * 采集间隔
     */
    private Integer meterInterval;

    /**
     * 备注信息
     */
    private String remarks;

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