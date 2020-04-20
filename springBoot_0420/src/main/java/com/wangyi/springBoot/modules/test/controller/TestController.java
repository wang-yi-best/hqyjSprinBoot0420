package com.wangyi.springBoot.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test/appDsc")
	@ResponseBody    //该注解表示接口
	public String GetAppDsc(){
		return "hello,this is my first SpringBoot project";
	}
}
