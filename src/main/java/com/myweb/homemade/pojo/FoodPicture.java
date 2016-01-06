package com.myweb.homemade.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="food_picture")
public class FoodPicture {
	
	   @Id
	   @GeneratedValue
	   @Column(name="id")
	   private int id;
	   private int food_id;
	   private String address;
	   private String status;
	   public int getId(){
		   return id;
	   }
	   public int getFood_id(){
		   return food_id;
	   }
	   public String getAddress(){
		   return address;
	   }
	   public String getStatus(){
		   return status;
	   }
	   public void setId(int id){
		   this.id=id;
	   }
	   public void setFood_id(int food_id){
		  this.food_id=food_id;
	   }
	   public void setAddress(String address){
		   this.address=address;
	   }
	   public void setStatus(String status){
		   this.status=status;
	   }
}
