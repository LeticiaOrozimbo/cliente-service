package com.fiap.cliente.service.exception;

import lombok.Getter;

@Getter
public class CpfExistenteException extends Throwable {

    private final String code = "cpf.cpfJaExiste";
    private final String message = "cpf já existe.";
    private final Integer httpStatus = 422;
}
