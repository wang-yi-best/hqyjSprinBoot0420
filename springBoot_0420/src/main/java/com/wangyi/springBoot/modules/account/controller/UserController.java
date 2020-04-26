package com.wangyi.springBoot.modules.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.wangyi.springBoot.modules.account.entity.User;
import com.wangyi.springBoot.modules.account.service.UserService;
import com.wangyi.springBoot.modules.common.vo.Result;

/**
　 * <p>Title: UserController</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月26日 下午12:47:48 
　 * @version 1.0
*/
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users/{userId}")
	public List<User> getUsersByUser(@PathVariable int userId) {//get请求方式:单个变量的写法@PathVariable
		List<User> users = userService.getUserByUser(userId);
		return users;
	}
	
	/*@RequestMapping("/users")
	public PageInfo<User> getUsersByPage(@RequestParam int currentPage,//get请求方式:多个变量的写法@RequestParam
			@RequestParam int pageSize,@RequestParam int UserId) {
		PageInfo<User> users = userService.getUsersByPage(currentPage,pageSize,UserId);
		return users;
	}*/
	
	@RequestMapping("/user")
	public User getUserByUserName(@RequestParam(required=false) String userName) {
		return userService.getUserByUserName(userName);
	}
	
	
	@PostMapping(value="/user",consumes="application/json")//当返回为json时下面参数的注解要是@RequestBody
	public Result<User> insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}
	
	@PutMapping(value="user",consumes="application/x-www-form-urlencoded")
	public Result<User> updateUser(@ModelAttribute User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/user/{UserId}")
	public Result<Object> deleteUser(@PathVariable int userId) {
		return userService.deleteUser(userId);
	}
	
}
