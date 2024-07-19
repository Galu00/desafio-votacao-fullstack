package com.vagas.desafio_votacao_fullstack.controller;

import com.vagas.desafio_votacao_fullstack.entity.Pauta;
import com.vagas.desafio_votacao_fullstack.service.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pautas")
public class PautaController {

    @Autowired
    private PautaService pautaService;

    @PostMapping
    public Pauta criarPauta(@RequestBody String descricao) {
        return pautaService.criarPauta(descricao);
    }

    @GetMapping
    public List<Pauta> listarPautas() {
        return pautaService.listarPautas();
    }
}