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
        //Cargamos la lista de los usuairos
        this.listaUsuarios = listaUsuarios;
        
        //Se pre cargan dos usuarios por defecto, uno administrador y uno usuario
        listaUsuarios.agregarUsuario(123, "Admin", "Sudo", "Null", "Null", true);
        listaUsuarios.agregarUsuario(400, "Juan", "Perez Sosa", "Masculino", "Alajuela");
        this.menuActual = menuAct;
        //Se carga a la coleccion la info del menu a mostrar
        datos.forEach((n) -> {Collections.addAll(menu, n);});
    }
    
    
    
    public MenusAuth(ArrayList<String> datos, int menuAct){
        //El mismo constructor que arriba
        //solo que este es unicamente con la lista de datos y menu actual
        //Sin una lista de usuarios.
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
        //Muestra el menú con su informacion correspondiente
        mostrar=1;
        do{
        indice=0;
        //imprimiendo el menú:
        menu.forEach((n)-> {indice++; System.out.println(indice+"- "+n);});
        if(Skip){
            System.out.println("0- Salir");
        }
        //jala la informacion del handler elegido
        mostrar = selectorHandler(this.menuActual);
        }while(mostrar != 0);
    }
    
    private int selectorHandler(int menu){
        //Carga el handler seleccionado
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


    //Handler para iniciar sesion
    private int handlerLogin(){
        int opcion = 0;
        //Cargamos si se quiere iniciar sesion o registrar
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[0-2]$"));
        int cedula=0;
        
        switch(opcion){
            case 0:
                return opcion;
            case 1:
                //SI al logearse el usuario es admin cargara el primer menu, sino el segundo
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
                    //Y si no se encuentra almacenado ese usuario
                    System.out.println("\n⚠ El usuario ingresado no existe!\n");
                    mostrarMenu(true);
                }
                return opcion;
            case 2:
                
                //Manda al menu para registar al usuario
                listaUsuarios.setUsuarios(Registrar.registrarUsuario(listaUsuarios.getUsuarios()));
                mostrarMenu(true);
                return 0;
            default:
                return opcion;
            }
        
    }
    //Yay un handler pa los generos
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
    
    //y otro pa las provincias
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
