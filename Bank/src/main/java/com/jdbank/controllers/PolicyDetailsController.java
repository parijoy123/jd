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

import com.jdbank.entities.PolicyDetails;
import com.jdbank.repository.PolicyDetailsRepo;

import jakarta.servlet.http.HttpSession;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors/insurances/policies")
public class PolicyDetailsController {

	@Autowired
	private PolicyDetailsRepo policy_details_repo ;
	 @GetMapping("/get")
	  public List<PolicyDetails> getAllLicInsurances(){

		 return policy_details_repo.findAll();
	 }
	 @GetMapping("/get/{policy_id}")
	  public Optional<PolicyDetails> getVendorsWithId(@PathVariable Integer policy_id){
		//returning data from jdb datadbase as vendors table
	    return  policy_details_repo.findById(policy_id);
	  } 
	@PostMapping("/add")
	public PolicyDetails polcyRegister(@RequestBody PolicyDetails policy_details, HttpSession session) {
		System.out.println(policy_details);
		System.out.println("Not found vendors");
		return policy_details_repo.save(policy_details);
	}
}
