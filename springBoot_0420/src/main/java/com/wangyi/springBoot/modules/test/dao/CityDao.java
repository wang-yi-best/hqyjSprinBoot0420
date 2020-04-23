package com.wangyi.springBoot.modules.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.wangyi.springBoot.modules.test.entity.City;

/**
　 * <p>Title: CityDao</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 上午9:32:25 
*/
@Repository
@Mapper
public interface CityDao {

	/**
	*<p>Title: getCitiesByCountry</p>
	*<p>Description: </p>
	　 * @param countryId
	　 * @return
	*/
//	@Select("SELECT * FROM m_city WHERE m_city.country_id=#{countryId}")
	List<City> getCitiesByCountry(int countryId);
//	List<City> getCitiesByCountry(int countryId);
}
