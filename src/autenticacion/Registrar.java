/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticacion;

import heladeria.Menus.MenusAuth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class Registrar{
        public static HashMap<Integer, Usuario> registrarUsuario(HashMap<Integer, Usuario> listaUsuarios){
                ArrayList<String> provincias = new ArrayList<>();
                Collections.addAll(provincias,"San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limon");
                
                ArrayList<String> generos = new ArrayList<>();
                Collections.addAll(generos,"Masculino", "Femenino");
                
                Scanner scanner = new Scanner(System.in);
                
                int cedula = Integer.parseInt(validaciones.ValidarDato.check("Ingrese su numero de cedula", "Debe ingresar un numero de cedula valido", scanner, "[0-9]+"));
                String nombre = validaciones.ValidarDato.check("Ingrese unicamente su Nombre", "Debe ingresar unicamente letras sin espacios", scanner, "[a-zA-Z]+");
                String apellidos = validaciones.ValidarDato.check("Ingrese su primer Apellido", "Debe ingresar unicamente letras", scanner, "[a-zA-Z]+") + " "+
                                    validaciones.ValidarDato.check("Ingrese su segundo Apellido", "Debe ingresar unicamente letras", scanner, "[a-zA-Z]+");
                
                MenusAuth menuGeneros = new MenusAuth(generos, 2);
                menuGeneros.mostrarMenu(false);
                String genero = menuGeneros.handlerProvincias();
                
                MenusAuth menuProvincias = new MenusAuth(provincias, 2);
                menuProvincias.mostrarMenu(false);
                String provincia = menuProvincias.handlerProvincias();
                
                Usuario usuario = new Usuario(cedula, nombre, apellidos, genero, provincia);
                listaUsuarios.put(cedula, usuario);
                 
                System.out.println("\nSe ha registrado exitosamente el usuario:\nCedula: "+cedula + "\nNombre: "+ nombre + "\nApellidos: " +apellidos + "\nGenero: " + genero+ "\nProvincia: "+provincia +"\n");
                return listaUsuarios;
                
                
    }
}
