package com.myweb.homemade.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="food")
public class Food {
	
   @Id
   @GeneratedValue
   @Column(name="food_id")	
   private int food_id;
   private String food_name;
   private double food_price;
   private String recipe;
   private String cook_method;
   private String meal_time;
   private String deadline;
   private String street;
   private String city;
   private String nation;
   private String delievery_method;
   private String description;
   private String ratting;
   private String food_status;
   public int getFood_id(){
	   return food_id;
   }
   public String getFood_name(){
	   return food_name;
   }
   public double getFood_price(){
	   return food_price;
   }
   public String getRecipe(){
	   return recipe;
   }
   public String getCook_method(){
	   return cook_method;
   }
   public String getMeal_time(){
	   return meal_time;
   }
   public String getDeadline(){
	   return deadline;
   }
   public String getStreet(){
	   return street;
   }
   public String getCity(){
	   return city;
   }
   public String getNation(){
	   return nation;
   }
   public String getDelievery_method(){
	   return delievery_method;
   }
   public String getDescription(){
	   return description;
   }
   public String getRatting(){
	   return ratting;
   }
   public String getFood_status(){
	   return food_status;
   }
   public void setFood_id(int food_id){
	   this.food_id=food_id;
   }
   public void setFood_name(String food_name){
	   this.food_name=food_name;
   }
   public void setFood_price(double food_price){
	   this.food_price=food_price;
   }
   public void setRecipe(String recipe){
	   this.recipe=recipe;
   }
   public void setCook_method(String cook_method){
	   this.cook_method=cook_method;
   }
   public void setMeal_time(String meal_time){
	   this.meal_time=meal_time;
   }
   public void setDeadline(String deadline){
	   this.deadline=deadline;
   }
   public void setStreet(String street){
	   this.street=street;
   }
   public void setCity(String city){
	   this.city=city;
   }
   public void setNation(String nation){
	   this.nation=nation;
   }
   public void setDelievery_method(String delievery_method){
	   this.delievery_method=delievery_method;
   }
   public void setDescription(String description){
	   this.description=description;
   }
   public void setRatting(String ratting){
	   this.ratting=ratting;
   }
   public void setFood_status(String food_status){
	  this.food_status=food_status;
   }
}
