package com.lizza.provider.service;

import com.lizza.api.UserService;
import com.lizza.entity.Address;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    public List<Address> getAddressByUserId(int id) {
        return new ArrayList<Address>(){{
            add(new Address(1001, 1001, "北京市海淀区中关村大街 8-909-102"));
            add(new Address(1002, 1001, "江苏省杭州市西湖大道 8-909-102"));
            add(new Address(1003, 1001, "陕西省西安市碑林区金花南路 5 号"));
        }};
    }
}
