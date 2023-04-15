package com.example.projeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class UsuarioProxyTest {

    @BeforeEach
    void setUp() {
        Protecao.addUsuario(new Usuario("epq255", "anamaria", "Mac OS", "sitedesconhecido", "sitejogos"));
        Protecao.addUsuario(new Usuario("epq347", "clarasilva", "Windows", "sitelivros", "sitebloqueado"));
    }

    @Test
    void deveRetornarDadosPessoaisUsuario() {
        UsuarioProxy usuario = new UsuarioProxy("epq255");

        assertEquals(Arrays.asList("anamaria", "Mac OS"), usuario.obterDadosPessoais());
    }

    @Test
    void deveRetonarAcessosUsuario() {
        Time time = new Time("anamaria", true);
        UsuarioProxy usuario = new UsuarioProxy("epq255");

        assertEquals(Arrays.asList("sitedesconhecido", "sitejogos"), usuario.obterAcessos(time));
    }

    @Test
    void deveRetonarExcecaoTimeNaoAutorizadoConsultarAcessosUsuario() {
        try {
            Time time = new Time("Maria", false);
            UsuarioProxy usuario = new UsuarioProxy("epq347");

            usuario.obterAcessos(time);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Time não autorizado", e.getMessage());
        }
    }
}
