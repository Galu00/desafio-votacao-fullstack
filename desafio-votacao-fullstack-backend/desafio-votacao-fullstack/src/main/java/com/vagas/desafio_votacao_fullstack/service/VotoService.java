package com.vagas.desafio_votacao_fullstack.service;

import com.vagas.desafio_votacao_fullstack.entity.Voto;
import com.vagas.desafio_votacao_fullstack.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotoService {

    @Autowired
    private VotoRepository votoRepository;

    public Voto votar(Long pautaId, Long associadoId, Boolean voto) {
        Voto novoVoto = new Voto();
        novoVoto.setPautaId(pautaId);
        novoVoto.setAssociadoId(associadoId);
        novoVoto.setVoto(voto);
        return votoRepository.save(novoVoto);
    }

    public List<Voto> listarVotos() {
        return votoRepository.findAll();
    }

    public long contarVotosSim(Long pautaId) {
        return votoRepository.findAll().stream()
                .filter(v -> v.getPautaId().equals(pautaId) && v.getVoto())
                .count();
    }

    public long contarVotosNao(Long pautaId) {
        return votoRepository.findAll().stream()
                .filter(v -> v.getPautaId().equals(pautaId) && !v.getVoto())
                .count();
    }
}