package com.fiap.cliente.service.gateway;

import com.fiap.cliente.service.domain.Cliente;

import java.util.Optional;

public interface ClienteGateway {

    Optional<Cliente> obterPorCpf(String cpf);

    Long criar(Cliente cliente);

}
