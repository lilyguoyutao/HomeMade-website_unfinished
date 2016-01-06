package com.myweb.homemade.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="comment_id")
    private int comment_id;
    private int food_id;
    private int user_id;
    private String content;
    private String comment_time;
    private String status;
    public int getComment_id(){
    	return comment_id;
    }
    public int getFood_id(){
    	return food_id;
    }
    public int getUser_id(){
    	return user_id;
    }
    public String getContent(){
    	return content;
    }
    public String getComment_time(){
    	return comment_time;
    }
    public String getStatus(){
    	return status;
    }
    public void setComment_id(int comment_id){
    	this.comment_id=comment_id;
    }
    public void setFood_id(int food_id){
    	this.food_id=food_id;
    }
    public void setUser_id(int user_id){
    	this.user_id=user_id;
    }
    public void setContent(String content){
    	this.content=content;
    }
    public void setComment_time(String comment_time){
    	this.comment_time=comment_time;
    }
    public void setStatus(String status){
    	this.status=status;
    }
    
}
