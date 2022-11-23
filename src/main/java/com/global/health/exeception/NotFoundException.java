package com.global.health.exeception;

public class NotFoundException extends AbstractException {

    public NotFoundException(String descricao) {
        super("NotFound", descricao);
    }
}
