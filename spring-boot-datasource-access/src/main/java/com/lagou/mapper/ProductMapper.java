package com.lagou.mapper;

import com.lagou.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lane
 * @date 2021年04月24日 下午2:44
 */
public interface ProductMapper {
	@Select("select * from product")
	public List<Product> findAllProductM();

	@Select("select * from product")
	public List<Product> findAllProductS();

}
