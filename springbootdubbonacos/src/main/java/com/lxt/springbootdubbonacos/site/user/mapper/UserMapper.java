package com.lxt.springbootdubbonacos.site.user.mapper;

import com.lxt.nacosdubboapi.dubboprovider.dto.UserDto;
import com.lxt.springbootdubbonacos.site.user.pojo.UserPojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    //获取用户信息
    List<UserDto> getUserInfo(String name);

    //批量新增数据
    Integer batchInsert(@Param("userPojoList") List<UserPojo> userPojoList);

    //单个新增
    Integer insertUser(UserPojo userPojo);

    //修改数据
    Integer updateUser(@Param("userId") Integer userId,@Param("name")String name);


}
