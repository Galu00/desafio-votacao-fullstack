package com.vagas.desafio_votacao_fullstack.service;

import com.vagas.desafio_votacao_fullstack.entity.SessaoVotacao;
import com.vagas.desafio_votacao_fullstack.repository.SessaoVotacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SessaoVotacaoService {

    @Autowired
    private SessaoVotacaoRepository sessaoVotacaoRepository;

    public SessaoVotacao abrirSessao(Long pautaId, LocalDateTime endTime) {
        SessaoVotacao sessao = new SessaoVotacao();
        sessao.setPautaId(pautaId);
        sessao.setStartTime(LocalDateTime.now());
        sessao.setEndTime(endTime);
        return sessaoVotacaoRepository.save(sessao);
    }

    public List<SessaoVotacao> listarSessoes() {
        return sessaoVotacaoRepository.findAll();
    }
}