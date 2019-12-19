package com.wlwq.idfa.mapper.db1;

import com.wlwq.idfa.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  mapper 接口
 * </p>
 *
 * @author lzh
 * @since 2019-12-19
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> findAllData();
}
