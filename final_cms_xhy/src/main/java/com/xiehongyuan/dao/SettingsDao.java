package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.Settings;

public interface SettingsDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: Settings      
	 * @throws
	 */
	Settings selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����Settings��ѯ�б�  
	 * @param: @param settings
	 * @param: @return      
	 * @return: List<Settings>      
	 * @throws
	 */
	List<Settings> select(@Param("settings") Settings settings);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param settings
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("settings") Settings settings);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param settings
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("settings") Settings settings);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param settings
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("settings") Settings settings);
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
