package com.example.projeto;

public class Frances extends Idioma{

    private static Frances frances = new Frances();

    private Frances() {};

    public static Frances getInstancia() {
        return frances;
    }
}
