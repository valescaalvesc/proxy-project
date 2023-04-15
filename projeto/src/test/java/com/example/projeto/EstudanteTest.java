package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstudanteTest {

    @Test
    void deveRetornarPendenciaInglesCertificacao() {
        Estudante estudante = new Estudante();
        Ingles.getInstancia().addEstudantePendente(estudante);

        assertEquals(false, estudante.certificar());
    }

    @Test
    void deveRetornarPendenciaCoreanoCertificacao() {
        Estudante estudante = new Estudante();
        Coreano.getInstancia().addEstudantePendente(estudante);

        assertEquals(false, estudante.certificar());
    }

    @Test
    void deveRetornarPendenciaFrancesCertificacao() {
        Estudante estudante = new Estudante();
        Frances.getInstancia().addEstudantePendente(estudante);

        assertEquals(false, estudante.certificar());
    }

    @Test
    void deveRetornarAlunoSemPendenciaParaCertificacao() {
        Estudante estudante = new Estudante();

        assertEquals(true, estudante.certificar());
    }

}
