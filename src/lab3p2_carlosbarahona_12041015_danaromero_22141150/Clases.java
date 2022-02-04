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
public class Clases {
    private String nombreClase;
    private int codigoClase;
    
    //Consctructor
    
    public Clases (String nombreClase, int codigoClase){
        this.nombreClase=nombreClase;
        this.codigoClase=codigoClase;
    }
    
    //Setters y Getters

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }
    
    
    
}
