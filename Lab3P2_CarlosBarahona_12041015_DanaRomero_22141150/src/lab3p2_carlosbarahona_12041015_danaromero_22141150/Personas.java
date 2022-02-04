/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona_12041015_danaromero_22141150;

/**
 *
 * @author Admin
 */
public class Personas {

    private String nombre;
    private int identidad;
    private String fechaNacimiento;

    public Personas(String nombre, int identidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", identidad=" + identidad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
