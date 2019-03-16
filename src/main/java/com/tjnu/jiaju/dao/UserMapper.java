package com.tjnu.jiaju.dao;

import org.apache.ibatis.annotations.Param;

import com.tjnu.jiaju.entity.User;
import com.tjnu.jiaju.util.OrderUtil;
import com.tjnu.jiaju.util.PageUtil;

import java.util.List;

public interface UserMapper {
    Integer insertOne(@Param("user") User user);
    Integer updateOne(@Param("user") User user);

    List<User> select(@Param("user") User user, @Param("orderUtil") OrderUtil orderUtil, @Param("pageUtil") PageUtil pageUtil);
    User selectOne(@Param("user_id") Integer user_id);
    User selectByLogin(@Param("user_name") String user_name, @Param("user_password") String user_password);
    Integer selectTotal(@Param("user") User user);
}
