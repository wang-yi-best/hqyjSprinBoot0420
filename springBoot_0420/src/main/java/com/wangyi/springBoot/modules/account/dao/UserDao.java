package com.wangyi.springBoot.modules.account.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.wangyi.springBoot.modules.account.entity.User;
import com.wangyi.springBoot.modules.common.vo.Result;

/**
　 * <p>Title: User</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月26日 下午12:48:47 
　 * @version 1.0
*/
@Repository
@Mapper
public interface UserDao {

	/**
	*<p>Title: getUserByUser</p>
	*<p>Description: </p>
	　 * @param userId
	　 * @return
	*/
	@Select("SELECT * FROM `user` WHERE user_id = #{userId}")
	List<User> getUserByUser(int userId);

	/**
	*<p>Title: getUserByUserName</p>
	*<p>Description: </p>
	　 * @param userName
	　 * @return
	*/
	@Select("SELECT * FROM `user` WHERE user_name = #{userName}")
	User getUserByUserName(String userName);

	/**
	*<p>Title: insertUser</p>
	*<p>Description: </p>
	　 * @param user
	　 * @return
	*/
	@Insert("INSERT INTO `user` (user_name,password) VALUES (#{userName},#{password})")
	Result<User> insertUser(User user);

	/**
	*<p>Title: updateUser</p>
	*<p>Description: </p>
	　 * @param user
	　 * @return
	*/
	@Update("UPDATE `user` SET user_name = #{userName} , `password` = #{password} WHERE user_id = #{userId}")
	Result<User> updateUser(User user);

	/**
	*<p>Title: deleteUser</p>
	*<p>Description: </p>
	　 * @param userId
	　 * @return
	*/
	@Delete("DELETE FROM `user` WHERE user_id = #{userId}")
	Result<Object> deleteUser(int userId);

}
