package com.myweb.homemade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myweb.homemade.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userservice;
	
	@RequestMapping(value="/user/login")
	public String login(){
		return "Home";
	}
	
	@RequestMapping(value="/user/register")
	public String register(){
		return "login";
	}
	
	@RequestMapping(value="/user/logout")
	public String logout(){
		return "logout";
	}
	
	@RequestMapping(value="/user/editprofile",method=RequestMethod.POST)
	public String editProfile(){
		return null;
		
	}
	
	@RequestMapping(value="/user/addlike")
	public String addLike(){
		return null;
	}
	
	@RequestMapping(value="/user/deletelike")
	public String deleteLike(){
		return null;
	}
	
	@RequestMapping(value="/user/getlikebyuserid")
	public String getLikeByUserid(){
		return null;
	}
	
	}

