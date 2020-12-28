package com.sf.canditatesms.controller;

import com.sf.canditatesms.exception.AppException;
import com.sf.canditatesms.exception.NoCandidateFound;
import com.sf.canditatesms.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NoCandidateFound.class)
    public ResponseEntity<Error> catchNoCandidateFoundException(NoCandidateFound appException) {
        Error error = new Error();
        error.setErrorMessage(appException.getMessage());
        error.setDateTime(LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AppException.class)
    public ResponseEntity<Error> catchAppException(AppException appException) {
        Error error = new Error();
        error.setErrorMessage(appException.getMessage());
        error.setDateTime(LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
