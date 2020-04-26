package com.wangyi.springBoot.modules.account.service;

import java.util.List;

import com.wangyi.springBoot.modules.account.entity.User;
import com.wangyi.springBoot.modules.common.vo.Result;

/**
　 * <p>Title: UserService</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月26日 下午12:50:20 
　 * @version 1.0
*/
public interface UserService {

	/**
	*<p>Title: getUserByUser</p>
	*<p>Description: </p>
	　 * @param userId
	　 * @return
	*/
	List<User> getUserByUser(int userId);

	/**
	*<p>Title: getUserByUserName</p>
	*<p>Description: </p>
	　 * @param userName
	　 * @param localUserName
	　 * @return
	*/
	User getUserByUserName(String userName);

	/**
	*<p>Title: insertUser</p>
	*<p>Description: </p>
	　 * @param user
	　 * @return
	*/
	Result<User> insertUser(User user);

	/**
	*<p>Title: updateUser</p>
	*<p>Description: </p>
	　 * @param user
	　 * @return
	*/
	Result<User> updateUser(User user);

	/**
	*<p>Title: deleteUser</p>
	*<p>Description: </p>
	　 * @param userId
	　 * @return
	*/
	Result<Object> deleteUser(int userId);

}
