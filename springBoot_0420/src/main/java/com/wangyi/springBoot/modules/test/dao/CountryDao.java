package com.wangyi.springBoot.modules.test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.wangyi.springBoot.modules.test.entity.Country;

/**
　 * <p>Title: CountryDao</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 上午9:32:42 
*/
@Repository
@Mapper
public interface CountryDao {

	/**
	*<p>Title: getCountryId</p>
	*<p>Description: </p>
	　 * @param countryId
	　 * @return
	*/
	@Select("SELECT * FROM m_country WHERE country_id=#{countryId}")
	Country getCountryId(int countryId);

}
