package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.User;

public interface UserDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	User selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����User��ѯ�б�  
	 * @param: @param user
	 * @param: @return      
	 * @return: List<User>      
	 * @throws
	 */
	List<User> select(@Param("user") User user);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param user
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("user") User user);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param user
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("user") User user);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param user
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("user") User user);
	/**
	 * @Title: deleteById   
	 * @Description: ����Idɾ����¼   
	 * @param: @param id
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int deleteById(@Param("id") Integer id);
	/**
	 * @Title: deleteByIds   
	 * @Description: ����Ids����ɾ����¼   
	 * @param: @param ids "1,2,3"
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int deleteByIds(@Param("ids") String ids);
	/**
	 * @Title: updateLocked   
	 * @Description: �޸�locked�ֶ�ֵ   
	 * @param: @param userId
	 * @param: @param locked
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int updateLocked(@Param("userId") Integer userId, @Param("locked")  int locked);
	/**
	 * @Title: selectByUsername   
	 * @Description: ���ݵ�¼������ѯ�û�  
	 * @param: @param username
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	User selectByUsername(String username);
}
