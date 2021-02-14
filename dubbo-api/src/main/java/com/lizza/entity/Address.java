package com.lizza.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户收货地址
 */
@Data
@AllArgsConstructor
public class Address {

    private int id;
    private int userId;
    private String address;
}
