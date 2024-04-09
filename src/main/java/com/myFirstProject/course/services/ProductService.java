package com.myFirstProject.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myFirstProject.course.entities.Product;
import com.myFirstProject.course.repositories.ProductRepository;

@Component
public class ProductService {

	@Autowired // faz a injeção de dependencia
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
