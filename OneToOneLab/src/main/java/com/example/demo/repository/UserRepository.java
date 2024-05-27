//Q.1) WAP to implement OneToOne mapping between User and Profile 
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
