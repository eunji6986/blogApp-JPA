package com.example.blog.handler;


import com.example.blog.dto.RespDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public RespDto<String> HandlerArgumentException(Exception e){
        return new RespDto<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
    }

}
