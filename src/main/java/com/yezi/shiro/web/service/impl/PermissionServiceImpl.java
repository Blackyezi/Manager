package com.yezi.shiro.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.yezi.shiro.core.generic.GenericDao;
import com.yezi.shiro.core.generic.GenericDao;
import com.yezi.shiro.core.generic.GenericServiceImpl;
import com.yezi.shiro.web.dao.PermissionMapper;
import com.yezi.shiro.web.model.Permission;
import com.yezi.shiro.web.service.PermissionService;

/**
 * 权限Service实现类
 *
 * @author yezi
 * @since 2016年6月10日 下午12:05:03
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
