package com.myweb.homemade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myweb.homemade.dao.FoodDao;
import com.myweb.homemade.service.FoodService;

@Controller
public class FoodController {
    @Autowired
    FoodService foodservice;
    
    @RequestMapping(value="/food/getfoodbyfoodid")
    @ResponseBody
    public List<FoodDao> getFoodByfoodId(){
    	return null;
    }
    
    @RequestMapping(value="/food/getfoodbychefid")
    @ResponseBody
    public List<FoodDao> getFoodBychefId(){
    	return null;
    }
    
    @RequestMapping(value="/food/getfoodbyview")
    @ResponseBody
    public List<FoodDao> getFoodByView(){
    	return null;
    }
    
    @RequestMapping(value="/food/getfoodbyrate")
    @ResponseBody
    public List<FoodDao> getFoodByRate(){
    	return null;
    }
    
    @RequestMapping(value="/food/getfoodbycondition")
    @ResponseBody
    public List<FoodDao> getFoodByCondition(){
    	return null;
    }
    
    @RequestMapping(value="/food/addfood",method=RequestMethod.POST)
    public String Addfood(){
    	return null;
    }
    
    @RequestMapping(value="/food/editfood",method=RequestMethod.POST)
    public String Editfood(){
    	return null;
    }
    
    @RequestMapping(value="/food/deletefood",method=RequestMethod.POST)
    public String Deletefood(){
    	return null;
    }
    

}
