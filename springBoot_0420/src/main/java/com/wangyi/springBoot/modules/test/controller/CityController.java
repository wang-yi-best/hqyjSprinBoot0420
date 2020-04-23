/**
　 * <p>Title: CityController.java</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 
　 * @version 1.0
*/ 
package com.wangyi.springBoot.modules.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.wangyi.springBoot.modules.test.entity.City;
import com.wangyi.springBoot.modules.test.service.CityService;

/**
　 * <p>Title: CityController</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 上午9:49:16 
*/
@RestController
@RequestMapping("/api")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	/**
	 * http://127.0.0.1/test/api/cities/522
	*<p>Title: getCitiesByCountry</p>
	*<p>Description: </p>
	　 * @param countryId
	　 * @return
	 */
	@RequestMapping("/cities/{countryId}")
	public List<City> getCitiesByCountry(@PathVariable int countryId) {
		List<City> cities = cityService.getCitiesByCountry(countryId);
		return cities;
	}
	
	@RequestMapping("/cities")
	public PageInfo<City> getCitiesByPage(@RequestParam int currentPage,@RequestParam int pageSize,@RequestParam int countryId) {
		PageInfo<City> cities = cityService.getCitiesByPage(currentPage,pageSize,countryId);
		return cities;
	}
}
