package com.vagas.desafio_votacao_fullstack.service;

import com.vagas.desafio_votacao_fullstack.entity.Voto;
import com.vagas.desafio_votacao_fullstack.repository.VotoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class VotoServiceTest {

    @Mock
    private VotoRepository votoRepository;

    @InjectMocks
    private VotoService votoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListarVotos() {
        Voto voto = new Voto(null, 1L, 1L, true);
        when(votoRepository.findAll()).thenReturn(Collections.singletonList(voto));
        List<Voto> result = votoService.listarVotos();
        assertEquals(1, result.size());
    }
}
