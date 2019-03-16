package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tjnu.jiaju.dao.UserMapper;
import com.tjnu.jiaju.entity.User;
import com.tjnu.jiaju.service.UserService;
import com.tjnu.jiaju.util.OrderUtil;
import com.tjnu.jiaju.util.PageUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    private UserMapper userMapper;
    @Resource(name = "userMapper")
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean add(User user) {
        return userMapper.insertOne(user)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean update(User user) {
        return userMapper.updateOne(user)>0;
    }

    
    public List<User> getList(User user, OrderUtil orderUtil, PageUtil pageUtil) {
        return userMapper.select(user,orderUtil,pageUtil);
    }

    
    public User get(Integer user_id) {
        return userMapper.selectOne(user_id);
    }

    
    public User login(String user_name, String user_password) {
        return userMapper.selectByLogin(user_name,user_password);
    }

    
    public Integer getTotal(User user) {
        return userMapper.selectTotal(user);
    }
}
