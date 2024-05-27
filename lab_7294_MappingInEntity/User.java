//Q.1) WAP to implement OneToOne mapping between User and Profile 
package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Userdetails")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String uName;
public User(String uName) {
	super();
	this.uName = uName;
}
@OneToOne(cascade = CascadeType.ALL)
private Profile profile;
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public Profile getProfile() {
	return profile;
}
public void setProfile(Profile profile) {
	this.profile = profile;
   }
}