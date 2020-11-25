package com.javakc.pms.dispord.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "pms_disp_ord")
public class DispOrd {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "generator_uuid")
    @GenericGenerator(name = "generator_uuid", strategy = "uuid")
    @ApiModelProperty(value = "主键,采用hibernate的uuid生成32位字符串")
    private String id;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "spec_type")
    private String specType;

    @Column(name = "priority")
    private String priority;

    @Column(name = "order_desc")
    private String orderDesc;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modified")
    private Date gmtModified;

}