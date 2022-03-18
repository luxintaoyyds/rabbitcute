package com.lxt.springbootdubbonacos.site.user.pojo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lxt
 * @since 2022-01-24
 */
@Data
public class UserPojo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户主键")
    private Integer userId;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别")
    private String gender;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("国籍")
    private String nation;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("学生id")
    private Integer studentId;


}
