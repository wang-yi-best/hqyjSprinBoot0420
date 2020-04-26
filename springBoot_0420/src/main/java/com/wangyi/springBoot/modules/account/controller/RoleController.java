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

import com.wangyi.springBoot.modules.account.entity.Role;
import com.wangyi.springBoot.modules.account.service.RoleService;
import com.wangyi.springBoot.modules.account.service.RoleService;
import com.wangyi.springBoot.modules.common.vo.Result;

/**
　 * <p>Title: RoleController</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月26日 下午12:48:03 
　 * @version 1.0
*/
@RestController
@RequestMapping("/api")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/role/{roleId}")
	public List<Role> getRoleByRole(@PathVariable int roleId) {//get请求方式:单个变量的写法@PathVariable
		List<Role> roles = roleService.getRoleByRole(roleId);
		return roles;
	}
	
	/*@RequestMapping("/Role")
	public PageInfo<Role> getRoleByPage(@RequestParam int currentPage,//get请求方式:多个变量的写法@RequestParam
			@RequestParam int pageSize,@RequestParam int RoleId) {
		PageInfo<Role> Role = RoleService.getRoleByPage(currentPage,pageSize,RoleId);
		return Role;
	}*/
	
	@RequestMapping("/role")
	public Role getRoleByRoleName(@RequestParam(required=false) String roleName) {
		return roleService.getRoleByRoleName(roleName);
	}
	
	
	@PostMapping(value="/role",consumes="application/json")//当返回为json时下面参数的注解要是@RequestBody
	public Result<Role> insertRole(@RequestBody Role role) {
		return roleService.insertRole(role);
	}
	
	@PutMapping(value="role",consumes="application/x-www-form-urlencoded")
	public Result<Role> updateRole(@ModelAttribute Role role) {
		return roleService.updateRole(role);
	}
	
	@DeleteMapping("/role/{roleId}")
	public Result<Object> deleteRole(@PathVariable int roleId) {
		return roleService.deleteRole(roleId);
	}
}
