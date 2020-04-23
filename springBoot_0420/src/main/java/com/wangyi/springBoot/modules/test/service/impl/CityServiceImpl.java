/**
　 * <p>Title: CityServiceImpl.java</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 
　 * @version 1.0
*/ 
package com.wangyi.springBoot.modules.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangyi.springBoot.modules.test.dao.CityDao;
import com.wangyi.springBoot.modules.test.entity.City;
import com.wangyi.springBoot.modules.test.service.CityService;

/**
　 * <p>Title: CityServiceImpl</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 上午9:48:35 
*/
@Service
public class CityServiceImpl implements CityService {
	@Autowired
	private CityDao cityDao;

	/* (non-Javadoc)
	* <p>Title: getCitiesByCountry</p>
	* <p>Description: </p>
	* @param countryId
	* @return
	* @see com.wangyi.springBoot.modules.test.service.CityService#getCitiesByCountry(int)
	*/
	@Override
	public List<City> getCitiesByCountry(int countryId) {
		List<City> cities = cityDao.getCitiesByCountry(countryId);
		return cities;
	}

	/* (non-Javadoc)
	* <p>Title: getCitiesByPage</p>
	* <p>Description: </p>
	* @param currentPage
	* @param pageSize
	* @param countryId
	* @return
	* @see com.wangyi.springBoot.modules.test.service.CityService#getCitiesByPage(int, int, int)
	*/
	@Override
	public PageInfo<City> getCitiesByPage(int currentPage, int pageSize, int countryId) {
		PageHelper.startPage(currentPage, pageSize);
		List<City> cities = cityDao.getCitiesByCountry(countryId);
		return new PageInfo(cities);
	}
}
