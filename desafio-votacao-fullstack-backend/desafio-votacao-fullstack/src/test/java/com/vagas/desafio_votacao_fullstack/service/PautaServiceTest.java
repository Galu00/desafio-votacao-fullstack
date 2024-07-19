package com.vagas.desafio_votacao_fullstack.service;

import com.vagas.desafio_votacao_fullstack.entity.Pauta;
import com.vagas.desafio_votacao_fullstack.repository.PautaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class PautaServiceTest {

    @Mock
    private PautaRepository pautaRepository;

    @InjectMocks
    private PautaService pautaService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCriarPauta() {
        Pauta pauta = new Pauta(null,"Pauta Teste",null);
        when(pautaRepository.save(pauta)).thenReturn(pauta);
        Pauta result = pautaService.criarPauta("Pauta Teste");
        assertNotNull(result);
    }
}
