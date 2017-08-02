package com.yezi.shiro.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.yezi.shiro.core.generic.GenericDao;
import com.yezi.shiro.core.generic.GenericServiceImpl;
import com.yezi.shiro.web.dao.UserMapper;
import com.yezi.shiro.web.model.User;
import com.yezi.shiro.web.model.UserExample;
import com.yezi.shiro.web.service.UserService;

/**
 * 用户Service实现类
 *
 * @author yezi
 * @since 2016年7月5日 上午11:54:24
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }

    @Override
    public int update(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }

	@Override
	public int insertUserInfo(User user) {
		return userMapper.insert(user);
	}

}
