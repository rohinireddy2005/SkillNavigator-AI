package com.skillnavigator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillnavigator.entity.Skill;
import com.skillnavigator.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository repository;

    @Override
    public Skill addSkill(Skill skill) {
        return repository.save(skill);
    }

    @Override
    public List<Skill> getSkills(Long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public void deleteSkill(Long id) {
        repository.deleteById(id);
    }

}