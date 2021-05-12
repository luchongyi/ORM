package com.ck.controller;


import com.ck.mapper.ClicksMapper;
import com.ck.model.Clicks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("ck")
public class AmazonAuthController {


    @Resource
    ClicksMapper clicksMapper;


    @GetMapping("/query")
    public List<Clicks> query() {
        List<Clicks> authList = clicksMapper.query();
        return authList;
    }

}