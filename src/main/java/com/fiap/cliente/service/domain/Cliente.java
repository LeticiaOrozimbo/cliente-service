package com.fiap.cliente.service.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Cliente {

    private UUID id;
    private String name;
    private String cpf;
    private LocalDate dataDeNascimento;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Endereco> enderecos;
}
