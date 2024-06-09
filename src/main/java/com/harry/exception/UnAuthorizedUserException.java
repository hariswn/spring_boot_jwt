package com.harry.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnAuthorizedUserException extends RuntimeException {

    public UnAuthorizedUserException(String message) {
        super(message);
    }

    public UnAuthorizedUserException(String message, Exception e) {
        super(message, e);
    }
}
