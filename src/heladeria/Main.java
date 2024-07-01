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
        
        ArrayList<String> loginMenu  = new ArrayList<>();
        //Llamar al menú de Login
        Collections.addAll(loginMenu, "Iniciar Sesión", "Registrarse");
        Menus login = new Menus(loginMenu);
        login.mostrarMenu(1);
    }
    
}