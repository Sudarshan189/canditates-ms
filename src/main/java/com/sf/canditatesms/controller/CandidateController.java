package com.sf.canditatesms.controller;


import com.sf.canditatesms.model.Candidate;
import com.sf.canditatesms.service.CandidateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    private Logger logger = LoggerFactory.getLogger(CandidateController.class);
    
    @Autowired
    private CandidateService candidateService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Candidate> addNewCandidateDetails(@RequestBody  Candidate candidate) {
        logger.info(candidate.toString());
        if (candidate != null) {
            Candidate savedCandidate = candidateService.addNewCandidate(candidate);
            return new ResponseEntity<>(savedCandidate, HttpStatus.CREATED);
        } else {
            logger.error("Candidate details are null to load");
            throw new RuntimeException("Candidate details are null");
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Candidate> getCandidateById(@PathVariable("id") String candidateId) {
        if (candidateId != null) {
            Candidate candidate = candidateService.getCandidateById(candidateId);
            return new ResponseEntity<>(candidate, HttpStatus.OK);
        } else {
            logger.error("Id field is passed null");
            throw new RuntimeException("id field passed was null. Please make sure to add id field");
        }
    }
}
