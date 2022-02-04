/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona_12041015_danaromero_22141150;

import java.util.ArrayList;

/**
 *
 * @author Dana Romero
 */
public class Transporte {
    //Esta es una clase padre
    //Atributos
    String placa;
    String color;
    Transportistas transportista;
    int cantMax;
    ArrayList <Estaciones> estaciones;
    
    
    public Transporte (String placa, String color, Transportistas transportista){
       this.placa = placa;
       this.color= color;
       this.transportista=transportista;
       estaciones = new ArrayList <Estaciones>();
       
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Transportistas getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportistas transportista) {
        this.transportista = transportista;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public ArrayList<Estaciones> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estaciones> estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "Transporte{" + "placa=" + placa + ", color=" + color + ", transportista=" + transportista + ", cantMax=" + cantMax + ", estaciones=" + estaciones + '}';
    }
    
    
    

}
