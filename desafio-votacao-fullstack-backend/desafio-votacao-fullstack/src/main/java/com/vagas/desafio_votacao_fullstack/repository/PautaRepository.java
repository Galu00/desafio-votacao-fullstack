package com.vagas.desafio_votacao_fullstack.repository;

import com.vagas.desafio_votacao_fullstack.entity.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PautaRepository extends JpaRepository<Pauta, Long> {
}