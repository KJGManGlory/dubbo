package com.lizza.consumer;

import com.lizza.consumer.service.OrderServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-02-14
 */
public class DubboConsumerApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderServiceImpl service = context.getBean(OrderServiceImpl.class);
        service.getAddressByUserId(1).stream().forEach(System.out::println);
        System.in.read();
    }
}
