package com.bmw.azure.oauth2.service;

import com.bmw.azure.oauth2.entity.User;
import java.util.List;

public interface UserService {

    public List<User> findUsers(User user);

}
