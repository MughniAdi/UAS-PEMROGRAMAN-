/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.jpa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

/**
 *
 * @author Mughni Adinurhafiid
 */
@Entity
@Table(name = "users")
public class Users implements Serializable{
     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "userid")
     private Integer UserID;
     
     @Column(name = "name")
     @Size(max = 40)
     private String name;
     
     @Column(name = "title")
     @Size(max = 30)
     private String title;
     
     @Column(name = "birthdate")
     private Date birthdate;
     
     @Column(name = "hiredate")
     private Date hiredate;
     
     @Column(name = "position")
     private String position;
     
     @Column(name = "email")
     @Size(max = 30)
     private String email;
     
     @Column(name = "password")
     @Size(max = 45)
     private String password;

    public Users() {
    }

    public Users(Integer UserID, String Name, String Title, Date BirthDate, Date HireDate, String Position, String Email, String Password) {
        this.UserID = UserID;
        this.name = name;
        this.title = title;
        this.birthdate = birthdate;
        this.hiredate = hiredate;
        this.position = position;
        this.email = email;
        this.password = password;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = title;
    }

    public Date getBirthDate() {
        return birthdate;
    }

    public void setBirthDate(Date BirthDate) {
        this.birthdate = birthdate;
    }

    public Date getHireDate() {
        return hiredate;
    }

    public void setHireDate(Date HireDate) {
        this.hiredate = hiredate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String Position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = password;
    }
     
    
}
