package com.gt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2018/8/8.
 */

@SpringBootApplication
@EnableEurekaClient
public class MemberServer {

    public static void main(String[] args) {
        SpringApplication.run(MemberServer.class,args);

    }
}