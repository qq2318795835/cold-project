package com.datamacy.common.admin.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class WarehouseEntity implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 仓库编码
     */
    private String houseCode;

    /**
     * 仓库名称
     */
    private String houseName;

    /**
     * 仓库地址
     */
    private String houseAddress;

    /**
     * 库房类型：1-冷库， 2-恒温库
     */
    private Integer houseType;

    /**
     * 所属公司Id
     */
    private String companyId;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 负责人
     */
    private String principalName;

    /**
     * 负责人电话
     */
    private String principalTel;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 维度
     */
    private BigDecimal latitude;

    /**
     * 库房面积
     */
    private Double areaSize;

    /**
     * 状态：1-正常,0-空库
     */
    private Integer houseStatus;

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