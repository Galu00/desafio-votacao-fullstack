package com.vagas.desafio_votacao_fullstack.repository;

import com.vagas.desafio_votacao_fullstack.entity.SessaoVotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoVotacaoRepository extends JpaRepository<SessaoVotacao, Long> {
}