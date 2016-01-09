package com.myweb.homemade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myweb.homemade.service.ChefService;

@Controller
public class ChefController {
	@Autowired
	ChefService chefservice;
	
	@RequestMapping(value="/chef/login")
	public String login(){
		return "Home";
	}
	
	@RequestMapping(value="/chef/register")
	public String register(){
		return "login";
	}
	
	@RequestMapping(value="/chef/logout")
	public String logout(){
		return "logout";
	}
	
	@RequestMapping(value="/chef/editprofile")
	public String editProfile(){
		return null;
	}
}
