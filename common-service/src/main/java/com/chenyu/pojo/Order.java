package com.chenyu.pojo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Description:
 * @Version: V1.0
 */
@TableName("sl_trading") // 指定表名
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    private Long id;
    private String productOrderNo;
    private String tradingOrderNo;
    private String tradingChannel;
    private String tradingType;
    private Integer tradingState;
    private double tradingAmount;


}
