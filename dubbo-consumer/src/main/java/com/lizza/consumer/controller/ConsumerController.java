package com.lizza.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lizza.provider.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-12-09
 */
@RestController
@RequestMapping
public class ConsumerController {

    @Reference
    private ProviderService providerService;

    @GetMapping("/hello")
    public String hello() {
        return providerService.hello();
    }
}
