package com.wlwq.idfa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wlwq.idfa.entity.User;
import com.wlwq.idfa.mapper.db1.UserMapper;
import com.wlwq.idfa.mapper.db2.UserMapper2;
import com.wlwq.idfa.mapper.db3.UserMapper3;
import com.wlwq.idfa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMapper2 userMapper2;

    @Autowired
    private UserMapper3 userMapper3;

    @Override
    public User selectOneByNickname(String nickName) {
        return userMapper.findOneByNickname(nickName);
    }

    @Override
    public User selectOneByUsername2(String username) {
        return userMapper2.findOneByUsername(username);
    }

    @Override
    public User selectOneByUsername3(String username) {
        return userMapper3.findOneByUsername(username);
    }
}
