package com.skillnavigator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skillnavigator.entity.Company;
import com.skillnavigator.service.CompanyService;

@RestController
@RequestMapping("/companies")
@CrossOrigin("*")
public class CompanyController {

    @Autowired
    private CompanyService service;

    @PostMapping("/add")
    public Company addCompany(@RequestBody Company company){

        return service.addCompany(company);
    }

    @GetMapping
    public List<Company> getAllCompanies(){

        return service.getAllCompanies();
    }

    @DeleteMapping("/{id}")
    public String deleteCompany(@PathVariable Long id){

        service.deleteCompany(id);

        return "Company Deleted Successfully";
    }

}