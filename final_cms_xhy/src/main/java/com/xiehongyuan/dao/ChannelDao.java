package com.xiehongyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiehongyuan.pojo.Channel;

public interface ChannelDao {
	/**
	 * @Title: selectById   
	 * @Description: ����Id����ѯ����   
	 * @param: @param id
	 * @param: @return      
	 * @return: Channel      
	 * @throws
	 */
	Channel selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: ����Channel��ѯ�б�  
	 * @param: @param channel
	 * @param: @return      
	 * @return: List<Channel>      
	 * @throws
	 */
	List<Channel> select(@Param("channel") Channel channel);
	/**
	 * @Title: count   
	 * @Description: ��ѯ��������   
	 * @param: @param channel
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("channel") Channel channel);
	/**
	 * @Title: insert   
	 * @Description: ����һ����¼   
	 * @param: @param channel
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("channel") Channel channel);
	/**
	 * @Title: update   
	 * @Description: ����Id���¼�¼ 
	 * @param: @param channel
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("channel") Channel channel);
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
