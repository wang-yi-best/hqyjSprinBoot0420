package com.wangyi.springBoot.modules.account.service;

import java.util.List;

import com.wangyi.springBoot.modules.account.entity.Role;
import com.wangyi.springBoot.modules.common.vo.Result;

/**
　 * <p>Title: RoleService</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月26日 下午12:50:37 
　 * @version 1.0
*/
public interface RoleService {

	/**
	*<p>Title: getRoleByRole</p>
	*<p>Description: </p>
	　 * @param roleId
	　 * @return
	*/
	List<Role> getRoleByRole(int roleId);

	/**
	*<p>Title: getRoleByRoleName</p>
	*<p>Description: </p>
	　 * @param roleName
	　 * @return
	*/
	Role getRoleByRoleName(String roleName);

	/**
	*<p>Title: insertRole</p>
	*<p>Description: </p>
	　 * @param role
	　 * @return
	*/
	Result<Role> insertRole(Role role);

	/**
	*<p>Title: updateRole</p>
	*<p>Description: </p>
	　 * @param role
	　 * @return
	*/
	Result<Role> updateRole(Role role);

	/**
	*<p>Title: deleteRole</p>
	*<p>Description: </p>
	　 * @param roleId
	　 * @return
	*/
	Result<Object> deleteRole(int roleId);


}
