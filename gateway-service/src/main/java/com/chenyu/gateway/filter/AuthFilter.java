package com.chenyu.gateway.filter;

import com.itheima.auth.sdk.dto.AuthUserInfoDTO;

public interface AuthFilter {

    /**
     * 校验token
     *
     * @param token 请求中的token
     * @return token中携带的数据
     */
    AuthUserInfoDTO check(String token);

    /**
     * 鉴权
     *
     * @param token        请求中的token
     * @param authUserInfo token中携带的数据
     * @param path         当前请求的路径
     * @return 是否通过
     */
    Boolean auth(String token, AuthUserInfoDTO authUserInfo, String path);


    /**
     * 鉴权
     *
     * @param params        请求中的token
     * @param path         当前请求的路径
     * @return 是否通过
     */
    Boolean authAdmin(String params, String path);


}
