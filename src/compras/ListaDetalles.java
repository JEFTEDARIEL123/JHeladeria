/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras;

import java.util.HashMap;

/**
 *
 * @author jefte
 */
public class ListaDetalles {
    private HashMap <Integer, Detalle> detalles = new HashMap<>();

    public ListaDetalles() {
    }

    public void agregarCompra(int precio, int id_compra, String tipo_helado, String sabor, String adicionales){
        Detalle detalle = new Detalle(precio, id_compra, tipo_helado, sabor, adicionales);
        detalles.put(detalle.getId(),detalle);
    }

    
    public void setDetalles(HashMap<Integer, Detalle> detalles) {
        this.detalles = detalles;
    }

    
    
    public HashMap<Integer, Detalle> getDetalle() {
        return detalles;
    }
}
