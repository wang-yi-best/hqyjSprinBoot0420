package com.wangyi.springBoot.modules.test.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangyi.springBoot.modules.test.entity.City;
import com.wangyi.springBoot.modules.test.entity.Country;
import com.wangyi.springBoot.modules.test.service.CityService;
import com.wangyi.springBoot.modules.test.service.CountryService;

/**
　 * <p>Title: TestPageController</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月26日 下午2:18:17 
　 * @version 1.0
*/
@Controller
@RequestMapping("/test")
public class TestPageController {
	@Autowired
	private CountryService countryService;
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/index")
	public String textIndexPage(ModelMap modelMap) {
		Country country= countryService.getCountryId(522);
		List<City> cities =  cityService.getCitiesByCountry(522);
		cities = cities.stream().limit(10).collect(Collectors.toList());
		City city =cities.get(0);
		modelMap.addAttribute("thymeleafTitle", "this is thymeleaf Title");
		modelMap.addAttribute("checked", true);
		modelMap.addAttribute("number", 1);
		modelMap.addAttribute("changeType", "checkbox");
		modelMap.addAttribute("baiduUrl", "http://www.baidu.com");
		modelMap.addAttribute("photoUrl", 
				"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1588069408128&di=6b60c8d63f37b972642e9d41b7198a9b&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fd009b3de9c82d1587e249850820a19d8bd3e42a9.jpg");
		modelMap.addAttribute("country", country);
		modelMap.addAttribute("city", city);
		modelMap.addAttribute("updateUrl", "api/city");
		modelMap.addAttribute("cities", cities);
		modelMap.addAttribute("template", "test/index");
		return "index";
	}
	
	@RequestMapping("/index1")
	public String textIndexPage1() {
		return "index1";
	}
	
	@RequestMapping("/index2")
	public String textIndexPage2() {
		return "index2";
	}
	
	
	
	
}
