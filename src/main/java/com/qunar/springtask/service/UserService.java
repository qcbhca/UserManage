package com.qunar.springtask.service;

import com.qunar.springtask.model.User;

import java.util.List;

/**
 * @author hongqin.luo
 * @date 2018/7/31 22:17
 */
public interface UserService {

    int addUser(User user);

    int update(User user);

    List<User> queryUserList();

    User queryUserByUsername(String username);

    int delete(Integer userId);
}
