package com.juro.study.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class HttpServiceTest {

    @Test
    public void testPostRequest()throws Exception{

        HttpService service = new HttpService();
        service.setUrl("http://localhost:8080");
        Map<String, Object> param = new HashMap<>();
        param.put("ip", "127.0.0.1");

        service.request(param);
    }

}
