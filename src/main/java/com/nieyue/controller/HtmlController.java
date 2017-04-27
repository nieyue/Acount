package com.nieyue.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * Html控制类
 * @author yy
 *
 */
@RestController
public class HtmlController {
	/**
	 * Html单个加载
	 * @return
	 */
	@RequestMapping(value={"/index","/"})
	public ModelAndView index(Model model,HttpSession session){
		System.err.println(session.getAttribute("userSessionId"));
		if(session.getAttribute("userSessionId")==null||!session.getAttribute("userSessionId").equals(session.getId())){
			session.setAttribute("userSessionId", session.getId());
		}
		model.addAttribute("sessionId", session.getId());
		return new ModelAndView("index");
	}
	@RequestMapping(value={"/404"})
	public ModelAndView go404(){
		return new ModelAndView("404");
	}
	@RequestMapping("/date")
	public Date date(@RequestParam("date")Date date){
		System.out.println(date.toLocaleString());
		return date;
	}
	@RequestMapping("/date1")
	public String date1(@RequestParam("date")Date date){
		System.out.println(date.toLocaleString());
		return date.toString();
	}
	
}
