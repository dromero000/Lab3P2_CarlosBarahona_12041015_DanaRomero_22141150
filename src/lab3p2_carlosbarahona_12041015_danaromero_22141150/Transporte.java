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
    //Atributos
    String placa;
    String color;
    String transportista;
    int cantMax;
    ArrayList <Estaciones> estaciones;
    
    
    public Transporte (String placa, String color, String transportista){
       this.placa = placa;
       this.color= color;
       this.transportista=transportista;
       estaciones = new ArrayList <Estaciones>();
       
    }

           
    
}
