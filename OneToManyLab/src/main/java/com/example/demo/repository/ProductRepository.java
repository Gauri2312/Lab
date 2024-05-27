// Q.2) Wap to implement OneToMany mapping between customer and product Entity
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
