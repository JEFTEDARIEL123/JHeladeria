/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.Menus;

import Autenticacion.ListaUsuarios;
import Autenticacion.Login;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class Menus {
    int indice=0;
    int menuActual = 0;
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> menu = new ArrayList<>();
    ListaUsuarios listaUsuarios = new ListaUsuarios();
    
    public Menus(ArrayList<String> datos){
        datos.forEach((n) -> {Collections.addAll(menu, n);});
    }
    
    public void mostrarMenu(int menuAct){
        menuActual=menuAct;
        menu.forEach((n)-> {indice++; System.out.println(indice+"- "+n);});
        System.out.println("0- Salir");
        selectorHandler(menuActual, scanner);
    }
    

    

    
    public void selectorHandler(int menu, Scanner scanner){
        switch(menu){
            case 1:
                handlerLogin();
                break;
            default:
                System.out.println("Error, no se ha identificado el menú :(");
        }
    }
    
    public void handlerLogin(){
        menuActual=1;
        int opcion = 0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[0-2]$"));
        int cedula=0;
        switch(opcion){
            case 1:
                cedula = Integer.parseInt(validaciones.ValidarDato.check("Ingrese su numero de cedula","Debe ingresar un numero de cedula valido", scanner, "[0-9]+"));
                if(Login.iniciarSesion(listaUsuarios.getUsuarios(), cedula)){
                    System.out.println("El usuario existe");
                } else {
                    System.out.println("NO existe jaja");
                }
                break;
            case 2:
                //Registrar.registrar(usuarios);
                break;
            default:
                break;
            }
    }
}
