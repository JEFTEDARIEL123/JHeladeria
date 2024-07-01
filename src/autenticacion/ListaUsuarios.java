/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticacion;

import java.util.HashMap;

/**
 *
 * @author jefte
 */
public class ListaUsuarios {
    
    //Clase para gestionar la lista de los usuarios del sistema
    private HashMap <Integer, Usuario> usuarios = new HashMap<>();

    public ListaUsuarios() {
    }

    public void agregarUsuario(int cedula, String nombre, String apellidos, String genero, String provincia){
        Usuario usuario = new Usuario(cedula, nombre, apellidos, genero, provincia);
        usuarios.put(cedula, usuario);
    }
    
    public void agregarUsuario(int cedula, String nombre, String apellidos, String genero, String provincia, Boolean admin){
        Usuario usuario = new Usuario(cedula, nombre, apellidos, genero, provincia, admin);
        usuarios.put(cedula, usuario);
    }
    public void setUsuarios(HashMap<Integer, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    
    
    public HashMap<Integer, Usuario> getUsuarios() {
        return usuarios;
    }
}
