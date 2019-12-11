package com.wlwq.idfa.mapper.db3;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wlwq.idfa.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper3 extends BaseMapper<User> {

    User findOneByUsername(String username);
}
