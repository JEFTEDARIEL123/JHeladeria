/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heladeria;
import heladeria.Menus.Menus;
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
        System.out.println(resaltado+"Usuario root: 123\n"+reset);
        ArrayList<String> loginMenu  = new ArrayList<>();
        //Llamar al menú de Login
        Collections.addAll(loginMenu, "Iniciar Sesión", "Registrarse");
        Menus login = new Menus(loginMenu, 1);
        login.mostrarMenu(true);
    }
    
}