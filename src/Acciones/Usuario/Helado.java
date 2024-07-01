/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acciones.Usuario;

/**
 *
 * @author jefte
 */
public class Helado {
    private int total;
    private String tipo, sabor;
    private String[] extras;

    public Helado(String tipo, String sabor, String[] extras) {
        this.tipo = tipo;
        this.sabor = sabor;
        this.extras = extras;
        switch(tipo){
            case "Cono regular":
                this.total+=1300;
                break;
            case "Cono grande":
                this.total+=1500;
                break;
            case "Cono junior":
                this.total+=1000;
                break;
            case "Cono especial triple":
                this.total+=2600;
                break;
            case "Cono especial triple decorado":
                this.total+=2900;
                break;
            case "Copa sencilla":
                this.total+=1550;
                break;
            case "Copa doble":
                this.total+=2600;
                break;
            case "Copa light":
                this.total+=1950;
                break;
            case "Paleta cremosa y frutal":
                this.total+= 950;
                break;
            case "Paleta infantil":
                this.total+= 800;
                break;
            case "Sandwich unidad":
                this.total+= 600;
                break;
            case "Sandwich caja":
                this.total+= 3000;
                break;
            default:
                this.total+=0;
                break;
        }
        for(String extra : extras){
            this.total+=350;
        }
        
    }

    public int getTotal() {
        return total;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public String[] getExtras() {
        return extras;
    }
    
    
}
