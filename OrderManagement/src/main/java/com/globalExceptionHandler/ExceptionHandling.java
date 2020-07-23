package com.globalExceptionHandler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandling extends ResponseEntityExceptionHandler{
	 @ExceptionHandler(RecordNotFoundException.class)
	    public final ResponseEntity<ErrorResponse> handleUserNotFoundException(RecordNotFoundException ex,
	                                                WebRequest request) {
	        List<String> details = new ArrayList<>();
	        details.add(ex.getLocalizedMessage());
	        ErrorResponse error = new ErrorResponse("RECORD_NOT_FOUND", details);
	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	    }
}


