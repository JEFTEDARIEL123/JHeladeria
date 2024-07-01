/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.Menus;

import Autenticacion.ListaUsuarios;
import Autenticacion.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class MenuHelado {
    
    private int indice;
    private int selector;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> menu = new ArrayList<>();
    private String dato;
    
    public MenuHelado(ArrayList<String> datos, int selector){
        this.selector = selector;
        this.dato="null";
        datos.forEach((n) -> {Collections.addAll(menu, n);});
    }

    public String getDato() {
        return dato;
    }
    
    public void mostrarMenu(boolean Skip){
        indice=0;
        menu.forEach((n)-> {indice++; System.out.println(indice+"- "+n);});
        if(Skip){
            System.out.println("0- Salir");
        }
        selectorHandler(selector);
    }
    
    private void selectorHandler(int selector){
        switch(selector){
            case 1:
                handlerTipo();
                break;
            case 2:
                handlerCono();
                break;
            case 3:
                handlerConoEspecial();
                break;
            case 4:
                handlerCopa();
                break;
            case 5:
                handlerPaletas();
                break;
            case 6:
                handlerSandwich();
                break;
            case 7:
                handlerSabor();
                break;
            case 8:
                handlerExtra();
        }
    }
    
    private void handlerTipo(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[1-5]$"));
        switch(opcion){
            case 1:
                ArrayList<String> conoMenu  = new ArrayList<>();
                Collections.addAll(conoMenu, "Regular", "Grande", "Junior");
                MenuHelado cono = new MenuHelado(conoMenu, 2);
                cono.mostrarMenu(false);
                this.dato = cono.getDato();
                break;
            case 2:
                ArrayList<String> conoEspecialMenu  = new ArrayList<>();
                Collections.addAll(conoEspecialMenu, "Triple", "Triple Decorado");
                MenuHelado conoEspecial = new MenuHelado(conoEspecialMenu, 3);
                conoEspecial.mostrarMenu(false);
                this.dato = conoEspecial.getDato();
                break;
            case 3:
                ArrayList<String> copaMenu  = new ArrayList<>();
                Collections.addAll(copaMenu, "Sencillo", "Doble", "Light");
                MenuHelado copa = new MenuHelado(copaMenu, 4);
                copa.mostrarMenu(false);
                this.dato = copa.getDato();
                break;   
            case 4:
                ArrayList<String> paletaMenu  = new ArrayList<>();
                Collections.addAll(paletaMenu, "Cremosa", "Frutal", "Infantil");
                MenuHelado paleta = new MenuHelado(paletaMenu, 5);
                paleta.mostrarMenu(false);
                this.dato = paleta.getDato();
                break;   
            case 5:
                ArrayList<String> sandwichMenu  = new ArrayList<>();
                Collections.addAll(sandwichMenu, "Unidad", "Caja" );
                MenuHelado sandwich = new MenuHelado(sandwichMenu, 6);
                sandwich.mostrarMenu(false);
                this.dato = sandwich.getDato();
                break; 
            default:
                break;
        }
    
    }
    private void handlerCono(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[1-3]$"));
        switch(opcion){
            case 1:
                this.dato = "Cono regular";
                break;
            case 2:
                this.dato = "Cono grande";
                break;
            case 3:
                this.dato = "Cono junior";
                break;
        }
    }
    private void handlerConoEspecial(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[1-2]$"));
        switch(opcion){
            case 1:
                this.dato = "Cono especial triple";
                break;
            case 2:
                this.dato = "Cono triple decorado";
                break;
        }
    }
    private void handlerCopa(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[1-3]$"));
        switch(opcion){
            case 1:
                this.dato ="Copa sencillo";
                break;
            case 2:
                this.dato ="Copa doble";
                break;
            case 3:
                this.dato ="Copa light";
                break;
        }
    }
    
    private void handlerPaletas(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[1-3]$"));
        switch(opcion){
            case 1:
                this.dato ="Paleta cremosa";
                break;
            case 2:
                this.dato ="Paleta frutal";
                break;
            case 3:
                this.dato ="Paleta infantil";
                break;
        }
    }
    
    private void handlerSandwich(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[1-2]$"));
        switch(opcion){
            case 1:
                this.dato = "Unidad";
                break;
            case 2:
                this.dato = "Caja";
                break;
        }
    }
    
    private void handlerSabor(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"(10)|(11)|(12)|(13)|(^[1-9]$)"));
        switch(opcion){
            case 1:
                this.dato ="Café";
                break;
            case 2:
                this.dato ="Chicle";
                break;
            case 3:
                this.dato ="Coco";
                break;
            case 4:
                this.dato ="fresa";
                break;
            case 5:
                this.dato ="Vainilla";
                break;
            case 6:
                this.dato ="Choco almendras";
                break;
            case 7:
                this.dato ="Pistacho";
                break;
            case 8:
                this.dato ="Galleta";
                break;
            case 9:
                this.dato ="Ron con pasas";
                break;
            case 10:
                this.dato ="Veteado";
                break;
            case 11:
                this.dato ="Menta chocolate";
                break;
            case 12:
                this.dato ="Brownie dinamita";
                break;
            case 13:
                this.dato ="Churchill";
                break;
        }
    }
    
    private void handlerExtra(){
        int opcion =0;
        opcion = Integer.parseInt(validaciones.ValidarDato.check("Seleccione una opcion:","Debe ingresar una opción válida",scanner,"^[1-2]$"));
        switch(opcion){
            case 1:
                this.dato = "Cereales";
                break;
            case 2:
                this.dato = "Fruta fresca";
                break;
            case 3:
                this.dato = "Nuez de Macadamia";
                break;
            case 4:
                this.dato = "Galletas";
                break;   
        }
    }
}
