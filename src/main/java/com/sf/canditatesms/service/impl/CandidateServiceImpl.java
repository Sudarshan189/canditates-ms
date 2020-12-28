package com.sf.canditatesms.service.impl;

import com.sf.canditatesms.dao.CandidateDao;
import com.sf.canditatesms.exception.AppException;
import com.sf.canditatesms.exception.NoCandidateFound;
import com.sf.canditatesms.model.Candidate;
import com.sf.canditatesms.repository.CandidateRepository;
import com.sf.canditatesms.service.CandidateService;
import com.sf.canditatesms.utils.CandidatetoDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Primary
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public Candidate addNewCandidate(Candidate candidate) {
        try {
            CandidateDao savedCandidate = candidateRepository.save(CandidatetoDaoMapper.candidateToDao(candidate));
            if (savedCandidate != null) {
                return CandidatetoDaoMapper.DaoToCandidate(savedCandidate);
            } else {
                throw new RuntimeException("Candidate details not saved");
            }
        } catch (Exception e) {
            AppException appException = new AppException("Something went wrong while saving the data");
            appException.initCause(e);
            throw appException;
        }
    }

    @Override
    public Candidate getCandidateById(String candidateId) {
        Optional<CandidateDao> optionalCandidate = candidateRepository.findById(candidateId);
        if (optionalCandidate.isPresent()) {
            return CandidatetoDaoMapper.DaoToCandidate(optionalCandidate.get());
        } else {
            throw new NoCandidateFound("No Candidate found with id "+candidateId);
        }
    }
}
