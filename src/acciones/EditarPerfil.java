/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones;

import autenticacion.ListaUsuarios;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class EditarPerfil {
    public static ListaUsuarios editar(ListaUsuarios listaUsuarios, int cedula){
       Scanner scanner = new Scanner(System.in);
       //Imprime la informarcion del cliente
       System.out.println("1- Nombre: " + listaUsuarios.getUsuarios().get(cedula).getNombre() +
                          "\n2- Apellidos: "+ listaUsuarios.getUsuarios().get(cedula).getApellidos() +
                            "\n3- Genero: "+ listaUsuarios.getUsuarios().get(cedula).getGenero() +
                              "\n4- Provincia: "+ listaUsuarios.getUsuarios().get(cedula).getProvincia()+ "\n ");
       int campo = Integer.parseInt(validaciones.ValidarDato.check("Ingrese el campo a modificar", "Opcion invalida", scanner, "^[1-5]$"));
       
       //Dependiendo del campo elegido se actualiza su informacion por la nueva ingresada
       switch(campo){
           
            case 1:
                listaUsuarios.getUsuarios().get(cedula).setNombre(validaciones.ValidarDato.check("Ingrese el nuevo nombre", "error, dato invalido", scanner, "[a-zA-Z]+"));
               break;
            case 2:
                listaUsuarios.getUsuarios().get(cedula).setApellidos(validaciones.ValidarDato.check("Ingrese los apellidos", "error, dato invalido", scanner, "[a-zA-Z]+"));
                break;
            case 3:
                listaUsuarios.getUsuarios().get(cedula).setGenero(validaciones.ValidarDato.check("Ingrese el gemeroe", "error, dato invalido", scanner, "Masculino|Femenino"));
                break;
            case 4:
                listaUsuarios.getUsuarios().get(cedula).setProvincia(validaciones.ValidarDato.check("Ingrese la provincia", "error, dato invalido", scanner, "[a-zA-Z]+"));
                break;
                
        }
       
       //Se retorna la lista actualizada con los cambios
       return listaUsuarios;

    }
}
