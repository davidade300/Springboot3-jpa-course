package com.myFirstProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myFirstProject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
