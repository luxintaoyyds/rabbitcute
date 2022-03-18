package com.lxt.springbootdubbonacos.site.user.servcie;

import com.lxt.nacosdubboapi.dubboprovider.dto.UserDto;
import com.lxt.springbootdubbonacos.site.user.pojo.UserPojo;

import java.util.List;

public interface UserServicelxt {

    //批量新增数据
    Integer batchInsert(List<UserPojo> userPojoList);

    default UserDto getUser(Integer id){
        System.out.println("1111");
        return null;
    }

    //单个新增
    Integer insertUser(UserPojo userPojo);


}
