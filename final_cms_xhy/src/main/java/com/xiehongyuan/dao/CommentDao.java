package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.Comment;

public interface CommentDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: Comment      
	 * @throws
	 */
	Comment selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����Comment��ѯ�б�  
	 * @param: @param comment
	 * @param: @return      
	 * @return: List<Comment>      
	 * @throws
	 */
	List<Comment> select(@Param("comment") Comment comment);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param comment
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("comment") Comment comment);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param comment
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("comment") Comment comment);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param comment
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("comment") Comment comment);
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
}
