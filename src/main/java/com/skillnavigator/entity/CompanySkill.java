package com.skillnavigator.entity;

import jakarta.persistence.*;

@Entity
@Table(name="company_skills")
public class CompanySkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long companyId;

    private String skillName;

    public CompanySkill() {
    }

    public CompanySkill(Long companyId, String skillName) {
        this.companyId = companyId;
        this.skillName = skillName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId=companyId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName=skillName;
    }

}