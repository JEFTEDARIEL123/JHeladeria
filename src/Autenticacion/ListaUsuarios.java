/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticacion;

import java.util.HashMap;

/**
 *
 * @author jefte
 */
public class ListaUsuarios {
    private HashMap <Integer, Usuario> usuarios = new HashMap<>();

    public ListaUsuarios() {
    }

    public void agregarUsuario(int cedula, String nombre, String apellidos, String genero, String provincia){
        Usuario usuario = new Usuario(cedula, nombre, apellidos, genero, provincia);
        usuarios.put(cedula, usuario);
    }

    public HashMap<Integer, Usuario> getUsuarios() {
        return usuarios;
    }
}
