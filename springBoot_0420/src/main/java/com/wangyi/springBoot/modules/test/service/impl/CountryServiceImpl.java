/**
　 * <p>Title: CountryServiceImpl.java</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 
　 * @version 1.0
*/ 
package com.wangyi.springBoot.modules.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangyi.springBoot.modules.test.dao.CountryDao;
import com.wangyi.springBoot.modules.test.entity.Country;
import com.wangyi.springBoot.modules.test.service.CountryService;

/**
　 * <p>Title: CountryServiceImpl</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 上午9:48:14 
*/
@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDao countryDao;

	/* (non-Javadoc)
	* <p>Title: getCountryId</p>
	* <p>Description: </p>
	* @param countryId
	* @return
	* @see com.wangyi.springBoot.modules.test.service.CountryService#getCountryId(int)
	*/
	@Override
	public Country getCountryId(int countryId) {
		Country country = countryDao.getCountryId(countryId);
		return country;
	}

	/* (non-Javadoc)
	* <p>Title: getCountryByName</p>
	* <p>Description: </p>
	* @param countryName
	* @return
	* @see com.wangyi.springBoot.modules.test.service.CountryService#getCountryByName(java.lang.String)
	*/
	@Override
	public Country getCountryByName(String countryName) {
		return countryDao.getCountryByName(countryName);
	}
}
