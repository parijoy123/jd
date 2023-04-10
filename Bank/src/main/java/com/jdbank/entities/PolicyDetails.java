package com.jdbank.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="policy_details")
public class PolicyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String policy_name;
	private String tenure;
	private String premium;
	
	@ManyToOne
	@JoinColumn(name="insurance_id")
	private Insurance insurance;
	
	
	
	
	@OneToOne(mappedBy = "policy_details")
	private Orders orders;
	
	public PolicyDetails() {
	
	}
	
	public PolicyDetails(int id, String policy_name, String tenure, String premium) {
		this.id = id;
		this.policy_name = policy_name;
		this.tenure = tenure;
		this.premium = premium;
	
	}

	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	
	@Override
	public String toString() {
		return "PolicyDetails [id=" + id + ", policy_name=" + policy_name + ", tenure=" + tenure
				+ ", premium=" + premium + "]";
	}
}
