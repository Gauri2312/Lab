// Q.2) Wap to implement OneToMany mapping between customer and product Entity
package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class OneToManyLabApplication implements CommandLineRunner{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(OneToManyLabApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer customer=new Customer("Gauri");
		Customer customer1=new Customer("Riya");
		Product lipstick=new Product("Lakme",customer);
		Product bodylotion=new Product("Nivia",customer);
		Product mobile=new Product("Vivo s1", customer1);
		Product laptop=new Product("Lenovo", customer1);
		List<Product> product=Arrays.asList(lipstick,bodylotion);
		List<Product> product1=Arrays.asList(mobile,laptop);
		customer.setProduct(product);
		customer1.setProduct(product1);
		customerRepository.save(customer);
		customerRepository.save(customer1);
		
	}

}
