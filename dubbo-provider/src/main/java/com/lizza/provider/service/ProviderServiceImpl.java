package com.lizza.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ProviderService.class)
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String hello() {
        return "Hello Dubbo!";
    }
}
