package com.chenyu;

import com.chenyu.mapper.OrderMapper;
import com.chenyu.pojo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void test(){
        Order order = orderMapper.selectById(1809126480165834753L);
        System.out.println(order);
    }


}
