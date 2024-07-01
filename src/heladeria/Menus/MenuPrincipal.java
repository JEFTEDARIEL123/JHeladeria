/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.Menus;

import Acciones.EditarCliente;
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
        int mostrar=1;
        do{
        indice=0;
        
        menu.forEach((n)-> {indice++; System.out.println(indice+"- "+n);});
        if(Skip){
            System.out.println("0- Salir");
        }
        if(usuario.getAdmin()){
            mostrar = handlerAdmin();
        } else{
            mostrar = handlerCliente();
        }
        }while(mostrar != 0);
        
    }
    
    private int handlerCliente(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[0-2]$"));
        switch(opcion){
            case 1:
                PedirHelado.pedirHelado();
                return opcion;
            case 2:
                System.out.println("EDitarrr");
                return opcion;
            case 0:
                return opcion;
            default:
                return opcion;
        }
    
    }
    
    private int handlerAdmin(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[0-2]$"));
        do{
            switch(opcion){
            case 1:
                int cedula = Integer.parseInt(validaciones.ValidarDato.check("Ingrese la cedula del cliente", "Debe ingresar unicamente numeros", scanner, "[0-9]+"));
                listaUsuarios.setUsuarios(EditarCliente.editar(listaUsuarios, cedula).getUsuarios());
                return opcion;
            case 2:
                System.out.println("EDitarrr");
                return opcion;
            case 3:
                return opcion;
            case 4:
                return opcion;
            case 0:
                return opcion;
            default:
                return opcion;
            }
        } while (opcion == 0);
    
    }
    
}