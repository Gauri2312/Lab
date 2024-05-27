//Q.1) WAP to implement OneToOne mapping between User and Profile 
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Profile;
import com.example.demo.model.User;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class OneToOneLabApplication  implements CommandLineRunner{

	@Autowired
	  private UserRepository userRepository;
		@Autowired
	  private ProfileRepository profileRepository;
		public static void main(String[] args) {
			SpringApplication.run(OneToOneLabApplication.class, args);
		}

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			User user=new User("Gauri");
			Profile profile1=new Profile("social_profile");
			user.setProfile(profile1);
			userRepository.save(user);
	}

}
