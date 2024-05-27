//Q.1) WAP to implement OneToOne mapping between User and Profile 
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProfileDetails")
public class Profile {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String profileName;
public Profile(String pname) {
	super();
	this.profileName = pname;
  }
}