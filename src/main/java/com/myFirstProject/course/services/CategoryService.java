package com.myFirstProject.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myFirstProject.course.entities.Category;
import com.myFirstProject.course.repositories.CategoryRepository;

@Component
public class CategoryService {

	@Autowired // faz a injeção de dependencia
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
