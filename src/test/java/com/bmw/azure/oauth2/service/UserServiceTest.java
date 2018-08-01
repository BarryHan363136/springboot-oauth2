package com.bmw.azure.oauth2.service;

import com.bmw.azure.oauth2.base.BaseTest;
import com.bmw.azure.oauth2.common.utils.JSONMapper;
import com.bmw.azure.oauth2.entity.User;
import com.bmw.azure.oauth2.id.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Slf4j
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void testIdGenerate(){
        IdWorker idWorker = new IdWorker(1L);
        String id = idWorker.nextId().toString();
        log.info("=================>"+id);
    }

    @Test
    public void testFindUsers(){
        List<User> list = userService.findUsers(null);
        log.info("===================>"+JSONMapper.writeObjectAsString(list));
    }


}
