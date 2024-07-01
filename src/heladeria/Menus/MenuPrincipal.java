/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.Menus;

import Autenticacion.ListaUsuarios;
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
    
    public void mostrarMenu(boolean Skip){
        indice=0;
        menu.forEach((n)-> {indice++; System.out.println(indice+"- "+n);});
        if(Skip){
            System.out.println("0- Salir");
        }
        handler(scanner);
    }
    
    private handl
    
}