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


import com.jdbank.entities.Vendors;
import com.jdbank.repository.VendorsRepo;

import jakarta.servlet.http.HttpSession;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors")
public class VendorsController {
	@Autowired
	private VendorsRepo vs_repo;
	
	 @GetMapping("/get")
	  public List<Vendors> getAllVendors(){
//		 List<Vendors> vendorsList = new ArrayList<Vendors>();
//		 personList.add(new Person(1,"Mickey Mouse", 30));
	//	 vendorsList.add(new Vendors(500,"Lic"));
		 return vs_repo.findAll();
	 }
	 @GetMapping("/get/{vendor_id}")
	  public Optional<Vendors> getVendorsWithId(@PathVariable Integer vendor_id){
	    //returning data from jdb datadbase as vendors table
	    return  vs_repo.findById(vendor_id);
	  } 
	@PostMapping("/add")
	public Vendors vendorsRegister(@RequestBody Vendors vendors, HttpSession session) {
		System.out.println(vendors);
		System.out.println("Not found vendors");
		return vs_repo.save(vendors);
	}

}
