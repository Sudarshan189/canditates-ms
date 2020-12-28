package com.sf.canditatesms.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Candidate {
    @JsonProperty("candidate_id")
    private String candidateId;
    @JsonProperty("candidate_name")
    private String candidateName;
    @JsonProperty("candidate_rank")
    private Integer candidateRank;
    // Single choice of course
    @JsonProperty("choice_of_course")
    private String choiceofCourse;

    public Candidate() {
        // default constructor
        // rank -1 refers to absent for exam
        this.candidateRank = -1;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public Integer getCandidateRank() {
        return candidateRank;
    }

    public void setCandidateRank(Integer candidateRank) {
        this.candidateRank = candidateRank;
    }

    public String getChoiceofCourse() {
        return choiceofCourse;
    }

    public void setChoiceofCourse(String choiceofCourse) {
        this.choiceofCourse = choiceofCourse;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", candidateRank=" + candidateRank +
                ", choiceofCourse='" + choiceofCourse + '\'' +
                '}';
    }
}
