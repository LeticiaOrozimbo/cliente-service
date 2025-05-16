package com.fiap.cliente.service.model;

import lombok.Data;

@Data
public class EnderecoDTO {

    private String rua;
    private String numero;
    private String cep;
    private ClienteDTO cliente;
}
