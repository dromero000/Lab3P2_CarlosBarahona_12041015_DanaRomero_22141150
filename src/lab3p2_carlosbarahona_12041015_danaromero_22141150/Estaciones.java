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
public class Estaciones {
    
    //Atributos
    String nombre;
    int x;
    int y;
    
    //Constructor
    public Estaciones(String nombre, int x, int y){
        this.nombre = nombre;
        this.x = x;
        this.y=y;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Estaciones{" + "nombre=" + nombre + ", x=" + x + ", y=" + y + '}';
    }
    
    
}
