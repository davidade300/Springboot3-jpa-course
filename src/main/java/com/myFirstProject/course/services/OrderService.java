package com.myFirstProject.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myFirstProject.course.entities.Order;
import com.myFirstProject.course.repositories.OrderRepository;

@Component
public class OrderService {

	@Autowired // faz a injeção de dependencia
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
