/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author jefte
 */
public class Detalle {
    private int id,precio,id_compra;
    private String tipo_helado, sabor, adicionales;
    Random random = new Random();

    public Detalle(int precio, int id_compra, String tipo_helado, String sabor, String adicionales) {
        this.id = random.nextInt(5000);
        this.precio = precio;
        this.id_compra = id_compra;
        this.tipo_helado = tipo_helado;
        this.sabor = sabor;
        this.adicionales = adicionales;
    }

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public int getId_compra() {
        return id_compra;
    }

    public String getTipo_helado() {
        return tipo_helado;
    }

    public String getSabor() {
        return sabor;
    }

    public String getAdicionales() {
        return adicionales;
    }
    
}
