package com.example.projeto;

public class Time {

    private String nome;
    private boolean cybersecurity;

    public Time(String nome, boolean cybersecurity) {
        this.nome = nome;
        this.cybersecurity = cybersecurity;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCybersecurity() {
        return cybersecurity;
    }

    public void setCybersecurity(boolean cybersecurity) {
        this.cybersecurity = cybersecurity;
    }
}
