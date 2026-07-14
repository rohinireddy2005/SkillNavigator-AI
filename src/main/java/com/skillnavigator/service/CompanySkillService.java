package com.skillnavigator.service;

import java.util.List;
import com.skillnavigator.entity.CompanySkill;

public interface CompanySkillService {
    CompanySkill addSkill(CompanySkill skill);
    List<CompanySkill> getSkills(Long companyId);
}