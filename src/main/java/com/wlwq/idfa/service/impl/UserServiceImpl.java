package com.wlwq.idfa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wlwq.idfa.entity.User;
import com.wlwq.idfa.mapper.db1.UserMapper;
import com.wlwq.idfa.mapper.db2.UserMapperDb2;
import com.wlwq.idfa.mapper.db3.UserMapperDb3;
import com.wlwq.idfa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzh
 * @since 2019-12-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMapperDb2 userMapperDb22;

    @Autowired
    private UserMapperDb3 userMapperDb33;

    @Override
    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public List<User> findAllData() {
        return userMapper.findAllData();
    }

    @Override
    public List<User> findAllDataDb2() {
        return userMapperDb22.findAllData();
    }

    @Override
    public List<User> findAllDataDb3() {
        return userMapperDb33.findAllData();
    }
}
