/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticacion;

import java.util.HashMap;

/**
 *
 * @author jefte
 */
public class Login {
    //Clase con métodos staticos, simplemente es para verificar la autenticacion del usuario
    // asi como si es o no administrador
    
    //Aca validamos la existencia del usuario, si es verdadera, se da acceso
    public static boolean iniciarSesion(HashMap<Integer, Usuario> listaUsuarios,int cedula){
        if(listaUsuarios.containsKey(cedula)){
            return true;
        } else {
            return false;
        }
    }
    //Aca se valida si es administrador del sistema
    public static boolean esAdmin(HashMap<Integer, Usuario> listaUsuarios,int cedula){
        if(listaUsuarios.get(cedula).getAdmin()){
            return true;
        } else{
            return false;
        }
    }
}
