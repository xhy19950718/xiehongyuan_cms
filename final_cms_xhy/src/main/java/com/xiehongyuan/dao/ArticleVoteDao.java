package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.ArticleVote;

public interface ArticleVoteDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: ArticleVote      
	 * @throws
	 */
	ArticleVote selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����ArticleVote��ѯ�б�  
	 * @param: @param articleVote
	 * @param: @return      
	 * @return: List<ArticleVote>      
	 * @throws
	 */
	List<ArticleVote> select(@Param("articleVote") ArticleVote articleVote);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param articleVote
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("articleVote") ArticleVote articleVote);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param articleVote
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("articleVote") ArticleVote articleVote);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param articleVote
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("articleVote") ArticleVote articleVote);
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

