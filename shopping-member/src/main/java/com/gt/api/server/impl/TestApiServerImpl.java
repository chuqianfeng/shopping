package com.gt.api.server.impl;

import com.gt.api.server.TestApiServer;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/7.
 */
@RestController
public class TestApiServerImpl implements TestApiServer {
    @Override
    public Map<String, Object> test(Integer id, String name) {
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        return map;
    }
}