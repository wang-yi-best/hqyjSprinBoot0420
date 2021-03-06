/**
　 * <p>Title: CityService.java</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 
　 * @version 1.0
*/ 
package com.wangyi.springBoot.modules.test.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wangyi.springBoot.modules.common.vo.Result;
import com.wangyi.springBoot.modules.test.entity.City;

/**
　 * <p>Title: CityService</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 上午9:47:16 
*/
public interface CityService {

	/**
	*<p>Title: getCitiesByCountry</p>
	*<p>Description: </p>
	　 * @param countryId
	　 * @return
	*/
	List<City> getCitiesByCountry(int countryId);

	/**
	*<p>Title: getCitiesByPage</p>
	*<p>Description: </p>
	　 * @param currentPage
	　 * @param pageSize
	　 * @param countryId
	　 * @return
	*/
	PageInfo<City> getCitiesByPage(int currentPage, int pageSize, int countryId);

	/**
	*<p>Title: insertCity</p>
	*<p>Description: </p>
	　 * @param city
	　 * @return
	*/
	Result<City> insertCity(City city);

	/**
	*<p>Title: getCityByCityName</p>
	*<p>Description: </p>
	　 * @param cityName
	　 * @param localCityName
	　 * @return
	*/
	City getCityByCityName(String cityName, String localCityName);

	/**
	*<p>Title: updateCity</p>
	*<p>Description: </p>
	　 * @param city
	　 * @return
	*/
	Result<City> updateCity(City city);

	/**
	*<p>Title: deleteCity</p>
	*<p>Description: </p>
	　 * @param cityId
	　 * @return
	*/
	Result<Object> deleteCity(int cityId);

}
