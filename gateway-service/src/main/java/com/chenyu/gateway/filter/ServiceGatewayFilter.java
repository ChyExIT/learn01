package com.chenyu.gateway.filter;

import cn.hutool.core.util.StrUtil;
import com.chenyu.gateway.config.Myconfig;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class ServiceGatewayFilter implements GatewayFilter, Ordered {


    private Myconfig myConfig;
    private AuthFilter authFilter;


    public ServiceGatewayFilter(Myconfig myconfig, AuthFilter authFilter) {
        this.myConfig = myconfig;
        this.authFilter = authFilter;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        String path = exchange.getRequest().getPath().toString();  //拿到请求路径
        if (StrUtil.startWithAny(path, myConfig.getNoAuthPaths())) {   //查看请求路径中有无以myConfig.getNoAuthPaths开头的路径，有则放行
            //无需校验，直接放行
            return chain.filter(exchange);
        }

        //1.获取请求参数
        MultiValueMap<String, String> params = exchange.getRequest().getQueryParams();
        // 2.获取authorization参数
        String auth = params.getFirst("authorization");
        // 3.开始校验
        Boolean result = this.authFilter.authAdmin(auth, path);
        if (!result) {
            // 4.拦截
            // 4.1.禁止访问，设置状态码
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            // 4.2.结束处理
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return Integer.MIN_VALUE;
    }
}
