package com.skillnavigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillnavigator.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Long>{

}