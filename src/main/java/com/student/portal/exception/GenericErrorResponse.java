package com.student.portal.exception;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public record GenericErrorResponse(
        HttpStatus status,
        String code,
        String message,
        String path,
        String requestId,
        Map<String,Object> details,
        List<FieldViolation> violations,
        LocalDateTime timestamp

) {
   public static GenericErrorResponse of(HttpStatus status,
                                         String code,
                                         String message,
                                         String path){
       return new GenericErrorResponse(status,code,message,path,null,null,null,LocalDateTime.now());
   }
}
