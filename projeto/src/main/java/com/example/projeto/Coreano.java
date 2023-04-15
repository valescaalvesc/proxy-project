package com.example.projeto;

public class Coreano extends Idioma{

    private static Coreano coreano = new Coreano();

    private Coreano() {};

    public static Coreano getInstancia() {
        return coreano;
    }
}
