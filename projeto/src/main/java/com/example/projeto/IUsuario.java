package com.example.projeto;

import java.util.List;

public interface IUsuario {

    List<String> obterDadosPessoais();
    List<String> obterAcessos(Time time);
}
