package com.wlwq.idfa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlwq.idfa.entity.User;

public interface UserService extends IService<User> {

    User selectOneByNickname(String nickName);

    User selectOneByUsername2(String username);

    User selectOneByUsername3(String username);

}
