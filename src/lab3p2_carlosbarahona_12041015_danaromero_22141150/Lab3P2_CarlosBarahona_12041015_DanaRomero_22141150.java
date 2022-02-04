/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona_12041015_danaromero_22141150;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab3P2_CarlosBarahona_12041015_DanaRomero_22141150 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Personas> personas = new ArrayList();
        ArrayList<Transporte> transportes = new ArrayList();
        ArrayList<Estaciones> estaciones = new ArrayList();
        ArrayList<Clases> clases = new ArrayList();

        int opcion = 12;
        while (opcion != 0) {
            System.out.println("Bienvenido a Discovery Route Program, ¿que desea hoy?\n"
                    + "0) Salir\n"
                    + "1) Crear Clase\n"
                    + "2) Crear Ruta\n"
                    + "3) Crear Alumno\n"
                    + "4) Agregar Clase a Alumno\n"
                    + "5) Crear Transportista\n"
                    + "6) Crear Transporte\n"
                    + "7) Simulacion\n"
                    + "8) Listar Clases\n"
                    + "9) Listar Alumnos\n"
                    + "10) Listar Transportistas\n"
                    + "11) Listar Transportes");
            opcion = s.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("---Creacion de Clase---");
                    System.out.println("Ingrese el nombre de la clase");
                    s.nextLine();
                    String nombreClase = s.nextLine();
                    System.out.println("Ingrese el codigo de la clase");
                    int codigo = s.nextInt();
                     clases.add(new Clases(nombreClase, codigo));

                    break;
                }
                case 2: {
                    System.out.println("---Creación de Ruta---");
                    System.out.println("Ingrese el nombre de la ruta");
                    s.nextLine();
                    String nombre = s.nextLine();

                    System.out.println("Ingrese la coordenada en X de la ruta");
                    int x = s.nextInt();
                    System.out.println("Ingrese la coordenada en y de la ruta");
                    int y = s.nextInt();
                    estaciones.add(new Estaciones(nombre, x, y));
                    break;
                }
                case 3: {
                    System.out.println("---Creación de Alumno---");
                    System.out.println("Ingrese el nombre del alumno");
                    s.nextLine();
                    String nombreAlumno = s.nextLine();
                    System.out.println("Ingrese la identidad del alumno");
                    int id = s.nextInt();
                    for (int x = 0; x < personas.size(); x++) {
                        int ID = 0;

                        if (personas.get(x) instanceof Alumnos) {
                            ID = ((Alumnos) personas.get(x)).getIdentidad();
                        }

                        while (id == ID) {
                            System.out.println("Ingrese un numero de identidad del alumno que no este tomado");
                            id = s.nextInt();
                        }
                    }
                    s.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento");
                    String fechaNacimiento = s.nextLine();
                    System.out.println("Ingrese la ID de alumno del alumno");
                    int idAlumno = s.nextInt();
                    for (int x = 0; x < personas.size(); x++) {
                        int ID = 0;

                        if (personas.get(x) instanceof Alumnos) {
                            ID = ((Alumnos) personas.get(x)).getIdEstudiante();
                        }

                        while (idAlumno == ID) {
                            System.out.println("Ingrese un numero de identidad del alumno que no este tomado");
                            idAlumno = s.nextInt();
                        }
                    }
                    ArrayList<Clases> clases2 = new ArrayList();
                    personas.add(new Alumnos(idAlumno, clases2, nombreAlumno, id, fechaNacimiento));
                    break;
                }
                case 4: {
                    System.out.println("---Agregar Clase a Alumno---");
                    System.out.println("Ingrese el ID de alumno del alumno que desea agregarle la clase");
                    int idAlumno = s.nextInt();
                    int item2 = 0;

                    for (int z = 0; z < personas.size(); z++) {
                        int idAlumno2 = 0;
                        if (personas.get(z) instanceof Alumnos) {
                            idAlumno2 = ((Alumnos) personas.get(z)).getIdEstudiante();
                        }
                        if (idAlumno == idAlumno2) {
                            item2 = z;
                            z = personas.size();
                        } else {
                            item2 = 100000;
                        }
                    }
                    if (item2 <= personas.size()) {
                        if (personas.get(item2) instanceof Alumnos) {
                            System.out.println("Ingrese el codigo de la clase que desea agregarle al alumno");
                            int codigo = s.nextInt();
                            int item3 = 0;

                            for (int b = 0; b < clases.size(); b++) {
                                int codigo2 = 0;
                                if (clases.get(b) instanceof Clases) {
                                    codigo2 = ((Clases) clases.get(b)).getCodigoClase();
                                }
                                if (codigo == codigo2) {
                                    item3 = b;
                                    b = clases.size();
                                } else {
                                    item3 = 100000;
                                }
                            }
                            if (item3 <= personas.size()) {
                                if (clases.get(item3) instanceof Clases) {
                                    try {

                                       ((Alumnos) personas.get(item2)).getClases().add(clases.get(item3));
                                    } catch (Exception e) {
                                        System.out.println("Hubo un error.");
                                    }
                                 
                                }
                            } else {
                                System.out.println("No se encontro el codigo de la clase");
                            }

                        }
                    } else {
                        System.out.println("No se encontro el ID del alumno");
                    }
                    break;
                }

                case 5: {
                    System.out.println("---Creación de Tranportista---");
                    System.out.println("Ingrese el nombre del transportista");
                    s.nextLine();
                    String nombreAlumno = s.nextLine();

                    System.out.println("Ingrese la identidad del transportista");
                    int id = s.nextInt();
                    for (int x = 0; x < personas.size(); x++) {
                        int ID = 0;

                        if (personas.get(x) instanceof Transportistas) {
                            ID = ((Transportistas) personas.get(x)).getIdentidad();
                        }

                        while (id == ID) {
                            System.out.println("Ingrese un numero de identidad del transportista que no este tomado");
                            id = s.nextInt();
                        }
                    }
                    s.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento");
                    String fechaNacimiento = s.nextLine();
                    System.out.println("Ingrese los años de experiencia del transportista");
                    int añosExperiencia = s.nextInt();
                    System.out.println("Ingrese el apodo del transportista");
                    s.nextLine();
                    String apodo = s.nextLine();
                    personas.add(new Transportistas(añosExperiencia, apodo, nombreAlumno, id, fechaNacimiento));

                    break;
                }
                case 6: {
                    int opcion2 = 12;
                    while (opcion2 != 0) {
                        System.out.println("¿Que tipo de transporte desea crear?\n"
                                + "0) Salir\n"
                                + "1) Bus\n"
                                + "2) Rapidito\n"
                                + "3) Taxi\n"
                                + "4) Mototaxi"
                        );
                        opcion2 = s.nextInt();
                        switch (opcion2) {
                            case 1: {
                                System.out.println("---Creacion de Bus---");
                                System.out.println("Escriba la placa del bus");
                                String placa = s.next();
                                for (int c = 0; c < transportes.size(); c++) {
                                    String placaT = "";

                                    placaT = ((Transporte) transportes.get(c)).getPlaca();

                                    while (placa.equals(placaT)) {
                                        System.out.println("Ingrese una placa de bus que no este tomado");
                                        placaT = s.next();
                                    }
                                }
                                System.out.println("Escriba el color del bus");
                                String color = s.nextLine();
                                System.out.println("Escriba el numero de sillas que tiene el bus");
                                int sillas = s.nextInt();
                                System.out.println("Escribala capacidad de personas de pie");
                                int personasPie = s.nextInt();
                                Transportistas tr = null;
                                int capMax = 0;
                                transportes.add(new Bus(placa, color, tr, sillas, personasPie, capMax));

                                break;
                            }
                            case 2: {
                                System.out.println("---Creacion de Rapidito---");
                                System.out.println("Escriba la placa del rapidito");
                                String placa = s.next();
                                for (int c = 0; c < transportes.size(); c++) {
                                    String placaT = "";

                                    placaT = ((Transporte) transportes.get(c)).getPlaca();

                                    while (placa.equals(placaT)) {
                                        System.out.println("Ingrese una placa de rapidito que no este tomado");
                                        placaT = s.next();
                                    }
                                }
                                System.out.println("Escriba el color del rapidito");
                                String color = s.nextLine();
                                System.out.println("Escriba el numero de sillas que tiene el rapidito");
                                int sillas = s.nextInt();

                                Transportistas tr = null;
                                transportes.add(new Rapidito(placa, color, tr, sillas));

                                break;
                            }
                            case 3: {
                                System.out.println("---Creacion de Taxi---");
                                System.out.println("Escriba la placa del taxi");
                                String placa = s.next();
                                for (int c = 0; c < transportes.size(); c++) {
                                    String placaT = "";

                                    placaT = ((Transporte) transportes.get(c)).getPlaca();

                                    while (placa.equals(placaT)) {
                                        System.out.println("Ingrese una placa de taxi que no este tomado");
                                        placaT = s.next();
                                    }
                                }
                                System.out.println("Escriba el color del taxi");
                                String color = s.nextLine();
                                System.out.println("Escriba el numero de taxi que tiene el taxi");
                                int numTaxi = s.nextInt();

                                Transportistas tr = null;
                                transportes.add(new Taxi(numTaxi, placa, color, tr));

                                break;
                            }
                            case 4: {
                                System.out.println("---Creacion de Mototaxi---");
                                System.out.println("Escriba la placa de la mototaxi");
                                String placa = s.next();
                                for (int c = 0; c < transportes.size(); c++) {
                                    String placaT = "";

                                    placaT = ((Transporte) transportes.get(c)).getPlaca();

                                    while (placa.equals(placaT)) {
                                        System.out.println("Ingrese una placa de mototaxi que no este tomado");
                                        placaT = s.next();
                                    }
                                }
                                System.out.println("Escriba el color de la mototaxi");
                                String color = s.nextLine();
                                Transportistas tr = null;

                                transportes.add(new Mototaxi(placa, color, tr));

                                break;
                            }

                        }
                    }

                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    break;
                }
                case 9: {
                    for (int h = 0; h < estaciones.size(); h++) {
                        if (estaciones.get(h) instanceof Estaciones) {
                            System.out.println(estaciones.get(h));

                        }
                    }

                    break;
                }
                case 10: {
                    for (int o = 0; o < personas.size(); o++) {
                        if (personas.get(o) instanceof Alumnos) {
                            System.out.println(personas.get(o));

                        }
                    }
                    break;
                }
                case 11: {
                    for (int p = 0; p < personas.size(); p++) {
                        if (personas.get(p) instanceof Transportistas) {
                            System.out.println(personas.get(p));

                        }
                    }
                    break;
                }
                case 12: {
                    for (int n = 0; n < transportes.size(); n++) {

                        System.out.println(transportes.get(n));

                    }
                    break;
                }

            }
        }

    }

}
