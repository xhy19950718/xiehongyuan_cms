package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.ArticleTag;

public interface ArticleTagDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: ArticleTag      
	 * @throws
	 */
	ArticleTag selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����ArticleTag��ѯ�б�  
	 * @param: @param articleTag
	 * @param: @return      
	 * @return: List<ArticleTag>      
	 * @throws
	 */
	List<ArticleTag> select(@Param("articleTag") ArticleTag articleTag);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param articleTag
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("articleTag") ArticleTag articleTag);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param articleTag
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("articleTag") ArticleTag articleTag);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param articleTag
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("articleTag") ArticleTag articleTag);
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
