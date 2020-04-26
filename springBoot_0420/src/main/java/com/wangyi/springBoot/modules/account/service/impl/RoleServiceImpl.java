package com.wangyi.springBoot.modules.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangyi.springBoot.modules.account.dao.RoleDao;
import com.wangyi.springBoot.modules.account.entity.Role;
import com.wangyi.springBoot.modules.account.service.RoleService;
import com.wangyi.springBoot.modules.common.vo.Result;

/**
　 * <p>Title: RoleServiceImpl</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月26日 下午12:55:07 
　 * @version 1.0
*/
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	/* (non-Javadoc)
	* <p>Title: getRoleByRole</p>
	* <p>Description: </p>
	* @param roleId
	* @return
	* @see com.wangyi.springBoot.modules.account.service.RoleService#getRoleByRole(int)
	*/
	@Override
	public List<Role> getRoleByRole(int roleId) {
		return roleDao.getRoleByRole(roleId);
	}

	/* (non-Javadoc)
	* <p>Title: getRoleByRoleName</p>
	* <p>Description: </p>
	* @param roleName
	* @return
	* @see com.wangyi.springBoot.modules.account.service.RoleService#getRoleByRoleName(java.lang.String)
	*/
	@Override
	public Role getRoleByRoleName(String roleName) {
		return roleDao.getRoleByRoleName(roleName);
	}

	/* (non-Javadoc)
	* <p>Title: insertRole</p>
	* <p>Description: </p>
	* @param role
	* @return
	* @see com.wangyi.springBoot.modules.account.service.RoleService#insertRole(com.wangyi.springBoot.modules.account.entity.Role)
	*/
	@Override
	public Result<Role> insertRole(Role role) {
		return roleDao.insertRole(role);
	}

	/* (non-Javadoc)
	* <p>Title: updateRole</p>
	* <p>Description: </p>
	* @param role
	* @return
	* @see com.wangyi.springBoot.modules.account.service.RoleService#updateRole(com.wangyi.springBoot.modules.account.entity.Role)
	*/
	@Override
	public Result<Role> updateRole(Role role) {
		return roleDao.updateRole(role);
	}

	/* (non-Javadoc)
	* <p>Title: deleteRole</p>
	* <p>Description: </p>
	* @param roleId
	* @return
	* @see com.wangyi.springBoot.modules.account.service.RoleService#deleteRole(int)
	*/
	@Override
	public Result<Object> deleteRole(int roleId) {
		return roleDao.deleteRole(roleId);
	}

}
