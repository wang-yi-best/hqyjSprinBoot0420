package com.wangyi.springBoot.modules.test.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	/**
	 * 
	*<p>Title: uploadFile</p>
	*<p>Description:单个文件上传 </p>
	　 * @param file
	　 * @param redirectAttributes
	　 * @return
	127.0.0.1/test/file
	 */
	@PostMapping(value="file",consumes = "multipart/form-data")
	public String uploadFile(@RequestParam MultipartFile file,RedirectAttributes redirectAttributes) {
		if (file.isEmpty()) {
			redirectAttributes.addFlashAttribute("message","please select file");
			return "redirect:test/index";
		}
		try {
			String fileName = file.getOriginalFilename();
			String filePath = "D:\\file\\upload\\" + fileName;
			File file2 = new File(filePath);
			file.transferTo(file2);
			
			redirectAttributes.addAttribute("message", "upload file success");
		} catch (IllegalStateException | IOException e) {
			redirectAttributes.addAttribute("message", "upload file fail");
			
			e.printStackTrace();
			return "redirect:test/index";
		}
		return "redirect:test/index";
	}
	
	/**
	 * 
	*<p>Title: uploadFiles</p>
	*<p>Description:多个文件上传(需要弄清楚的是多文件上传的原理，如果存放上传文件为空则遍历完整个数组，只有有个文件都可以传) </p>
	　 * @param file
	　 * @param redirectAttributes
	　 * @return
	 */
	@PostMapping(value="files",consumes = "multipart/form-data")//注意上传文件的consumes的值类型（与表单的值对应），和下列参数类型
	public String uploadFiles(@RequestParam MultipartFile[] files,RedirectAttributes redirectAttributes) {
		boolean flag = true;
		try {
		for (MultipartFile file : files) {
				if (file.isEmpty()) {
					continue;
				}
				String fileName = file.getOriginalFilename();
				String filePath = "D:\\file\\upload\\" + fileName;
				File file2 = new File(filePath);
				file.transferTo(file2);
			}
		} catch (IllegalStateException | IOException e) {
			redirectAttributes.addFlashAttribute("message","please select file");
			e.printStackTrace();
		}
		if (flag) {
			redirectAttributes.addAttribute("message", "upload file fail");
		} else {
			redirectAttributes.addAttribute("message", "upload file success");
		}
		return "redirect:test/index";
	}
	
	//127.0.0.1/test/index
	@RequestMapping("/index")
	public String testIndexPage(ModelMap modelMap) {
		int countryId = 522;
		Country country = countryService.getCountryId(countryId);
		List<City> cities = cityService.getCitiesByCountry(countryId);
		cities = cities.stream().limit(10).collect(Collectors.toList());
		City city = cities.get(0);
		
		modelMap.addAttribute("thymeleafTitle", "thymeleaf Title");
		modelMap.addAttribute("checked", true);
		modelMap.addAttribute("currentNumber", 99);
		modelMap.addAttribute("changeType", "checkbox");
		modelMap.addAttribute("baiduUrl", "http://www.baidu.com");
		modelMap.addAttribute("shopLogo", "http://cdn.duitang.com/uploads"
				+ "/item/201308/13/20130813115619_EJCWm.thumb.700_0.jpeg");
		modelMap.addAttribute("country", country);
		modelMap.addAttribute("city", city);
		modelMap.addAttribute("updateCityUri", "/api/city");
		modelMap.addAttribute("cities", cities);
//		modelMap.addAttribute("template", "test/index");
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
