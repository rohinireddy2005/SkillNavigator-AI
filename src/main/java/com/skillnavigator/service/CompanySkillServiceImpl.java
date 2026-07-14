package com.skillnavigator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillnavigator.entity.CompanySkill;
import com.skillnavigator.repository.CompanySkillRepository;

@Service
public class CompanySkillServiceImpl implements CompanySkillService{

    @Autowired
    private CompanySkillRepository repository;

    @Override
    public CompanySkill addSkill(CompanySkill skill) {

        return repository.save(skill);
    }

    @Override
    public List<CompanySkill> getSkills(Long companyId) {

        return repository.findByCompanyId(companyId);
    }

}