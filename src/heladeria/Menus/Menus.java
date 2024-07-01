/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.Menus;

import Autenticacion.ListaUsuarios;
import Autenticacion.Login;
import Autenticacion.Registrar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class Menus {
    int indice;
    int menuActual;
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> menu = new ArrayList<>();
    ListaUsuarios listaUsuarios = new ListaUsuarios();
    
    public Menus(ArrayList<String> datos, int menuAct){
        this.menuActual = menuAct;
        datos.forEach((n) -> {Collections.addAll(menu, n);});
    }
    
    public void mostrarMenu(boolean Skip){
        indice=0;
        menu.forEach((n)-> {indice++; System.out.println(indice+"- "+n);});
        if(Skip){
            System.out.println("0- Salir");
        }
        selectorHandler(this.menuActual, scanner);
    }
    
    public void selectorHandler(int menu, Scanner scanner){
        switch(menu){
            case 1:
                handlerLogin();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Error, no se ha identificado el menú :(");
        }
    }
    
    public void handlerLogin(){
        int opcion = 0;
        
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[0-2]$"));
        int cedula=0;
        
        switch(opcion){
            case 1:
                cedula = Integer.parseInt(validaciones.ValidarDato.check("Ingrese su numero de cedula","Debe ingresar un numero de cedula valido", scanner, "[0-9]+"));
                if(Login.iniciarSesion(listaUsuarios.getUsuarios(), cedula)){
                    System.out.println("El usuario existe");
                } else {
                    mostrarMenu(true);
                }
                break;
            case 2:
                listaUsuarios.setUsuarios(Registrar.registrarUsuario(listaUsuarios.getUsuarios()));
                mostrarMenu(true);
                break;
            default:
                break;
            }
        
    }
    
    public String handlerGeneros(){
        int opcion = 0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[1-2]$"));
        switch(opcion){
            case 1:
                return "Masculino";
            case 2:
                return "Femenino";
            default:
                return "null";
            }
    }
    
    public String handlerProvincias(){
        int opcion = 0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[1-7]$"));
        switch(opcion){
            case 1:
                return "San José";
            case 2:
                return "Alajuela";
            case 3:
                return "Cartago";
            case 4:
                return "Heredia";
            case 5:
                return "Guanacaste";
            case 6:
                return "Puntarenas";
            case 7:
                return "Limon";
            default:
                return "null";
            }
    }
}
