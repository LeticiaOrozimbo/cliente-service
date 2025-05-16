package com.fiap.cliente.service.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
public class ClienteDTO {
    private UUID id;
    private String name;
    private String cpf;
    private LocalDate dataDeNascimento;
    private List<EnderecoDTO> enderecos;
}
