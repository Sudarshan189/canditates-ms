package com.sf.canditatesms.dao;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "candidate_table")
public class CandidateDao {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "candidate_id", nullable = false, unique = true, updatable = false)
    private String candidateId;
    @Column(name = "candidate_name", nullable = false, length = 50)
    private String candidateName;
    @Column(name = "candidate_rank")
    private Integer candidateRank;
    @Column(name = "choice_of_course")
    private String choiceOfCourse;

    public CandidateDao() {

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

    public String getChoiceOfCourse() {
        return choiceOfCourse;
    }

    public void setChoiceOfCourse(String choiceOfCourse) {
        this.choiceOfCourse = choiceOfCourse;
    }

    @Override
    public String toString() {
        return "CandidateDao{" +
                "candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", candidateRank=" + candidateRank +
                ", choiceOfCourse='" + choiceOfCourse + '\'' +
                '}';
    }
}
