package com.yezi.shiro.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.yezi.shiro.core.generic.GenericDao;
import com.yezi.shiro.web.model.Role;
import com.yezi.shiro.web.model.RoleExample;

/**
 * 角色Dao 接口
 * 
 * @author yezi
 * @since 2016年7月5日 上午11:55:59
 **/
public interface RoleMapper extends GenericDao<Role, Long> {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    /**
     * 通过用户id 查询用户 拥有的角色
     * 
     * @param id
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);
}