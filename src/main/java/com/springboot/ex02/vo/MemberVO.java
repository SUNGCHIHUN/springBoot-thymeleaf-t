package com.springboot.ex02.vo;

import java.sql.Date;
import java.sql.Timestamp;

public class MemberVO {
   // 멤버변수 = VO = input명
   private String id;  // PK 
    private String password;
    private String name;
    private Date birthday;
    private String hp;
    private String email;
    private Timestamp regDate;
    
    // 멤버메서드
   public String getId() {
      return id;
   }
   
   public void setId(String id) {
      this.id = id;
   }
   
   public String getPassword() {
      return password;
   }
   
   public void setPassword(String password) {
      this.password = password;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public Date getBirthday() {
      return birthday;
   }
   
   public void setbirthd(Date birthday) {
      this.birthday = birthday;
   }
   
   public String getHp() {
      return hp;
   }
   
   public void setHp(String hp) {
      this.hp = hp;
   }
   
   public String getEmail() {
      return email;
   }
   
   public void setEmail(String email) {
      this.email = email;
   }
   
   public Timestamp getRegDate() {
      return regDate;
   }
   
   public void setRegDate(Timestamp regDate) {
      this.regDate = regDate;
   }
   
}