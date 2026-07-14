package com.skillnavigator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillnavigator.dto.AnalyzerResponse;
import com.skillnavigator.entity.CompanySkill;
import com.skillnavigator.entity.Skill;
import com.skillnavigator.repository.CompanySkillRepository;
import com.skillnavigator.repository.SkillRepository;

@Service
public class AnalyzerServiceImpl implements AnalyzerService {

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private CompanySkillRepository companySkillRepository;

    @Override
    public AnalyzerResponse analyze(Long userId, Long companyId) {

        List<Skill> studentSkills =
                skillRepository.findByUserId(userId);

        List<CompanySkill> companySkills =
                companySkillRepository.findByCompanyId(companyId);

        List<String> matched = new ArrayList<>();
        List<String> missing = new ArrayList<>();

        for (CompanySkill companySkill : companySkills) {

            boolean found = false;

            for (Skill skill : studentSkills) {

                if (companySkill.getSkillName()
                        .equalsIgnoreCase(skill.getSkillName())) {

                    matched.add(skill.getSkillName());
                    found = true;
                    break;
                }
            }

            if (!found) {
                missing.add(companySkill.getSkillName());
            }

        }

        int score = 0;

        if (!companySkills.isEmpty()) {
            score = (matched.size() * 100) / companySkills.size();
        }

        return new AnalyzerResponse(score, matched, missing);

    }

}