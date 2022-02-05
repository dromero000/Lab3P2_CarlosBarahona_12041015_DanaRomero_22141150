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
public class Rapidito extends Transporte {

    //Atributos
    int sillas;

    //Constructor
    public Rapidito(int sillas, String placa, String color, Transportistas transportista, int cantMax, ArrayList<Estaciones> estaciones, ArrayList<Alumnos> alumnos) {
        super(placa, color, transportista, cantMax, estaciones, alumnos);
        this.sillas = sillas;
    }

    int getSillas() {
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
