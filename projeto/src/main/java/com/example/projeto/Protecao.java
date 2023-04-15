package com.example.projeto;

import java.util.HashMap;
import java.util.Map;

public class Protecao {

    private static Map<Integer, Usuario> usuarios = new HashMap<>();

    public static Usuario getUsuario(String hostname) {return usuarios.get(hostname);}

    public static void addUsuario(Usuario usuario) {usuario.put(usuario.getHostname(), usuario);}
}
