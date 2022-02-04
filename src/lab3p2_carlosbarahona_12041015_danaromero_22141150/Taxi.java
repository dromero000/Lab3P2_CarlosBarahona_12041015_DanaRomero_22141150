/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona_12041015_danaromero_22141150;

/**
 *
 * @author Dana Romero
 */
public class Taxi extends Transporte{
    
    //Constructor
    public Taxi (String placa, String color, String transportista){
        super(placa, color, transportista);
        this.cantMax = 4;
    }
    
    public String toString(){
        return "Transporte= Taxi ,"+ super.toString()+"}";
    }
}
