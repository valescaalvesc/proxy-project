package com.example.projeto;

import java.util.ArrayList;
import java.util.List;

public abstract class Idioma {

    private List<Estudante> estudanteComPendencia = new ArrayList<Estudante>();

    public void addEstudantePendente(Estudante estudante) {
        this.estudanteComPendencia.add(estudante);
    }

    public boolean verificarEstudanteComPendencia(Estudante estudante) {
        return this.estudanteComPendencia.contains(estudante);
    }
}
