package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.Category;

public interface CategoryDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: Category      
	 * @throws
	 */
	Category selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����Category��ѯ�б�  
	 * @param: @param category
	 * @param: @return      
	 * @return: List<Category>      
	 * @throws
	 */
	List<Category> select(@Param("category") Category category);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param category
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("category") Category category);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param category
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("category") Category category);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param category
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("category") Category category);
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
	 * @Title: selectListByChannelId   
	 * @Description: ����Ƶ��Id����ѯ�б�
	 * @param: @param channelId
	 * @param: @return      
	 * @return: List<Category>      
	 * @throws
	 */
	List<Category> selectListByChannelId(Integer channelId);
}
