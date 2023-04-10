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

import com.jdbank.entities.Customers;

import com.jdbank.repository.CustomerRepo;



import jakarta.servlet.http.HttpSession;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors/s/policies/customers")
public class CustomerController {
	@Autowired
	private CustomerRepo customer_repo ;
	 @GetMapping("/get")
	  public List<Customers> getAllCustomers(){
 
		 return customer_repo.findAll();
	 }
	 @GetMapping("/get/{id}")
	  public Optional<Customers> getCustomersWithId(@PathVariable Integer id){
		//returning data from jdb datadbase as vendors table
	    return  customer_repo.findById(id);
	  } 
	@PostMapping("/add")
	public Customers inuranceRegister(@RequestBody Customers customers, HttpSession session) {
		System.out.println(customers);
		
		return customer_repo.save(customers);
	}

}
