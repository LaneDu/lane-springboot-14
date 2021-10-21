package com.lagou.service;

import com.lagou.mapper.UserMapper;
import com.lagou.pojo.User;

import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lane
 * @date 2021年10月21日 下午3:51
 */
@Service
public class UserService {


    @Autowired
  private   UserMapper userMapper;

   public List<User> findAll(){
       return userMapper.findAll();
    }


}
