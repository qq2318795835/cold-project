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
public class CompanyEntity implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 公司简称
     */
    private String abbreviation;

    /**
     * 企业编号
     */
    private String companyNumber;

    /**
     * 企业地址
     */
    private String companyAddress;

    /**
     * 公司电话
     */
    private String companyPhone;

    /**
     * 质量管理员
     */
    private String managementName;

    /**
     * 联系电话
     */
    private String managementPhone;

    /**
     * 负责人姓名
     */
    private String leader;

    /**
     * 负责人电话
     */
    private String leaderPhone;

    /**
     * 备注
     */
    private String message;

    /**
     * 网站
     */
    private String webAddress;

    /**
     * 企业类型
     */
    private String companyType;

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