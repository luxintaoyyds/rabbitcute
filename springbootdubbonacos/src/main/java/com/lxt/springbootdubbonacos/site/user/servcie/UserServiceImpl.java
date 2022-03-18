package com.lxt.springbootdubbonacos.site.user.servcie;


import com.lxt.nacosdubboapi.dubboprovider.dto.UserDto;
import com.lxt.nacosdubboapi.dubboprovider.service.UserService;
import com.lxt.springbootdubbonacos.site.user.mapper.UserMapper;
import com.lxt.springbootdubbonacos.site.user.pojo.UserPojo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService , UserServicelxt {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserDto> GetUserInfo(String name) {
        return userMapper.getUserInfo(name);
    }

    @Override
    public UserDto getUser(Integer id) {
        return null;
    }

    @Override
    public Integer insertUser(UserPojo userPojo) {
        return userMapper.insertUser(userPojo);
    }

    @Override
    public Integer batchInsert(List<UserPojo> userPojoList) {
        return userMapper.batchInsert(userPojoList);
    }
}
