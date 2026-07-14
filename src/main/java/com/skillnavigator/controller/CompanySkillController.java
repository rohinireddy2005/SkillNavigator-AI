package com.skillnavigator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skillnavigator.entity.CompanySkill;
import com.skillnavigator.service.CompanySkillService;

@RestController
@RequestMapping("/companyskills")
@CrossOrigin("*")
public class CompanySkillController {

    @Autowired
    private CompanySkillService service;

    @PostMapping("/add")
    public CompanySkill addSkill(@RequestBody CompanySkill skill){

        return service.addSkill(skill);
    }

    @GetMapping("/{companyId}")
    public List<CompanySkill> getSkills(@PathVariable Long companyId){

        return service.getSkills(companyId);
    }

}