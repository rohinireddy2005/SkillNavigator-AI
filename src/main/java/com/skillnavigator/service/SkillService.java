package com.skillnavigator.service;

import java.util.List;

import com.skillnavigator.entity.Skill;

public interface SkillService {

    Skill addSkill(Skill skill);

    List<Skill> getSkills(Long userId);

    void deleteSkill(Long id);

}