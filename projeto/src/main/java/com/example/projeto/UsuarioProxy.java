package com.example.projeto;

import java.util.List;

public class UsuarioProxy implements IUsuario{

    private Usuario usuario;

    private String hostname;

    public UsuarioProxy(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.usuario == null) {
            this.usuario = new Usuario(this.hostname);
        }
        return this.usuario.obterDadosPessoais();
    }

    @Override
    public List<String> obterAcessos(Time time) {
        if (!time.isCybersecurity()) {
            throw new IllegalArgumentException("Time não autorizado");
        }
        if (this.usuario == null) {
            this.usuario = new Usuario(this.hostname);
        }
        return this.usuario.obterAcessos(time);
    }
}
