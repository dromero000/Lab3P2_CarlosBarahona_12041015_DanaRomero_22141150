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
public class Taxi extends Transporte {

    private int numTaxi;

    //Constructor
    public Taxi(int numTaxi, String placa, String color, Transportistas transportista, int cantMax, ArrayList<Estaciones> estaciones, ArrayList<Alumnos> alumnos) {
        super(placa, color, transportista, cantMax, estaciones, alumnos);
        this.numTaxi = numTaxi;
        this.alumnos = alumnos;
    }

    public int getNumTaxi() {
        return numTaxi;
    }

    public void setNumTaxi(int numTaxi) {
        this.numTaxi = numTaxi;
    }

    @Override
    public String toString() {
        return "Taxi{" + "numTaxi=" + numTaxi + '}';
    }

}
