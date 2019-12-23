package com.xiehongyuan.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.xiehongyuan.common.CmsConstant;
import com.xiehongyuan.common.CmsMd5Util;
import com.xiehongyuan.common.CookieUtil;
import com.xiehongyuan.common.JsonResult;
import com.xiehongyuan.pojo.Article;
import com.xiehongyuan.pojo.Channel;
import com.xiehongyuan.pojo.User;
import com.xiehongyuan.service.ArticleService;
import com.xiehongyuan.service.UserService;
import com.zhanggm.common.utils.StringUtil;

@Controller
@RequestMapping("/user/")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ArticleService articleService;
	
	/**
	 * @Title: login   
	 * @Description: �û���¼����   
	 * @param: @return      
	 * @return: Object      
	 * @throws
	 */
	@RequestMapping(value="login",method=RequestMethod.GET)
	public Object login() {
		
		return "/user/login";
	}
	/**
	 * @Title: login   
	 * @Description: �û���¼�ӿ�   
	 * @param: @param user
	 * @param: @param session
	 * @param: @return      
	 * @return: Object    
	 * @throws
	 */
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public Object login(User user,HttpSession session,HttpServletResponse response) {
		//�ж��û���������
		if(StringUtil.isBlank(user.getUsername()) || StringUtil.isBlank(user.getPassword())) {
			return JsonResult.fail(1000, "账号用户名不能为空");
		}
		//��ѯ�û�
		User userInfo = userService.getByUsername(user.getUsername());
		//�û�Ϊ��
		if(userInfo==null) {
			return JsonResult.fail(1000, "该用户未注册");
		}
		//�ж�����
		String string2md5 = CmsMd5Util.string2MD5(user.getPassword());
		if(userInfo.getLocked()==1) {
			return JsonResult.fail(1000, "已被禁用");
		}
		if(string2md5.equals(userInfo.getPassword())) {
			session.setAttribute(CmsConstant.UserSessionKey, userInfo);
			int maxAge=1000*60*60*24;
			if("1".equals(user.getIsMima())) {
			CookieUtil.addCookie(response, "username", user.getUsername(), null, null, maxAge);
			CookieUtil.addCookie(response, "password", user.getPassword(), null, null, maxAge);
			
			}
			return JsonResult.sucess();
		}
		
		
		return JsonResult.fail(500, "密码错误");
	}
	/**
	 * @Title: logout   
	 * @Description: TODO(�����������������)   
	 * @param: @param response
	 * @param: @param session
	 * @param: @return      
	 * @return: Object      
	 * @throws
	 */
	@RequestMapping("logout")
	public Object logout(HttpServletResponse response,HttpSession session) {
		session.removeAttribute(CmsConstant.UserSessionKey);
		return "redirect:/";
	}
	
	/**
	 * @Title: register   
	 * @Description: �û�ע��ҳ��   
	 * @param: @return      
	 * @return: Object      
	 * @throws
	 */
	@RequestMapping(value="register",method=RequestMethod.GET)
	public Object register() {
		return "/user/register";
	}
	/**
	 * @Title: register   
	 * @Description: �û�ע��ӿ�   
	 * @param: @param user
	 * @param: @param session
	 * @param: @return      
	 * @return: Object      
	 * @throws
	 */
	@RequestMapping(value="register",method=RequestMethod.POST)
	public @ResponseBody Object register(User user,HttpSession session) {
		//�ж��û����Ƿ����
		boolean result = userService.isExist(user.getUsername());
		if(result) {
			return JsonResult.fail(10001, "�û����Ѵ���");
		}
		//�û�ע��
		boolean register = userService.register(user);
		if(register) {
			return JsonResult.sucess();
		}
		return JsonResult.fail(500, "δ֪����");
	}
	
	@RequestMapping("center")
	public String center(HttpServletResponse response,HttpSession session) {
		return "user/center";
	}
	
	/**
	 * @Title: settings   
	 * @Description: �����û���Ϣ   
	 * @param: @param response
	 * @param: @param session
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value="settings",method=RequestMethod.GET)
	public String settings(HttpServletResponse response,HttpSession session,Model model) {
		User userInfo = (User)session.getAttribute(CmsConstant.UserSessionKey);
		/** ��ѯ�û���Ϣ **/
		User user = userService.getByUsername(userInfo.getUsername());
		model.addAttribute("user", user);
		return "user/settings";
	}
	/**
	 * @Title: settings   
	 * @Description: �����û���Ϣ  
	 * @param: @param user
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value="settings",method=RequestMethod.POST)
	@ResponseBody
	public JsonResult settings(User user) {
		userService.update(user);
		return JsonResult.sucess();
	}
	
	@RequestMapping("comment")
	public String comment(HttpServletResponse response,HttpSession session) {
		return "user/comment";
	}
	
	@RequestMapping("article")
	public String article(Article article,Model model,HttpSession session,
			@RequestParam(value="pageNum",defaultValue="1") int pageNum,@RequestParam(value="pageSize",defaultValue="3") int pageSize) {
		//�����û�Id
		User userInfo = (User)session.getAttribute(CmsConstant.UserSessionKey);
		article.setUserId(userInfo.getId());
		//��ѯ����
		PageInfo<Article> pageInfo = articleService.getPageInfo(article,pageNum,pageSize);
		model.addAttribute("pageInfo", pageInfo);
		List<Channel> channelList = articleService.getChannelList();
		model.addAttribute("channelList", channelList);
		return "user/article";
	}
	
}
