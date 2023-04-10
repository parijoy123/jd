package com.jdbank.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jdbank.entities.Orders;

import com.jdbank.repository.OrderRepo;

import jakarta.servlet.http.HttpSession;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors/s/policies/customers/orders")
public class OrdersController {
	@Autowired
	private OrderRepo order_repo ;
	 @GetMapping("/get")
	  public List<Orders> getAllOrders(){
 
		 return order_repo.findAll();
	 }
	 @GetMapping("/get/{id}")
	  public Optional<Orders> getOrdersWithId(@PathVariable Integer id){
		//returning data from jdb datadbase as vendors table
	    return  order_repo.findById(id);
	  } 
	@PostMapping("/add")
	public Orders inuranceRegister(@RequestBody Orders orders, HttpSession session) {
		System.out.println(orders);
		
		return order_repo.save(orders);
	}
}
