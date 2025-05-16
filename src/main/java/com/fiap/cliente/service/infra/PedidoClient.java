package com.fiap.cliente.service.infra;

import com.fiap.cliente.service.infra.model.PedidoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

@Component
public class PedidoClient implements PedidoPort{

    private final WebClient pedidoWebClient;

    public PedidoClient(@Value("${services.pedido.url}") String baseUrl) {
        this.pedidoWebClient = WebClient.builder()
                .baseUrl(baseUrl)
                .build();

    }

    @Override
    public List<PedidoDTO> buscarPedidosPorCliente(UUID clienteId) {
        return pedidoWebClient.get()
                .uri("/pedidos/cliente/{id}", clienteId)
                .retrieve()
                .bodyToFlux(PedidoDTO.class)
                .collectList()
                .block();
    }
}
