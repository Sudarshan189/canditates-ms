package com.sf.canditatesms.repository;

import com.sf.canditatesms.dao.CandidateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateDao, String> {

}
