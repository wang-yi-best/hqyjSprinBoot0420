package com.wangyi.springBoot.modules.test.controller;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangyi.springBoot.modules.test.vo.MyConfigBean;

@Controller
public class TestController {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	//全局配置文件
	@Value("${server.port}")
	private int port;
	@Value("${com.hqyj.name}")
	private String name;
	@Value("${com.hqyj.age}")
	private String age;
	@Value("${com.hqyj.desc}")
	private String desc;
	@Value("${com.hqyj.random}")
	private String random;
	
	@Autowired
	private MyConfigBean myConfigBean;
	
	/**
	 * http://localhost/test/log
	 * @return
	 */
	//日志的五种级别trace<debug<info<warn<error
	@RequestMapping("/test/log")
	@ResponseBody
	public String logTest() {
		LOGGER.trace("this is trace log");
		LOGGER.debug("this is debug log");
		LOGGER.info("this is info log");
		LOGGER.warn("this is warn log");
		LOGGER.error("this is error log");
		return "this is my logger test";
	}
	
	/**
	 * http://localhost/test/config
	 * @return
	 */
	@RequestMapping("/test/config")
	@ResponseBody
	public String confgTest() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(port).append("------------")
		.append(name).append("------------")
		.append(age).append("------------")
		.append(desc).append("------------")
		.append(random).append("------------").append("</br>");
		
		stringBuffer.append(myConfigBean.getName()).append("------------")
		.append(myConfigBean.getAge()).append("------------")
		.append(myConfigBean.getDesc()).append("------------")
		.append(myConfigBean.getRandom()).append("------------");
		return stringBuffer.toString();
	}
	
	/**
	 * http://localhost/test/appDsc?key=
	 * @return
	 */
	@RequestMapping("/test/appDsc")
	@ResponseBody    //该注解表示接口
	public String GetAppDsc(HttpServletRequest request,@RequestParam String key){
		String value = request.getParameter("key");
		return "hello,this is my first SpringBoot project"+key+value;
	}
}
