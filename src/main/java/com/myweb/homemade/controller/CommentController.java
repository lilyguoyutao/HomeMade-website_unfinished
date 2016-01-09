package com.myweb.homemade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myweb.homemade.dao.CommentDao;
import com.myweb.homemade.service.CommentService;

@Controller
public class CommentController {
  @Autowired
  CommentService commentservice;
  
  @RequestMapping(value="/comment/addcomment",method=RequestMethod.POST)
  public String addComment(){
	  return null;
  }
  
  @RequestMapping(value="/comment/eidtcomment",method=RequestMethod.POST)
  public String editComment(){
	  return null;
  }
  
  @RequestMapping(value="/comment/deletecomment")
  public String DeleteComment(){
	  return null;
  }
  
  @RequestMapping(value="/comment/getcommentbyuserid")
  @ResponseBody
  public List<CommentDao> getCommentByuserId(){
	  return null;
  }
  
  @RequestMapping(value="/comment/getcommentbyfoodid")
  @ResponseBody
  public List<CommentDao> getCommentByfoodId(){
	  return null;
  }
  
  @RequestMapping(value="/comment/getcommentbychefid")
  @ResponseBody
  public List<CommentDao> getCommentBychefId(){
	  return null;
  }
  
}
