package com.jpob.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpob.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
