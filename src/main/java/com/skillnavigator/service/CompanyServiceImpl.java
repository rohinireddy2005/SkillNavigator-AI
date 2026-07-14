package com.skillnavigator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillnavigator.entity.Company;
import com.skillnavigator.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepository repository;

    @Override
    public Company addCompany(Company company) {

        return repository.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {

        return repository.findAll();
    }

    @Override
    public void deleteCompany(Long id) {

        repository.deleteById(id);
    }

}