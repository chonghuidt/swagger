package com.lp.swagger.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: lp
 * @Date: 2020/10/18 16:21
 */
@ApiModel("测试实体类")
@Data
public class TestDto {

    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("电话")
    private String phone;
}
