package com.example.projeto;

import java.util.Arrays;
import java.util.List;

public class Usuario implements IUsuario{

    private String hostname;
    private String nome;
    private String sistema;
    private String acesso1;
    private String acesso2;

    public Usuario(String hostname) {
        this.hostname = hostname;
        Usuario objeto = Protecao.getUsuario(hostname);
        this.nome = objeto.nome;
        this.sistema = objeto.sistema;
        this.acesso1 = objeto.acesso1;
        this.acesso2 = objeto.acesso2;
    }

    public Usuario(String hostname, String nome, String sistema, String acesso1, String acesso2) {
        this.hostname = hostname;
        this.nome = nome;
        this.sistema = sistema;
        this.acesso1 = acesso1;
        this.acesso2 = acesso2;
    }

    public String getHostname() {
        return hostname;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.sistema);
    }

    @Override
    public List<String> obterAcessos(Time time) {
        return Arrays.asList(this.acesso1, this.acesso2);
    }

    public void put(String hostname, Usuario usuario) {
    }
}
