package com.skillnavigator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skillnavigator.entity.Skill;
import com.skillnavigator.service.SkillService;

@RestController
@RequestMapping("/skills")
@CrossOrigin("*")
public class SkillController {

    @Autowired
    private SkillService service;

    @PostMapping("/add")
    public Skill addSkill(@RequestBody Skill skill) {
        return service.addSkill(skill);
    }

    @GetMapping("/{userId}")
    public List<Skill> getSkills(@PathVariable Long userId) {
        return service.getSkills(userId);
    }

    @DeleteMapping("/{id}")
    public String deleteSkill(@PathVariable Long id) {
        service.deleteSkill(id);
        return "Skill Deleted Successfully";
    }
}