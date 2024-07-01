/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones.admin;

import autenticacion.ListaUsuarios;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class EliminarCliente {
    public static ListaUsuarios eliminar(ListaUsuarios listaUsuarios, int cedula){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Se eliminó correctamente el usuario: ");
       System.out.println("Es Admin: "+ listaUsuarios.getUsuarios().get(cedula).getAdmin() + 
                        "\nNombre: " + listaUsuarios.getUsuarios().get(cedula).getNombre() +
                          "\nApellidos: "+ listaUsuarios.getUsuarios().get(cedula).getApellidos() +
                            "\nGenero: "+ listaUsuarios.getUsuarios().get(cedula).getGenero() +
                              "\nProvincia: "+ listaUsuarios.getUsuarios().get(cedula).getProvincia()+ "\n ");
       listaUsuarios.getUsuarios().remove(cedula);
       return listaUsuarios;

    }
}
