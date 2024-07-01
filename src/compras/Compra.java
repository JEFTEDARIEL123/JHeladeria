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
public class Compra {
    private int id,cedula,montoTotal;
    private String provincia;
    private LocalDate fecha;
    Random random = new Random();
    public Compra(int cedula, int montoTotal, String provincia){
        this.id = random.nextInt(5000);
        this.cedula = cedula;
        this.montoTotal = montoTotal;
        this.provincia = provincia;
        this.fecha = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public int getCedula() {
        return cedula;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public String getProvincia() {
        return provincia;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
