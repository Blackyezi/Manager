package com.yezi.shiro.web.service;

import com.yezi.shiro.core.generic.GenericService;
import com.yezi.shiro.web.model.User;

/**
 * 用户 业务 接口
 * 
 * @author yezi
 * @since 2016年7月5日 上午11:53:33
 **/
public interface UserService extends GenericService<User, Long> {

    /**
     * 用户验证
     * 
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     * 
     * @param username
     * @return
     */
    User selectByUsername(String username);
    
    int insertUserInfo(User user);
}
