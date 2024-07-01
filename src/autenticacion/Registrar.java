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
    
        //clase para registrar un nuevo usuario
        //ESte metodo se puede llamar sin necesidad de incialziar la clase en sí
        public static HashMap<Integer, Usuario> registrarUsuario(HashMap<Integer, Usuario> listaUsuarios){
                //Info para el menu de provincias
                ArrayList<String> provincias = new ArrayList<>();
                Collections.addAll(provincias,"San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limon");
                //Info para el menu de generos
                ArrayList<String> generos = new ArrayList<>();
                Collections.addAll(generos,"Masculino", "Femenino");
                
                Scanner scanner = new Scanner(System.in);
                //Aca consultamos, validamos y guardamos la infor de la cedula, nombre y apellidos del usuario
                int cedula = Integer.parseInt(validaciones.ValidarDato.check("Ingrese su numero de cedula", "Debe ingresar un numero de cedula valido", scanner, "[0-9]+"));
                String nombre = validaciones.ValidarDato.check("Ingrese unicamente su Nombre", "Debe ingresar unicamente letras sin espacios", scanner, "[a-zA-Z]+");
                String apellidos = validaciones.ValidarDato.check("Ingrese su primer Apellido", "Debe ingresar unicamente letras", scanner, "[a-zA-Z]+") + " "+
                                    validaciones.ValidarDato.check("Ingrese su segundo Apellido", "Debe ingresar unicamente letras", scanner, "[a-zA-Z]+");
                
                //Se llama al menu para consultar el genero
                MenusAuth menuGeneros = new MenusAuth(generos, 2);
                menuGeneros.mostrarMenu(false);
                String genero = menuGeneros.handlerProvincias();
                
                //menu para consultar su provincia
                MenusAuth menuProvincias = new MenusAuth(provincias, 2);
                menuProvincias.mostrarMenu(false);
                String provincia = menuProvincias.handlerProvincias();
                
                //Se crea el objeto usuario con las respectivas caracteristicas y informacion
                Usuario usuario = new Usuario(cedula, nombre, apellidos, genero, provincia);
                listaUsuarios.put(cedula, usuario);
                 
                //Feedback para informar que se creo el usuario y su info
                System.out.println("\nSe ha registrado exitosamente el usuario:\nCedula: "+cedula + "\nNombre: "+ nombre + "\nApellidos: " +apellidos + "\nGenero: " + genero+ "\nProvincia: "+provincia +"\n");
                //devolvemos la lista de usaurios actualizada
                return listaUsuarios;
                
                
    }
}
