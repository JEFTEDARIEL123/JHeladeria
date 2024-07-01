/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras;

import compras.Compra;
import java.util.HashMap;

/**
 *
 * @author jefte
 */
public class ListaCompras {
    private HashMap <Integer, Compra> compras = new HashMap<>();

    public ListaCompras() {
    }

    public void agregarCompra(int cedula, int montoTotal, String provincia){
        Compra compra = new Compra(cedula, montoTotal, provincia);
        compras.put(compra.getId(),compra);
    }

    
    public void setCompras(HashMap<Integer, Compra> compras) {
        this.compras = compras;
    }

    
    
    public HashMap<Integer, Compra> getCompras() {
        return compras;
    }
}
