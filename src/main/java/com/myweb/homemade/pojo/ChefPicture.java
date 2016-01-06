package com.myweb.homemade.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chef_picture")
public class ChefPicture {
   @Id
   @GeneratedValue
   @Column(name="id")
   private int id;
   
   private int chef_id;
   private String address;
   private String status;
   public int getId(){
	   return id;
   }
   public int getChef_id(){
	   return chef_id;
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
   public void setChef_id(int chef_id){
	  this.chef_id=chef_id;
   }
   public void setAddress(String address){
	   this.address=address;
   }
   public void setStatus(String status){
	   this.status=status;
   }
}
