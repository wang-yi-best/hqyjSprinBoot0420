/**
　 * <p>Title: CountryService.java</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 
　 * @version 1.0
*/ 
package com.wangyi.springBoot.modules.test.service;

import com.wangyi.springBoot.modules.test.entity.Country;

/**
　 * <p>Title: CountryService</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 上午9:47:43 
*/
public interface CountryService {

	/**
	*<p>Title: getCountryId</p>
	*<p>Description: </p>
	　 * @param countryId
	　 * @return
	*/
	Country getCountryId(int countryId);

}
