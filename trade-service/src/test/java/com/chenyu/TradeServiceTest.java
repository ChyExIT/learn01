package com.chenyu;

import com.chenyu.mapper.OrderMapper;
import com.chenyu.mapper.PayChannelMapper;
import com.chenyu.pojo.Order;
import com.chenyu.pojo.PayChannel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TradeServiceTest {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private PayChannelMapper payChannelMapper;

    @Test
    public void test(){
        Order order = orderMapper.selectById(1809253576489902082L);
        System.out.println(order);
    }

    @Test
    public void test01(){
        PayChannel payChannel = payChannelMapper.selectById(1456996281682616322L);
        System.out.println(payChannel);

    }



}
