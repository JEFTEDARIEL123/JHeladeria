/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticacion;

import java.util.HashMap;

/**
 *
 * @author jefte
 */
public class Login {
    public static boolean iniciarSesion(HashMap<Integer, Usuario> listaUsuarios,int cedula){
        if(listaUsuarios.containsKey(cedula)){
            return true;
        } else {
            return false;
        }
    }
}
