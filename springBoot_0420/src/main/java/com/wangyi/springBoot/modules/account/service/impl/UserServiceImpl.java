package com.wangyi.springBoot.modules.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangyi.springBoot.modules.account.dao.UserDao;
import com.wangyi.springBoot.modules.account.entity.User;
import com.wangyi.springBoot.modules.account.service.UserService;
import com.wangyi.springBoot.modules.common.vo.Result;

/**
　 * <p>Title: UserServiceImpl</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月26日 下午12:52:10 
　 * @version 1.0
*/
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	/* (non-Javadoc)
	* <p>Title: getUserByUser</p>
	* <p>Description: </p>
	* @param userId
	* @return
	* @see com.wangyi.springBoot.modules.account.service.UserService#getUserByUser(int)
	*/
	@Override
	public List<User> getUserByUser(int userId) {
		return userDao.getUserByUser(userId);
	}

	/* (non-Javadoc)
	* <p>Title: getUserByUserName</p>
	* <p>Description: </p>
	* @param userName
	* @param localUserName
	* @return
	* @see com.wangyi.springBoot.modules.account.service.UserService#getUserByUserName(java.lang.String, java.lang.String)
	*/
	@Override
	public User getUserByUserName(String userName) {
		return userDao.getUserByUserName(userName);
	}

	/* (non-Javadoc)
	* <p>Title: insertUser</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.wangyi.springBoot.modules.account.service.UserService#insertUser(com.wangyi.springBoot.modules.account.entity.User)
	*/
	@Override
	public Result<User> insertUser(User user) {
		return userDao.insertUser(user);
	}

	/* (non-Javadoc)
	* <p>Title: updateUser</p>
	* <p>Description: </p>
	* @param user
	* @return
	* @see com.wangyi.springBoot.modules.account.service.UserService#updateUser(com.wangyi.springBoot.modules.account.entity.User)
	*/
	@Override
	public Result<User> updateUser(User user) {
		return userDao.updateUser(user);
	}

	/* (non-Javadoc)
	* <p>Title: deleteUser</p>
	* <p>Description: </p>
	* @param userId
	* @return
	* @see com.wangyi.springBoot.modules.account.service.UserService#deleteUser(int)
	*/
	@Override
	public Result<Object> deleteUser(int userId) {
		return userDao.deleteUser(userId);
	}

}
