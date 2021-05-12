package com.ck;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;


/**
 * 将同一个组的所有人的店铺权限全部刷成一样
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {WebApplication.class})
public class ReflushDispatchRuleLevelTask {




    //@Test
    public synchronized void fetch() throws Exception {


    }



}
