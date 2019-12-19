package com.wlwq.idfa.service;

import com.wlwq.idfa.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzh
 * @since 2019-12-19
 */
public interface UserService extends IService<User> {

    int deleteById(Long id);

    List<User> findAllData();

    List<User> findAllDataDb2();

    List<User> findAllDataDb3();

}
