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
public class MonitorEntity implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 人员姓名
     */
    private String userName;

    /**
     * 人员电话
     */
    private String userPhone;

    /**
     * 预警类型，0：温湿度，1：温度，2：湿度
     */
    private String monitorState;

    /**
     * 预警的主机Id
     */
    private String hostId;

    /**
     * 预警的主机编码
     */
    private String hostCode;

    /**
     * 预警的主机名称
     */
    private Integer hostName;

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