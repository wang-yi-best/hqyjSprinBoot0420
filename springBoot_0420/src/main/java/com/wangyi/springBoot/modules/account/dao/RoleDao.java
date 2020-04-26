package com.wangyi.springBoot.modules.account.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wangyi.springBoot.modules.account.entity.Role;
import com.wangyi.springBoot.modules.common.vo.Result;

/**
　 * <p>Title: Role</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月26日 下午12:48:58 
　 * @version 1.0
*/
@Mapper
public interface RoleDao {

	/**
	*<p>Title: getRoleByRole</p>
	*<p>Description: </p>
	　 * @param roleId
	　 * @return
	*/
	@Select("SELECT * FROM role WHERE role_id = #{roleId}")
	List<Role> getRoleByRole(int roleId);

	/**
	*<p>Title: getRoleByRoleName</p>
	*<p>Description: </p>
	　 * @param roleName
	　 * @return
	*/
	@Select("SELECT * FROM role WHERE role_name = #{roleName}")
	Role getRoleByRoleName(String roleName);

	/**
	*<p>Title: insertRole</p>
	*<p>Description: </p>
	　 * @param role
	　 * @return
	*/
	@Insert("INSERT INTO role (role_name) VALUES (#{roleName})")
	Result<Role> insertRole(Role role);

	/**
	*<p>Title: updateRole</p>
	*<p>Description: </p>
	　 * @param role
	　 * @return
	*/
	@Update("UPDATE role SET role_name = #{roleName} WHERE role_id = #{roleId}")
	Result<Role> updateRole(Role role);

	/**
	*<p>Title: deleteRole</p>
	*<p>Description: </p>
	　 * @param roleId
	　 * @return
	*/
	@Delete("DELETE FROM role WHERE role_id = #{roleId}")
	Result<Object> deleteRole(int roleId);

}
