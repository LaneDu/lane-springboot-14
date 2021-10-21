package com.lagou.mapper;

import com.lagou.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lane
 * @date 2021年04月24日 上午10:22
 */
//@Mapper //放在配置启动类包扫描mapper了
public interface UserMapper {

	@Select("select * from user")
	public List<User> findAllUser();

}
