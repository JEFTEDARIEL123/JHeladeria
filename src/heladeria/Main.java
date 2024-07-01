/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heladeria;
import autenticacion.ListaUsuarios;
import compras.ListaCompras;
import compras.ListaDetalles;
import heladeria.Menus.MenusAuth;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jefte
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String resaltado ="\u001B[33;1m";
        String reset = "\u001B[0m";
        ListaUsuarios listaUsuarios = new ListaUsuarios();
        ListaCompras listaCompras = new ListaCompras();
        ListaDetalles listaDetalles = new ListaDetalles();
        
        
        System.out.println(resaltado+"Usuario root: 123\n"+resaltado+"Usuario normal: 400\n"+reset);
        
        //Llamar al menú de Login
        ArrayList<String> loginMenu  = new ArrayList<>();
        Collections.addAll(loginMenu, "Iniciar Sesión", "Registrarse");
        MenusAuth login = new MenusAuth(loginMenu, 1,listaUsuarios);
        login.mostrarMenu(true);
        listaUsuarios.setUsuarios(login.getListaUsuarios().getUsuarios());
        
        
        
        
    }
    
}