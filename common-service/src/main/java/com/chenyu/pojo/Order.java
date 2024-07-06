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
    private Long productOrderNo;
    private Long tradingOrderNo;
    private String tradingChannel;
    private String tradingType;
    private Long tradingState;
    private String payeeName;
    private Long payeeId;
    private String payerName;
    private Long payerId;
    private double tradingAmount;
    private double refund;
    private String isRefund;
    private String resultCode;
    private String resultMsg;
    private String resultJson;
    private String placeOrderCode;
    private String placeOrderMsg;
    private String placeOrderJson;
    private Long enterpriseId;
    private String memo;
    private String qrCode;
    private String openId;
    private String enableFlag;
    private java.sql.Timestamp updated;
    private java.sql.Timestamp created;


}
