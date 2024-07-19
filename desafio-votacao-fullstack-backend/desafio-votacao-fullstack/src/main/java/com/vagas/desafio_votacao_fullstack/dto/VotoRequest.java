package com.vagas.desafio_votacao_fullstack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VotoRequest {
    private Long pautaId;
    private Long associadoId;
    private Boolean voto;
}
