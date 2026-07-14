package com.skillnavigator.dto;

public class DashboardResponse {

    private String studentName;
    private int readinessScore;
    private int totalSkills;
    private int missingSkills;

    public DashboardResponse() {
    }

    public DashboardResponse(String studentName, int readinessScore,
            int totalSkills, int missingSkills) {
        this.studentName = studentName;
        this.readinessScore = readinessScore;
        this.totalSkills = totalSkills;
        this.missingSkills = missingSkills;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getReadinessScore() {
        return readinessScore;
    }

    public void setReadinessScore(int readinessScore) {
        this.readinessScore = readinessScore;
    }

    public int getTotalSkills() {
        return totalSkills;
    }

    public void setTotalSkills(int totalSkills) {
        this.totalSkills = totalSkills;
    }

    public int getMissingSkills() {
        return missingSkills;
    }

    public void setMissingSkills(int missingSkills) {
        this.missingSkills = missingSkills;
    }

}