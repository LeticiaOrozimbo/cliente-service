package com.fiap.cliente.service.infra.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class PedidoDTO {
    @Id
    private UUID id;
    private UUID clienteId;
    private BigDecimal valorTotal;
    private String status;
}
