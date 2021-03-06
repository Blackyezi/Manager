package com.yezi.shiro.web.service;

import java.util.List;
import com.yezi.shiro.core.generic.GenericService;
import com.yezi.shiro.web.model.Permission;

/**
 * 权限 业务接口
 * 
 * @author yezi
 * @since 2016年6月10日 下午12:02:39
 **/
public interface PermissionService extends GenericService<Permission, Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);

}
