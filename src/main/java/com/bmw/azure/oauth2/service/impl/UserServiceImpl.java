package com.bmw.azure.oauth2.service.impl;

import com.bmw.azure.oauth2.entity.User;
import com.bmw.azure.oauth2.mapper.UserMapper;
import com.bmw.azure.oauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUsers(User user) {
        return userMapper.findResults(null);
    }

}
