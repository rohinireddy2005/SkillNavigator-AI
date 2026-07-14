package com.skillnavigator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillnavigator.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

    List<Skill> findByUserId(Long userId);

}