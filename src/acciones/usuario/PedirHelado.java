/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones.usuario;

import heladeria.Menus.MenuHelado;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class PedirHelado {
    public static void pedirHelado(){
        Scanner scanner = new Scanner(System.in);
        String tipo = "null";
        String sabor = "null";
        ArrayList<String> extras = new ArrayList<>();
        int cantidadHelados = Integer.parseInt(validaciones.ValidarDato.check("Ingrese cuantos helados desea ordenar", "Debe ingresar un numero entero", scanner, "[0-9]+"));
        
        for(int i =0; i < cantidadHelados; i++){
            ArrayList<String> tipoMenu  = new ArrayList<>();
            Collections.addAll(tipoMenu, "Conos", "Conos Especiales", "Copas", "Paletas", "Sándwich");
            MenuHelado tipoHelado = new MenuHelado(tipoMenu, 1);
            tipoHelado.mostrarMenu(false);
            tipo = tipoHelado.getDato();
            
            ArrayList<String> saborMenu  = new ArrayList<>();
            Collections.addAll(saborMenu, "Café", "Chicle", "Coco", "fresa", "Vainilla", "Choco almendras", "Pistacho", "Galleta", "Ron con pasas", "Veteado","menta chocolate", "Brownie dinamita", "Churchill");
            MenuHelado saborHelado = new MenuHelado(saborMenu, 7);
            saborHelado.mostrarMenu(false);
            sabor = saborHelado.getDato();
            
            int cantidadExtras = Integer.parseInt(validaciones.ValidarDato.check("Cuantos extras desea agregar (0 es Ninguno)", "Debe ingresar un numero entero", scanner, "[0-9]+"));

            if(cantidadExtras > 0){
                for(int k=0; k < cantidadExtras; k++){
                    ArrayList<String> extraMenu  = new ArrayList<>();
                    Collections.addAll(extraMenu, "Cereales", "Fruta fresca", "Nuez de Macadamia", "Galletas");
                    MenuHelado extraHelado = new MenuHelado(extraMenu, 8);
                    extraHelado.mostrarMenu(false);
                    extras.add(extraHelado.getDato());
                }
            }
            
            Helado helado = new Helado(tipo, sabor, extras);
            
            System.out.println(helado.getTotal());
        }
    }
}
