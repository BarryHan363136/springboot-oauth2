package com.bmw.azure.oauth2.base;

import com.bmw.azure.oauth2.starter.ApplicationStarter;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
@WebAppConfiguration
public class BaseTest {

    @Ignore
    @Test
    public void baseTest(){
    }

}