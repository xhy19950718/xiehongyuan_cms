package com.xiehongyuan.service;

import com.github.pagehelper.PageInfo;
import com.xiehongyuan.pojo.User;

public interface UserService {
	/**
	 * @Title: register   
	 * @Description: ע�������û�   
	 * @param: @param user
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	boolean register(User user);
	/**
	 * @Title: getByUsername   
	 * @Description: ���ݵ�¼���ƣ���ѯ�û�   
	 * @param: @param username
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	User getByUsername(String username);
	/**
	 * @Title: locked   
	 * @Description: ���û�   
	 * @param: @param userId
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	boolean locked(Integer userId);
	/**
	 * @Title: unLocked   
	 * @Description: �����û�   
	 * @param: @param userId
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	boolean unLocked(Integer userId);
	/**
	 * @Title: addScore   
	 * @Description: ���û���ӻ��֣������û��ܻ��֡� 
	 * @param: @param userId
	 * @param: @param score
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int addScore(Integer userId,int score);
	/**
	 * @Title: getPageInfo   
	 * @Description: ��ѯ�û��б�PageInfo��   
	 * @param: @param user
	 * @param: @param pageNum
	 * @param: @param pageSize
	 * @param: @return      
	 * @return: PageInfo<User>      
	 * @throws
	 */
	PageInfo<User> getPageInfo(User user, int pageNum,int pageSize);
	/**
	 * @Title: update   
	 * @Description: �����û���Ϣ
	 * @param: @param user      
	 * @return: void      
	 * @throws
	 */
	boolean update(User user);
	/**
	 * @Title: isExist   
	 * @Description: �����û����ж��û��Ƿ����   
	 * @param: @param username
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	boolean isExist(String username);
	/**
	 * @Title: getById   
	 * @Description: �����û�Id��ѯUser   
	 * @param: @param id
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	User getById(Integer id);
}
