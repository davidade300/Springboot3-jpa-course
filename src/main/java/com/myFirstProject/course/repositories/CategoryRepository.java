package com.myFirstProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myFirstProject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
