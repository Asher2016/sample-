package com.weBank.weBank.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/19/21
 */
@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorsHandler> handleApiException(NotFoundException ex , WebRequest request){
        ErrorsHandler error = new ErrorsHandler(ex.getMessage(), request.getDescription(true));
        return new ResponseEntity<>(error, ex.getStatusCode());
    }
}
