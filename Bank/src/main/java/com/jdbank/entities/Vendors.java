package com.jdbank.entities;




import java.util.List;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name="vendors")
public class Vendors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendor_id;
	
	private String name;
	
	
	
	@OneToMany( mappedBy = "vendors")
	private List<Insurance> insurance;
	
	
	
//	@OneToMany(mappedBy = "vendors")
//	private List<BajajInsurance> bajaj_insurance;
//	
//	@OneToMany(mappedBy = "vendors")
//	private List<LicInsurance> lic_insurance;
//	
//	@OneToMany(mappedBy = "vendors")
//	private List<TataAiaInsurance> tata_aia_insurance;
	
	public Vendors() {
		
	}
	public Vendors(int vendor_id, String name) {
		// TODO Auto-generated constructor stub
		this.vendor_id=vendor_id;
		this.name=name;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vendors [vendor_id=" + vendor_id + ", name=" + name + "]";
	}
	
}
