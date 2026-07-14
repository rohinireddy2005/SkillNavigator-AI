package com.skillnavigator.dto;

import java.util.List;

public class AnalyzerResponse {

    private int readinessScore;

    private List<String> matchedSkills;

    private List<String> missingSkills;

    public AnalyzerResponse() {
    }

    public AnalyzerResponse(int readinessScore,
                            List<String> matchedSkills,
                            List<String> missingSkills) {
        this.readinessScore = readinessScore;
        this.matchedSkills = matchedSkills;
        this.missingSkills = missingSkills;
    }

    public int getReadinessScore() {
        return readinessScore;
    }

    public void setReadinessScore(int readinessScore) {
        this.readinessScore = readinessScore;
    }

    public List<String> getMatchedSkills() {
        return matchedSkills;
    }

    public void setMatchedSkills(List<String> matchedSkills) {
        this.matchedSkills = matchedSkills;
    }

    public List<String> getMissingSkills() {
        return missingSkills;
    }

    public void setMissingSkills(List<String> missingSkills) {
        this.missingSkills = missingSkills;
    }
}