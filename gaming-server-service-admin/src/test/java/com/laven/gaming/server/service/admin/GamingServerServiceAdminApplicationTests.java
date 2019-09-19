package com.laven.gaming.server.service.admin;

import com.laven.gaming.server.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GamingServerServiceAdminApplicationTests {

    @Autowired
    TestMapper testMapper;

    @Test
    public void contextLoads() {
        List<com.laven.gaming.server.domain.Test> l = testMapper.selectAll();
        System.out.println(l);
    }

}
