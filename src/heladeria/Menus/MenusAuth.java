/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.Menus;

import autenticacion.ListaUsuarios;
import autenticacion.Login;
import autenticacion.Registrar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class MenusAuth {
    private int indice;
    private int menuActual, mostrar;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> menu = new ArrayList<>();
    private ListaUsuarios listaUsuarios = new ListaUsuarios();
    
    public MenusAuth(ArrayList<String> datos, int menuAct, ListaUsuarios listaUsuarios){
        this.listaUsuarios = listaUsuarios;
        listaUsuarios.agregarUsuario(123, "Admin", "Sudo", "Null", "Null", true);
        listaUsuarios.agregarUsuario(400, "Juan", "Perez Sosa", "Masculino", "Alajuela");
        this.menuActual = menuAct;
        datos.forEach((n) -> {Collections.addAll(menu, n);});
    }
    
    
    
    public MenusAuth(ArrayList<String> datos, int menuAct){
        
        this.menuActual = menuAct;
        datos.forEach((n) -> {Collections.addAll(menu, n);});
    }
    
    public void setListaUsuarios(ListaUsuarios listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ListaUsuarios getListaUsuarios() {
        return listaUsuarios;
    }
    
    public void mostrarMenu(boolean Skip){
        mostrar=1;
        do{
        indice=0;
        menu.forEach((n)-> {indice++; System.out.println(indice+"- "+n);});
        if(Skip){
            System.out.println("0- Salir");
        }
        mostrar = selectorHandler(this.menuActual);
        }while(mostrar != 0);
    }
    
    private int selectorHandler(int menu){
        switch(menu){
            case 1:
                return handlerLogin();
            case 2:
                return 0;
            case 3:
                return 0;
            default:
                System.out.println("Error, no se ha identificado el menú :(");
                return 1;
        }
    }


    
    private int handlerLogin(){
        int opcion = 0;
        
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[0-2]$"));
        int cedula=0;
        
        switch(opcion){
            case 0:
                return opcion;
            case 1:
                cedula = Integer.parseInt(validaciones.ValidarDato.check("Ingrese su numero de cedula","Debe ingresar un numero de cedula valido", scanner, "[0-9]+"));
                if(Login.iniciarSesion(listaUsuarios.getUsuarios(), cedula)){
                    if(Login.esAdmin(listaUsuarios.getUsuarios(), cedula)){
                        ArrayList<String> menu  = new ArrayList<>();
                        Collections.addAll(menu, "Editar Cliente", "Reportes", "Eliminar Cliente", "Visualizar Clientes");
                        MenuPrincipal menuPrincipal = new MenuPrincipal(menu,listaUsuarios);
                        menuPrincipal.mostrarMenu(true, listaUsuarios.getUsuarios().get(cedula));
                    }
                    
                    if(!(Login.esAdmin(listaUsuarios.getUsuarios(), cedula))){
                        ArrayList<String> menu  = new ArrayList<>();
                        Collections.addAll(menu, "Pedir Helado", "Editar Cliente");
                        MenuPrincipal menuPrincipal = new MenuPrincipal(menu,listaUsuarios);
                        menuPrincipal.mostrarMenu(true, listaUsuarios.getUsuarios().get(cedula));
                    }
                } else {
                    System.out.println("\n⚠ El usuario ingresado no existe!\n");
                    mostrarMenu(true);
                }
                return opcion;
            case 2:
                listaUsuarios.setUsuarios(Registrar.registrarUsuario(listaUsuarios.getUsuarios()));
                mostrarMenu(true);
                return 0;
            default:
                return opcion;
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
