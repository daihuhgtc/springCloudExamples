package com.dh.code.service;

/**
 *
 * @author Anderson.Dai
 * @date 2020/6/8
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-cloud-example-biz-b")
public interface RemoteService {

    /**
     * 调用服务B的hello方法
     *
     * @return 字符串
     */
    @GetMapping("/hello")
    String sayHello();
}