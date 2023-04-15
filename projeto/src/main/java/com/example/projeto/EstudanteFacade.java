package com.example.projeto;

public class EstudanteFacade {

    public static boolean verificarPendenciasCertificacao(Estudante estudante) {
        if (Ingles.getInstancia().verificarEstudanteComPendencia(estudante)) {
            return false;
        }
        if (Coreano.getInstancia().verificarEstudanteComPendencia(estudante)) {
            return false;
        }
        if (Frances.getInstancia().verificarEstudanteComPendencia(estudante)) {
            return false;
        }
        return true;
    }
}
