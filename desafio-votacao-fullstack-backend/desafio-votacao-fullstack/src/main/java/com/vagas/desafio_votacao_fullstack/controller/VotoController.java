package com.vagas.desafio_votacao_fullstack.controller;

import com.vagas.desafio_votacao_fullstack.dto.VotoRequest;
import com.vagas.desafio_votacao_fullstack.entity.Voto;
import com.vagas.desafio_votacao_fullstack.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/votos")
public class VotoController {

    @Autowired
    private VotoService votoService;

    @PostMapping
    public Voto votar(@RequestBody VotoRequest votoRequest) {
        return votoService.votar(votoRequest.getPautaId(), votoRequest.getAssociadoId(), votoRequest.getVoto());
    }

    @GetMapping
    public List<Voto> listarVotos() {
        return votoService.listarVotos();
    }

    @GetMapping("/resultados/{pautaId}")
    public String contarVotos(@PathVariable Long pautaId) {
        long votosSim = votoService.contarVotosSim(pautaId);
        long votosNao = votoService.contarVotosNao(pautaId);
        return String.format("Sim: %d, Não: %d", votosSim, votosNao);
    }
}