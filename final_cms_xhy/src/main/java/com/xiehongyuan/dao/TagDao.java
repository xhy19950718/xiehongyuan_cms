package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.Tag;

public interface TagDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: Tag      
	 * @throws
	 */
	Tag selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����Tag��ѯ�б�  
	 * @param: @param tag
	 * @param: @return      
	 * @return: List<Tag>      
	 * @throws
	 */
	List<Tag> select(@Param("tag") Tag tag);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param tag
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("tag") Tag tag);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param tag
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("tag") Tag tag);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param tag
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("tag") Tag tag);
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
