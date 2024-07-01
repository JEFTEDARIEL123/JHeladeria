/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acciones;

import Autenticacion.ListaUsuarios;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class EditarCliente {
    public static ListaUsuarios editar(ListaUsuarios listaUsuarios, int cedula){
       Scanner scanner = new Scanner(System.in);
       System.out.println("1- Es Admin: "+ listaUsuarios.getUsuarios().get(cedula).getAdmin() + 
                        "\n2- Nombre: " + listaUsuarios.getUsuarios().get(cedula).getNombre() +
                          "\n3- Apellidos: "+ listaUsuarios.getUsuarios().get(cedula).getApellidos() +
                            "\n4- Genero: "+ listaUsuarios.getUsuarios().get(cedula).getGenero() +
                              "\n5- Provincia: "+ listaUsuarios.getUsuarios().get(cedula).getProvincia());
       int campo = Integer.parseInt(validaciones.ValidarDato.check("Ingrese el campo a modificar", "Opcion invalida", scanner, "^[1-5]$"));
       switch(campo){
            case 1:
                listaUsuarios.getUsuarios().get(cedula).setAdmin(Boolean.parseBoolean(validaciones.ValidarDato.check("Ingrese true o false", "error, dato invalido", scanner, "true|false")));
                break;
            case 2:
                listaUsuarios.getUsuarios().get(cedula).setNombre(validaciones.ValidarDato.check("Ingrese el nuevo nombre", "error, dato invalido", scanner, "[a-zA-Z]+"));
               break;
            case 3:
                listaUsuarios.getUsuarios().get(cedula).setApellidos(validaciones.ValidarDato.check("Ingrese los apellidos", "error, dato invalido", scanner, "[a-zA-Z]+"));
                break;
            case 4:
                listaUsuarios.getUsuarios().get(cedula).setGenero(validaciones.ValidarDato.check("Ingrese el gemeroe", "error, dato invalido", scanner, "Masculino|Femenino"));
                break;
            case 5:
                listaUsuarios.getUsuarios().get(cedula).setProvincia(validaciones.ValidarDato.check("Ingrese la provincia", "error, dato invalido", scanner, "[a-zA-Z]+"));
                break;
                
        }
       return listaUsuarios;
       
       
       
       
    
       
    }
}
