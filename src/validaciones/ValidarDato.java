/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validaciones;

import java.util.Scanner;

/**
 *
 * @author jefte
 */
public class ValidarDato {
        public static String check(String msg,String err, Scanner scanner,String regex){
        System.out.println(msg);
        while(true){
            
            String input = scanner.next();
            
            if(input.matches(regex)){
                return input;
            }
            
            System.out.println(err);
        }
    }
}
