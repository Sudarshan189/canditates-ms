package com.sf.canditatesms.utils;

import com.sf.canditatesms.dao.CandidateDao;
import com.sf.canditatesms.model.Candidate;

public class CandidatetoDaoMapper {

    public static CandidateDao candidateToDao(Candidate candidate) {
        CandidateDao candidateDao = new CandidateDao();
        candidateDao.setCandidateId(candidate.getCandidateId());
        candidateDao.setCandidateName(candidate.getCandidateName());
        candidateDao.setCandidateRank(candidate.getCandidateRank());
        candidateDao.setChoiceOfCourse(candidate.getChoiceofCourse());
        return candidateDao;
    }

    public static Candidate DaoToCandidate(CandidateDao candidateDao) {
        Candidate candidate = new Candidate();
        candidate.setCandidateId(candidateDao.getCandidateId());
        candidate.setCandidateName(candidateDao.getCandidateName());
        candidate.setCandidateRank(candidateDao.getCandidateRank());
        candidate.setChoiceofCourse(candidateDao.getChoiceOfCourse());
        return candidate;
    }
}
