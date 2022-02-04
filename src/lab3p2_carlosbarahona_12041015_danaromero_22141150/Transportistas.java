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
public class Transportistas extends Personas {

    private int añosExperiencia;
    private String apodo;

    public Transportistas(int añosExperiencia, String apodo, String nombre, int identidad, String fechaNacimiento) {
        super(nombre, identidad, fechaNacimiento);
        this.añosExperiencia = añosExperiencia;
        this.apodo = apodo;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Transportistas{" + "a\u00f1os Experiencia=" + añosExperiencia + ", apodo=" + apodo + '}';
    }

}
