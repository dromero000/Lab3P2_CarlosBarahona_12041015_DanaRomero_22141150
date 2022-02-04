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
public class Rapidito extends Transporte {
    
    //Atributos
    int sillas;
    
    //Constructor
    public Rapidito (String placa, String color, Transportistas transportista, int sillas){
        super(placa, color, transportista);
        this.sillas = sillas;
        this.cantMax = sillas;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    @Override
    public String toString() {
        return "Rapidito{" + "sillas=" + sillas + '}';
    }
    
    
    
}
