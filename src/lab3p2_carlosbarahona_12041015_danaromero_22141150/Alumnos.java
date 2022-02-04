/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona_12041015_danaromero_22141150;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Alumnos extends Personas {
    
    private int idEstudiante;
    private ArrayList<Clases> clases ;

    public Alumnos(int idEstudiante, ArrayList<Clases> clases, String nombre, int identidad, String fechaNacimiento) {
        super(nombre, identidad, fechaNacimiento);
        this.idEstudiante = idEstudiante;
        this.clases = clases;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Alumnos{"+ "Nombre="+nombre +" Identidad="+identidad+" Fecha Nacimiento="+fechaNacimiento + " idEstudiante=" + idEstudiante + ", clases=" + clases + '}';
    }
    
   
    
}
