package com.chenyu.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname PayChannel
 * @Description TODO
 * @Date 2024/7/6 23:34
 * @Created by chenyu
 */

@TableName("sl_pay_channel")  // 支付通道表
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayChannel {

    private Long id;
    private String channelName;
    private String channelLabel;
    private String domain;
    private String appId;
    private String publicKey;
    private String merchantPrivateKey;
    private String otherConfig;
    private String encryptKey;
    private String remark;
    private String notifyUrl;
    private String enableFlag;
    private long enterpriseId;
    private java.sql.Timestamp created;
    private java.sql.Timestamp updated;

}
