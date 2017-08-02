package com.yezi.shiro.web.service;

import java.util.List;
import com.yezi.shiro.core.generic.GenericService;
import com.yezi.shiro.web.model.Role;

/**
 * 角色 业务接口
 * 
 * @author yezi
 * @since 2016年6月10日 下午4:15:01
 **/
public interface RoleService extends GenericService<Role, Long> {
    /**
     * 通过用户id 查询用户 拥有的角色
     * 
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);
}
