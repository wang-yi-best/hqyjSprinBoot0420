package com.wangyi.springBoot.modules.account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
　 * <p>Title: RoleResource</p>
　 * <p>Description: 角色资源类</p>
　 * @author yi.wang
　 * @date 2020年4月26日 上午10:39:05 
　 * @version 1.0
*/
@Entity
@Table(name = "role_resource")//表名
public class RoleResource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//生成主键，自增
	private int roleResourceId;
	private int roleId;
	private int resourceId;

	public int getRoleResourceId() {
		return roleResourceId;
	}

	public void setRoleResourceId(int roleResourceId) {
		this.roleResourceId = roleResourceId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
}
