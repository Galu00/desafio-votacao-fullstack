package com.vagas.desafio_votacao_fullstack.controller;

import com.vagas.desafio_votacao_fullstack.entity.SessaoVotacao;
import com.vagas.desafio_votacao_fullstack.service.SessaoVotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/sessoes")
public class SessaoVotacaoController {

    @Autowired
    private SessaoVotacaoService sessaoVotacaoService;

    @PostMapping("/{pautaId}")
    public SessaoVotacao abrirSessao(@PathVariable Long pautaId, @RequestParam(required = false) LocalDateTime endTime) {
        if (endTime == null) {
            endTime = LocalDateTime.now().plusMinutes(10);
        }
        return sessaoVotacaoService.abrirSessao(pautaId, endTime);
    }

    @GetMapping
    public List<SessaoVotacao> listarSessoes() {
        return sessaoVotacaoService.listarSessoes();
    }
}