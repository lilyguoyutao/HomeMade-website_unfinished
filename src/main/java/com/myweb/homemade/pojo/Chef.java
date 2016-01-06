package com.myweb.homemade.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chef")
public class Chef implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="chef_id")
	private int chef_id;
	private String username;
    private String password;
    private String introduction;
    private String chef_level;
    private String email;
    private String address;
    private String phone;
    private String views;
    private String summary;
    private String chef_status;
    public int getChef_id(){
    	return chef_id;
    }
    public String getUsername(){
    	return username;
    }
    public String getPassword(){
    	return password;
    }
    public String getIntroduction(){
    	return introduction;
    }
    public String getChef_level(){
    	return chef_level;
    }
    public String getEmail(){
    	return email;
    }
    public String getAddress(){
    	return address;
    }
    public String getPhone(){
    	return phone;
    }
    public String getViews(){
    	return views;
    }
    public String getSummary(){
    	return summary;
    }
    public String getChef_status(){
    	return chef_status;
    }
    public void setChef_id(int chef_id){
    	this.chef_id=chef_id;
    }
    public void setUsername(String username){
    	this.username=username;
    }
    public void setPassword(String password){
    	this.password=password;
    }
    public void setIntroduction(String introduction){
    	this.introduction=introduction;
    }
    public void setChef_level(String chef_level){
    	this.chef_level=chef_level;
    }
    public void setEmail(String email){
    	this.email=email;
    }
    public void setAddress(String address){
    	this.address=address;
    }
    public void setPhone(String phone){
    	this.phone=phone;
    }
    public void setViews(String views){
    	this.views=views;
    }
    public void setSummary(String summary){
    	this.summary=summary;
    }
    public void setChef_status(String chef_status){
    	this.chef_status=chef_status;
    }
    
}
