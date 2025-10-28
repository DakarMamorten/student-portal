package com.student.portal.controller;

import com.student.portal.exception.GenericErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
@ControllerAdvice
public class ApiControllerAdvice {
    @ExceptionHandler(value = Exception.class)
    public GenericErrorResponse globalExceptionHandler(Exception ex, HttpServletRequest request) {
    return GenericErrorResponse.of(HttpStatus.BAD_REQUEST,HttpStatus.BAD_REQUEST.name(),ex.getMessage(),request.getRequestURI());
    }
}
