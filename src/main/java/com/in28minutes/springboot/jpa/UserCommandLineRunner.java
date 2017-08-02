package com.in28minutes.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... arg0) throws Exception {
		/*System.out.println("CLI..Running");
		repository.save(new User("Renga", "Admin"));
		repository.save(new User("Vaish", "Admin"));
		repository.save(new User("Sri", "User"));
		
		for(User user : repository.findAll()){
			System.out.println(user);
		}*/
		System.out.println(".......Find by roles.......");
		for(User user : repository.findByRole("User")){
			System.out.println(user);
		}
	}

}
