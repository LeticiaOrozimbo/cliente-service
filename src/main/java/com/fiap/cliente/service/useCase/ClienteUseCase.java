package com.fiap.cliente.service.useCase;

import com.fiap.cliente.service.domain.Cliente;
import com.fiap.cliente.service.exception.CpfExistenteException;
import com.fiap.cliente.service.gateway.ClienteGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClienteUseCase {

    private final ClienteGateway clienteGateway;

    public Long criar(Cliente cliente) throws CpfExistenteException {

        Optional<Cliente> cpfCliente = clienteGateway.obterPorCpf(cliente.getCpf());
        if (cpfCliente.isPresent()) {
            log.warn("Usuário ja existe com cpf informado. {}", cliente.getCpf());
            throw new CpfExistenteException();
        }
        return clienteGateway.criar(cliente);
    }
}
