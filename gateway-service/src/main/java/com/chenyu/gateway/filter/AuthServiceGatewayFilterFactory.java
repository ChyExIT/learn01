package com.chenyu.gateway.filter;

import com.chenyu.gateway.config.Myconfig;
import com.itheima.auth.sdk.dto.AuthUserInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class AuthServiceGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> implements AuthFilter {

//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//
//        String path = exchange.getRequest().getPath().toString();
//        System.out.println(path);
//        // 1.获取请求参数
//        MultiValueMap<String, String> params = exchange.getRequest().getQueryParams();
//        // 2.获取authorization参数
//        String auth = params.getFirst("authorization");
//        // 3.校验
//        if ("admin".equals(auth)) {
//            // 放行
//            return chain.filter(exchange);
//        }
//        // 4.拦截
//        // 4.1.禁止访问，设置状态码
//        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//        // 4.2.结束处理
//        return exchange.getResponse().setComplete();
//    }

    @Autowired
    private Myconfig myconfig;

    @Override
    public AuthUserInfoDTO check(String token) {
        return null;
    }

    @Override
    public Boolean auth(String token, AuthUserInfoDTO authUserInfo, String path) {
        return null;
    }

    @Override
    public Boolean authAdmin(String params, String path) {
        // 校验
        return "admin".equals(params);
    }

    @Override
    public GatewayFilter apply(Object config) {
        return new ServiceGatewayFilter(this.myconfig, this);
    }
}
