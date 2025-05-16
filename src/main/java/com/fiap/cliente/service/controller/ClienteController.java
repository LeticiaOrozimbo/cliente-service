package com.fiap.cliente.service.controller;

import com.fiap.cliente.service.domain.Cliente;
import com.fiap.cliente.service.exception.CpfExistenteException;
import com.fiap.cliente.service.model.ClienteDTO;
import com.fiap.cliente.service.useCase.ClienteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private ClienteUseCase clienteUseCase;

    @PostMapping
    public Long criar(@RequestBody ClienteDTO clienteDTO) throws CpfExistenteException {
        return clienteUseCase.criar(mapToDomain(clienteDTO));
    }

    private Cliente mapToDomain(ClienteDTO clienteDTO) {
        return new Cliente(
                clienteDTO.getId(),
                clienteDTO.getName(),
                clienteDTO.getCpf(),
                clienteDTO.getDataDeNascimento(),
                clienteDTO.getEndereco()
        );
    }
}
