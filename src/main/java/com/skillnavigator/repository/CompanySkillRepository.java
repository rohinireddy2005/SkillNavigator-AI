package com.skillnavigator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillnavigator.entity.CompanySkill;

public interface CompanySkillRepository extends JpaRepository<CompanySkill,Long>{

    List<CompanySkill> findByCompanyId(Long companyId);

}