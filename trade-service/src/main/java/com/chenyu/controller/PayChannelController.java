package com.chenyu.controller;

import com.chenyu.mapper.PayChannelMapper;
import com.chenyu.pojo.PayChannel;
import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname PayChannelController
 * @Description TODO
 * @Date 2024/7/6 23:32
 * @Created by chenyu
 */

@RestController
@RequestMapping("/trade/channel")
public class PayChannelController {

    @Autowired
    private PayChannelMapper payChannelMapper;


     @GetMapping("/{id}")
    @JacksonInject
    public PayChannel show(@PathVariable long id){

        return payChannelMapper.selectById(id);

    }
}
