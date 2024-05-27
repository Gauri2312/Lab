//Q.1) WAP to implement OneToOne mapping between User and Profile 
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
