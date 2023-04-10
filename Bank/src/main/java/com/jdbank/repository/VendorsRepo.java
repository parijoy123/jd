package com.jdbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbank.entities.Vendors;

public interface VendorsRepo extends JpaRepository<Vendors, Integer> {

}
