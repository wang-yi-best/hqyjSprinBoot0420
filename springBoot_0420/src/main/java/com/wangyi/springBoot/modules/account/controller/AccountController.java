package com.wangyi.springBoot.modules.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * Title: AccountController
 * </p>
 * <p>
 * Description:
 * </p>
 * @author yi.wang @date 2020年5月6日 上午8:33:36
 */
@Controller
@RequestMapping("/account")
public class AccountController {

	
	@RequestMapping("/login")
	public String login() {
		return "indexSimple";
	}

	@RequestMapping("/register")
	public String register() {
		return "indexSimple";
	}
}
