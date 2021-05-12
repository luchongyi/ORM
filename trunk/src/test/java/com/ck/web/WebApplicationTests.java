package com.ck.web;

import com.ck.mapper.ClicksMapper;
import com.ck.model.Clicks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {

    @Resource
    ClicksMapper clicksMapper;

    @Test
    public void query() {
        List<Clicks> query = clicksMapper.query();
        for (Clicks clicks : query
             ) {
            System.err.println(clicks);
        }
    }


}
