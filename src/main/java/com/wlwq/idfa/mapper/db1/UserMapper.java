package com.wlwq.idfa.mapper.db1;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wlwq.idfa.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User findOneByNickname(@Param("nickName")String nickName);
}
