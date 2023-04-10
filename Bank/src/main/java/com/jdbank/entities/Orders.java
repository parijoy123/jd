package com.jdbank.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String start_date;
	private String end_date;
	
	@OneToOne
	@JoinColumn(name="customer_id")
	private Customers customers;
	
	@OneToOne
	@JoinColumn(name="policy_id")
	private PolicyDetails policy_details;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(int id, String start_date, String end_date) {
		super();
		this.id = id;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
}
