package com.myweb.homemade.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
    private int user_id;
    private String username;
    private String passwords;
    private String address;
    private String email;
    private String phone;
    private String status;
    public int getUser_id(){
    	return user_id;
    }
    public String getUsername(){
    	return username;
    }
    public String getPasswords(){
    	return passwords;
    }
    public String getAddress(){
    	return address;
    }
    public String getEmail(){
    	return email;
    }
    public String getPhone(){
    	return phone;
    }
    public String getStatus(){
    	return phone;
    }
    public void setUser_id(int user_id){
    	this.user_id=user_id;
    }
    public void setUsername(String username){
    	this.username=username;
    }
    public void setPasswords(String passwords){
    	this.passwords=passwords;
    }
    public void setAddress(String address){
    	this.address=address;
    }
    public void setEmail(String email){
    	this.email=email;
    }
    public void setPhone(String phone){
    	this.phone=phone;
    }
    public void setStatus(String status){
    	this.status=status;
    }
    
}
