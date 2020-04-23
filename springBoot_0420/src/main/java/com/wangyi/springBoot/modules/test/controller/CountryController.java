/**
　 * <p>Title: CountryController.java</p>
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
import org.springframework.web.bind.annotation.RestController;

import com.wangyi.springBoot.modules.test.entity.City;
import com.wangyi.springBoot.modules.test.entity.Country;
import com.wangyi.springBoot.modules.test.service.CountryService;

/**
　 * <p>Title: CountryController</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 上午9:49:32 
*/
@RestController
@RequestMapping("/api")
public class CountryController {
	@Autowired
	private CountryService countryService;
	
	@RequestMapping("/country/{countryId}")
	public Country getCitiesByCountry(@PathVariable int countryId) {
		Country country = countryService.getCountryId(countryId);
		return country;
	}
}
