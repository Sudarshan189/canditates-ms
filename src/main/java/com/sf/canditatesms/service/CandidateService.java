package com.sf.canditatesms.service;

import com.sf.canditatesms.model.Candidate;

public interface CandidateService {

    Candidate addNewCandidate(Candidate candidate);

    Candidate getCandidateById(String candidateId);
}
