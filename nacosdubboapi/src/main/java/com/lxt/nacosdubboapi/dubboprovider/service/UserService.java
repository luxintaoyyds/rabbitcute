package com.lxt.nacosdubboapi.dubboprovider.service;

import com.lxt.nacosdubboapi.dubboprovider.dto.UserDto;

import java.util.List;

public interface UserService {


    //获取用户信息
    List<UserDto> GetUserInfo(String name);

    default UserDto getUser(Integer id){
        System.out.println("232423");
        return null;
    }

}
