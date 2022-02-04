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
    String transportista;
    int cantMax;
    ArrayList <Estaciones> estaciones;
    ArrayList <Alumnos> alumnos;
    
    
    public Transporte (String placa, String color, String transportista){
       this.placa = placa;
       this.color= color;
       this.transportista=transportista;
       estaciones = new ArrayList <Estaciones>();
       alumnos = new ArrayList <Alumnos>();
       
    }

    @Override
    public String toString() {
        return "Placa=" + placa + ", color=" + color + ", transportista=" + transportista + ", Cantidad Máxima de Personas=" + cantMax + ", Estaciones=" + estaciones;
    }
    
    
    
    //Métodos
    /*
    public void simulacion( ){
        int x1 = 0;
        int x2= 0;
        System.out.println("");
    }
     */
}
