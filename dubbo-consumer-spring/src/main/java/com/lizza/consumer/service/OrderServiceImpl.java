package com.lizza.consumer.service;

import com.lizza.api.UserService;
import com.lizza.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单服务
 */
@Service
public class OrderServiceImpl {

    @Autowired
    private UserService userService;

    public List<Address> getAddressByUserId(int userId) {
        return userService.getAddressByUserId(userId);
    }
}
