package com.gt.api.server;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Administrator on 2018/8/7.
 */
@RequestMapping("/member")
public interface TestApiServer {
    @RequestMapping("/test")
    public Map<String,Object> test(Integer id,String name);
}
