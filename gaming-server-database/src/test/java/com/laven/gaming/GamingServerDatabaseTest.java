package com.laven.gaming;

import com.laven.gaming.server.database.GamingServerDatabase;
import com.laven.gaming.server.database.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamingServerDatabase.class)
public class GamingServerDatabaseTest {

    @Autowired
    TestMapper testMapper;

    @Test
    public void contextLoads() {
        List<com.laven.gaming.server.database.domain.Test> l = testMapper.selectAll();
        System.out.println(l);
    }
}
