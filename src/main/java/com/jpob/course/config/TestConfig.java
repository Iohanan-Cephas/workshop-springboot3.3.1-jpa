package com.jpob.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jpob.course.entities.User;
import com.jpob.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria", "maria@gmail.com", "984632315", "12345678");
		User u2 = new User(null, "Joao", "joao@gmail.com", "992787562", "87654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
}
