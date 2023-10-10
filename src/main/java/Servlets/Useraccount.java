package Servlets;

import Servlets.Useraccount;

public class Useraccount {
 public static final String GENDER_MALE ="M";
 public static final String GENDER_FEMALE="F";
 
 private String userName;
 private String gender;
 private String password;
 private String numberphone;

 
 public Useraccount(){
 
 }
 public Useraccount(String username, String gender, String password,String numberphone){
 this.userName=username;
 this.gender=gender;
 this.password=password;
 this.numberphone=numberphone;
 }
 public Useraccount(String username, String password){
 this.userName=username; 
 this.password=password;
 }
 public Useraccount(Useraccount us){
 this.userName=us.userName;
 this.gender=us.gender;
 this.password=us.password;
 this.numberphone=us.numberphone;
 }
 public String getUserName() {
 return userName;
 }
 public String getGender() {
 return gender;
 }
 public String getPassword() {
 return password;
 }
 public String getNumberphone() {
	 return numberphone;
 }
 public void setUserName(String userName) {
 this.userName = userName;
 }
 public void setGender(String gender) {
 this.gender = gender;
 }
 public void setPassword(String password) {
 this.password = password;
 }
 public void setNumberphone(String numberphone) {
 this.numberphone = numberphone;
 }
}