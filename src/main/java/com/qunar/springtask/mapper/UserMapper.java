package com.qunar.springtask.mapper;

import com.qunar.springtask.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hongqin.luo
 * @date 2018/7/31 22:02
 */
@Component(value = "userMapper")
public interface UserMapper {

    @Insert("INSERT INTO user where")
    int addUser(User user);

    @Update("UPDATE user")
    int update(User user);

    @Select("SELECT username, phone, note FROM user")
    List<User> queryUserList();

    @Select("SELECT username, phone, note FROM user WHERE")
    User queryUserByUsername(String username);

    @Delete("DELETE FROM user WHERE userId = ")
    int delete(Integer userId);
}
