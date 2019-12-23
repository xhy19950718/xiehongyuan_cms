package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.VoteContent;

public interface VoteContentDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: VoteContent      
	 * @throws
	 */
	VoteContent selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����VoteContent��ѯ�б�  
	 * @param: @param voteContent
	 * @param: @return      
	 * @return: List<VoteContent>      
	 * @throws
	 */
	List<VoteContent> select(@Param("voteContent") VoteContent voteContent);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param voteContent
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("voteContent") VoteContent voteContent);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param voteContent
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("voteContent") VoteContent voteContent);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param voteContent
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("voteContent") VoteContent voteContent);
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
