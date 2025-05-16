package com.fiap.cliente.service.infra;


import com.fiap.cliente.service.infra.model.PedidoDTO;

import java.util.List;
import java.util.UUID;

public interface PedidoPort {
    List<PedidoDTO> buscarPedidosPorCliente(UUID clienteId);
}
