package com.chenyu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenyu.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * 使用mp定义Mapper，需要让Mapper接口继承 BaseMapper接口。
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {


}
