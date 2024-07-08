package com.chenyu.controller;


import com.chenyu.mapper.OrderMapper;
import com.chenyu.pojo.Order;
import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trade/orders")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;


     @GetMapping("/{id}")
    @JacksonInject
    public Order show(@PathVariable long id){

        return orderMapper.selectById(id);

    }

}
