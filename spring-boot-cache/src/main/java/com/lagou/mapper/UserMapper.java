package com.lagou.mapper;

import com.lagou.pojo.User;
import com.lagou.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;



import java.util.List;

/**
 * 实现JSON格式的Redis二级缓存
 * @author lane
 * @date 2021年10月21日 下午3:49
 */
@CacheNamespace(implementation = RedisCache.class)//开启二级缓存
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

}
