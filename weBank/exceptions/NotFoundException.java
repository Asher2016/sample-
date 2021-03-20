package com.weBank.weBank.exceptions;

import org.springframework.http.HttpStatus;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/19/21
 */
public class NotFoundException extends RuntimeException{

    public NotFoundException(String message){
        super(message);
    }

    public HttpStatus getStatusCode(){
     return HttpStatus.NOT_FOUND;
    }
}
