package com.global.health.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.global.health.exeception.BadRequestException;
import com.global.health.exeception.ErrorMessage;
import com.global.health.exeception.NotFoundException;


@ControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(value = BadRequestException.class)
    public ResponseEntity<ErrorMessage> badRequest(BadRequestException ex) {
        return new ResponseEntity<>(new ErrorMessage(HttpStatus.BAD_REQUEST.value(), ex.getErro(), ex.getDescricao()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<ErrorMessage> notFound(NotFoundException ex) {
        return new ResponseEntity<>(new ErrorMessage(HttpStatus.BAD_REQUEST.value(), ex.getErro(), ex.getDescricao()), HttpStatus.NOT_FOUND);
    }
}
