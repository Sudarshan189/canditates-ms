package com.sf.canditatesms.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoCandidateFound extends RuntimeException {

    Logger logger = LoggerFactory.getLogger(NoCandidateFound.class);
    public NoCandidateFound(String message) {
        super(message);
        logger.warn(message);
    }
}
