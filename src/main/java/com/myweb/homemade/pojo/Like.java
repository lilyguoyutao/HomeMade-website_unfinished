package com.myweb.homemade.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="like")
public class Like implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	private int user_id;
	private int food_id;
	public int getId(){
		return id;
	}
	public int getUser_id(){
		return user_id;
	}
	public int getFood_id(){
		return food_id;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setUser_id(int user_id){
		this.user_id=user_id;
	}
	public void setFood_id(int food_id){
		this.food_id=food_id;
	}
	

}
