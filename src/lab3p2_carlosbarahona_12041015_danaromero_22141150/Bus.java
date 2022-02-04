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
public class Bus extends Transporte{
    //Atributos
    int sillas;
    int personasPie;
    
    //Constructor
    public Bus (String placa, String color, Transportistas transportista, int sillas, int personasPie, int cantMax){
        super(placa, color, transportista);
        this.sillas = sillas;
        this.personasPie = personasPie;
        this.cantMax =sillas+personasPie;
        
    }
}
