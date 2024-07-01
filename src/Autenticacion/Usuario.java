/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticacion;

/**
 *
 * @author jefte
 */
public class Usuario {
    private int cedula;
    private String nombre, apellidos, genero, provincia;
    private Boolean admin;

    public Usuario(int cedula, String nombre, String apellidos, String genero, String provincia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.provincia = provincia;
        this.admin = false;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Boolean getAdmin() {
        return admin;
    }
    public Usuario(int cedula, String nombre, String apellidos, String genero, String provincia, Boolean admin) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.provincia = provincia;
        this.admin = admin;
    }
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getProvincia() {
        return provincia;
    }
    
}
