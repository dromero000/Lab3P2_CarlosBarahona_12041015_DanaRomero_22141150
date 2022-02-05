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
public class Bus extends Transporte {

    //Atributos
    int sillas;
    int personasPie;

    //Constructor
    public Bus(int sillas, int personasPie, String placa, String color, Transportistas transportista, int cantMax, ArrayList<Estaciones> estaciones, ArrayList<Alumnos> alumnos) {
        super(placa, color, transportista, cantMax, estaciones, alumnos);
        this.sillas = sillas;
        this.personasPie = personasPie;
    }

    int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getPersonasPie() {
        return personasPie;
    }

    public void setPersonasPie(int personasPie) {
        this.personasPie = personasPie;
    }

    @Override
    public String toString() {
        return "Bus{" + "alumnos=" + alumnos + ", sillas=" + sillas + ", personasPie=" + personasPie + '}';
    }

}
