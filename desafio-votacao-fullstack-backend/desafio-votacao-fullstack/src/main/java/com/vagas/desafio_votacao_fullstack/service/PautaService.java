package com.vagas.desafio_votacao_fullstack.service;

import com.vagas.desafio_votacao_fullstack.entity.Pauta;
import com.vagas.desafio_votacao_fullstack.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PautaService {

    @Autowired
    private PautaRepository pautaRepository;

    public Pauta criarPauta(String descricao) {
        Pauta pauta = new Pauta();
        pauta.setDescricao(descricao);
        pauta.setCreationDate(LocalDateTime.now());
        return pautaRepository.save(pauta);
    }

    public List<Pauta> listarPautas() {
        return pautaRepository.findAll();
    }
}