/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.Menus;

import Acciones.Usuario.PedirHelado;
import Autenticacion.ListaUsuarios;
import Autenticacion.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class MenuPrincipal {
    private int indice;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> menu = new ArrayList<>();
    private ListaUsuarios listaUsuarios = new ListaUsuarios();
    
    public MenuPrincipal(ArrayList<String> datos, ListaUsuarios listaUsuarios){
        this.listaUsuarios = listaUsuarios;
        datos.forEach((n) -> {Collections.addAll(menu, n);});
    }
    
    public void mostrarMenu(boolean Skip, Usuario usuario){
        indice=0;
        menu.forEach((n)-> {indice++; System.out.println(indice+"- "+n);});
        if(Skip){
            System.out.println("0- Salir");
        }
        if(usuario.getAdmin()){
            handlerAdmin();
        } else{
            handlerCliente();
        }
    }
    
    private void handlerCliente(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[0-2]$"));
        switch(opcion){
            case 1:
                PedirHelado.pedirHelado();
                break;
            case 2:
                System.out.println("EDitarrr");
                break;
            default:
                break;
        }
    
    }
    
    private void handlerAdmin(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[0-2]$"));
        switch(opcion){
            case 1:
                System.out.println("Pedirrrrr");
                break;
            case 2:
                System.out.println("EDitarrr");
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
    
    }
    
}