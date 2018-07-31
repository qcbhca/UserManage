package com.qunar.springtask.dao.impl;

import com.qunar.springtask.dao.UserDao;
import com.qunar.springtask.mapper.UserMapper;
import com.qunar.springtask.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hongqin.luo
 * @date 2018/7/31 22:14
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User queryUserByUsername(String username) {
        return userMapper.queryUserByUsername(username);
    }

    @Override
    public int delete(Integer userId) {
        return userMapper.delete(userId);
    }
}
