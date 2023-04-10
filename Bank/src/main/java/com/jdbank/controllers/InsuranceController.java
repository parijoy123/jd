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


import com.jdbank.entities.Insurance;

import com.jdbank.repository.InsuranceRepo;

import jakarta.servlet.http.HttpSession;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors/insurances")
public class InsuranceController {
	@Autowired
	private InsuranceRepo insurance_repo ;
	 @GetMapping("/get")
	  public List<Insurance> getAllInsurances(){
//		 List<Vendors> vendorsList = new ArrayList<Vendors>();
//		 personList.add(new Person(1,"Mickey Mouse", 30));
	//	 vendorsList.add(new Vendors(500,"Lic"));
		 return insurance_repo.findAll();
	 }
	 @GetMapping("/get/{id}")
	  public Optional<Insurance> getInsuranceWithId(@PathVariable Integer id){
		//returning data from jdb datadbase as vendors table
	    return  insurance_repo.findById(id);
	  } 
	
		
		
	@PostMapping("/add")
	public Insurance inuranceRegister(@RequestBody Insurance insurance, HttpSession session) {
		System.out.println(insurance);
		
		return insurance_repo.save(insurance);
	}
	
	
}
