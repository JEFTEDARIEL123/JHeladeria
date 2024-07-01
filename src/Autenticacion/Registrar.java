/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticacion;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class Registrar {
        public static void registrar(HashMap<Integer, Usuario> usuarios){
                Scanner scanner = new Scanner(System.in);
                int cedula = Integer.parseInt(validaciones.ValidarDato.check("Ingrese su numero de cedula", "Debe ingresar un numero de cedula valido", scanner, "[0-9]+"));
                String nombre = validaciones.ValidarDato.check("Ingrese unicamente su Nombre", "Debe ingresar unicamente letras sin espacios", scanner, "$[a-zA-Z]^");
                String apellidos = validaciones.ValidarDato.check("Ingrese sus apellidos", "Debe ingresar unicamente letras", scanner, "[a-zA-Z]+");
                System.out.println("");
                String provincia = validaciones.ValidarDato.check("Ingrese su provincia", "Provincia invalida.", scanner, "Alajuela|");   
    }
}
