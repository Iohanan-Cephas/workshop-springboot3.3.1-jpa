package com.jpob.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpob.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
