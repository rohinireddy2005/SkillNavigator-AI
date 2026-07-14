package com.skillnavigator.service;

import java.util.List;

import com.skillnavigator.entity.Company;

public interface CompanyService {

    Company addCompany(Company company);

    List<Company> getAllCompanies();

    void deleteCompany(Long id);

}