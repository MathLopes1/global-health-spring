package com.global.health.exeception;

public class BadRequestException extends AbstractException {

    public BadRequestException(String descricao) {
        super("BadRequest", descricao);
    }
}