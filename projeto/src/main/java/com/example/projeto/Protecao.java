package com.example.projeto;

import java.util.HashMap;
import java.util.Map;

public class Protecao {

    private static Map<String, Usuario> usuarios = new HashMap<>();

    public static Usuario getUsuario(String hostname) {return usuarios.get(hostname);}

    public static void addUsuario(Usuario usuario) {usuarios.put(usuario.getHostname(), usuario);}
}
