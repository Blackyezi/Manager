package com.yezi.shiro.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.yezi.shiro.core.generic.GenericDao;
import com.yezi.shiro.core.generic.GenericServiceImpl;
import com.yezi.shiro.web.dao.RoleMapper;
import com.yezi.shiro.web.model.Role;
import com.yezi.shiro.web.service.RoleService;

/**
 * 角色Service实现类
 *
 * @author yezi
 * @since 2016年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
