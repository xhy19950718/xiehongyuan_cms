package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.Slide;

public interface SlideDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: Slide      
	 * @throws
	 */
	Slide selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����Slide��ѯ�б�  
	 * @param: @param slide
	 * @param: @return      
	 * @return: List<Slide>      
	 * @throws
	 */
	List<Slide> select(@Param("slide") Slide slide);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param slide
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("slide") Slide slide);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param slide
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("slide") Slide slide);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param slide
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("slide") Slide slide);
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
