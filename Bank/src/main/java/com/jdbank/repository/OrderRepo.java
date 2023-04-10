package com.jdbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbank.entities.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

}
