package com.jdbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbank.entities.Insurance;

public interface InsuranceRepo extends JpaRepository<Insurance, Integer> {

}
