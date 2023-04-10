package com.jdbank.entities;



import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name="Insurance")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	//many insurances can have one venndor
	
	@ManyToOne
	@JoinColumn( name="vendor_id")
	private Vendors vendors;
	
	//One insurance have many policies

	@OneToMany( 
 mappedBy = "insurance")
	private List<PolicyDetails> policy_details;
	

public List<PolicyDetails> getPolicy_details() {
		return policy_details;
	}

	public void setPolicy_details(List<PolicyDetails> policy_details) {
		this.policy_details = policy_details;
	}

public Vendors getVendors() {
		return vendors;
	}

	public void setVendors(Vendors vendors) {
		this.vendors = vendors;
	}

public Insurance() {
		
	}

	
	public Insurance(int id, String name, Vendors vendors, List<PolicyDetails> policy_details) {
	super();
	this.id = id;
	this.name = name;
	this.vendors = vendors;
	this.policy_details = policy_details;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
