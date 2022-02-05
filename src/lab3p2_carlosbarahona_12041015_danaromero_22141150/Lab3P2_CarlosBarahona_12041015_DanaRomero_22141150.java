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
                            if (item3 <= clases.size()) {
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
                                int capMax = sillas + personasPie;
                                ArrayList<Estaciones> estacioness = new ArrayList();
                                ArrayList<Alumnos> alumnos = new ArrayList();
                                transportes.add(new Bus(sillas, personasPie, placa, color, tr, capMax, estaciones, alumnos));

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
                                ArrayList<Alumnos> alumnos = new ArrayList();
                                int cantMax = sillas;
                                Transportistas tr = null;
                                ArrayList<Estaciones> estacioness = new ArrayList();
                                transportes.add(new Rapidito(sillas, placa, color, tr, cantMax, estacioness, alumnos));

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
                                ArrayList<Estaciones> estacioness = new ArrayList();
                                ArrayList<Alumnos> alumnos = new ArrayList();
                                Transportistas tr = null;
                                int cantMax = 4;
                                transportes.add(new Taxi(numTaxi, placa, color, tr, cantMax, estacioness, alumnos));

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
                                ArrayList<Alumnos> alumnos = new ArrayList();
                                int cantMax = 2;
                                ArrayList<Estaciones> estacioness = new ArrayList();
                                transportes.add(new Mototaxi(placa, color, tr, cantMax, estacioness, alumnos));

                                break;
                            }

                        }
                    }

                    break;
                }
                case 7: {
                    System.out.println("Menú de Simulación");

                    System.out.print("Ingrese la posición del transporte: ");
                    int posicion = s.nextInt();
                    Transporte transporte = transportes.get(posicion);

                    int opcion8;

                    do {
                        System.out.println("0 - Salir\n1 - Subir alumno al transporte\n2 - Bajar alumno del transporte\n3 - Listar alumnos del transporte"
                                + "\n4 - Escoger transportista\n5 - Quitar transportista\n6 - Añadir Estación\n7 - Quitar Estación\n8 - Imprimir transporte\n9 - Comenzar");
                        System.out.print("Seleccione una opción: ");
                        opcion8 = s.nextInt();
                        switch (opcion8) {
                            case 0:
                                System.out.println("Gracias");
                                break;
                            case 1:
                                System.out.print("Ingrese el ID del alumno que desea subir al transporte: ");
                                int id = s.nextInt();
                                int item2 = 0;

                                for (int z = 0; z < personas.size(); z++) {
                                    int idAlumno2 = 0;
                                    if (personas.get(z) instanceof Alumnos) {
                                        idAlumno2 = ((Alumnos) personas.get(z)).getIdEstudiante();
                                    }
                                    if (id == idAlumno2) {
                                        item2 = z;
                                        z = personas.size();
                                    } else {
                                        item2 = 100000;
                                    }

                                }

                                if (item2 <= personas.size()) {
                                    if (personas.get(item2) instanceof Alumnos) {
                                        try {

                                            transportes.get(posicion)
                                                    .getAlumnos().add((Alumnos) personas.get(item2));
                                        } catch (Exception e) {
                                            System.out.println("La posicion del transporte es incorrecta.");
                                        }

                                    }
                                } else {
                                    System.out.println("No se encontro el ID del alumno");
                                }
                                break;
                            case 2:
                                System.out.print("Ingrese el ID del alumno que desea bajar del transporte: ");
                                int id2 = s.nextInt();
                                int item3 = 0;

                                for (int z = 0; z < transportes.get(posicion).getAlumnos().size(); z++) {
                                    int idAlumno2 = 0;
                                    if (personas.get(z) instanceof Alumnos) {
                                        idAlumno2 = ((Alumnos) transportes.get(posicion).getAlumnos().get(z)).getIdEstudiante();
                                    }
                                    if (id2 == idAlumno2) {
                                        item3 = z;
                                        z = transportes.get(posicion).getAlumnos().size();
                                    } else {
                                        item3 = 100000;
                                    }

                                }

                                if (item3 <= personas.size()) {
                                    if (personas.get(item3) instanceof Alumnos) {
                                        try {

                                            transportes.get(posicion)
                                                    .getAlumnos().remove(item3);
                                        } catch (Exception e) {
                                            System.out.println("La posicion del transporte es incorrecta.");
                                        }

                                    }
                                } else {
                                    System.out.println("No se encontro el ID del alumno");
                                }

                                break;
                            case 3:
                                System.out.println("Listar alumnos del transporte");
                                for (int o = 0; o < transportes.get(posicion).getAlumnos().size(); o++) {

                                    System.out.println(transportes.get(posicion).getAlumnos().get(o));

                                }
                                break;
                            case 4:
                                System.out.println("Escoger Transportista");
                                System.out.print("Ingrese el apodo del transportista que desea que conduzca el transporte: ");
                                s.nextLine();
                                String apodo = s.nextLine();
                                int item4 = 0;

                                for (int z = 0; z < personas.size(); z++) {
                                    String apodo2 = "";
                                    if (personas.get(z) instanceof Transportistas) {
                                        apodo2 = ((Transportistas) personas.get(z)).getApodo();
                                    }
                                    if (apodo.equals(apodo2)) {
                                        item4 = z;
                                        z = personas.size();
                                    } else {
                                        item4 = 100000;
                                    }

                                }

                                if (item4 <= personas.size()) {
                                    if (personas.get(item4) instanceof Transportistas) {
                                        try {

                                            transportes.get(posicion)
                                                    .setTransportista((Transportistas) personas.get(item4));
                                        } catch (Exception e) {
                                            System.out.println("La posicion del transporte es incorrecta.");
                                        }

                                    }
                                } else {
                                    System.out.println("No se encontro el apodo del transportista");
                                }
                                break;
                            case 5:
                                System.out.println("Quitar transportista");
                                System.out.print("Ingrese el apodo del transportista que desea que quitar del transporte: ");
                                s.nextLine();
                                String apodo2 = s.nextLine();
                                int item5 = 0;

                                for (int z = 0; z < personas.size(); z++) {
                                    String apodo3 = "";
                                    if (personas.get(z) instanceof Transportistas) {
                                        apodo3 = ((Transportistas) personas.get(z)).getApodo();
                                    }
                                    if (apodo2.equals(apodo3)) {
                                        item5 = z;
                                        z = personas.size();
                                    } else {
                                        item5 = 100000;
                                    }

                                }

                                if (item5 <= personas.size()) {
                                    if (personas.get(item5) instanceof Transportistas) {
                                        try {
                                            Transportistas tr2 = null;

                                            transportes.get(posicion)
                                                    .setTransportista(tr2);
                                        } catch (Exception e) {
                                            System.out.println("La posicion del transporte es incorrecta.");
                                        }

                                    }
                                } else {
                                    System.out.println("No se encontro el apodo del transportista");
                                }
                                break;
                            case 6:
                                System.out.print("Ingrese el nombre de la estacion que desea agregar al transporte: ");
                                s.nextLine();
                                String nombreEstacion = s.nextLine();
                                int item6 = 0;

                                for (int z = 0; z < estaciones.size(); z++) {
                                    String estacion2 = "";
                                    if (estaciones.get(z) instanceof Estaciones) {
                                        estacion2 = ((Estaciones) estaciones.get(z)).getNombre();
                                    }
                                    if (nombreEstacion.equals(estacion2)) {
                                        item6 = z;
                                        z = estaciones.size();
                                    } else {
                                        item6 = 100000;
                                    }

                                }

                                if (item6 <= estaciones.size()) {
                                    if (estaciones.get(item6) instanceof Estaciones) {
                                        try {

                                            transportes.get(posicion)
                                                    .getEstaciones().add(estaciones.get(item6));
                                        } catch (Exception e) {
                                            System.out.println("La posicion del transporte es incorrecta.");
                                        }

                                    }
                                } else {
                                    System.out.println("No se encontro el apodo del transportista");
                                }
                                break;
                            case 7:
                                System.out.print("Ingrese el nombre de la estacion que desea quitar al transporte: ");
                                s.nextLine();
                                String nombreEstacion2 = s.nextLine();
                                int item7 = 0;

                                for (int z = 0; z < transportes.get(posicion).getEstaciones().size(); z++) {
                                    String estacion2 = "";
                                    if (transportes.get(posicion).getEstaciones().get(z) instanceof Estaciones) {
                                        estacion2 = ((Estaciones) transportes.get(posicion).getEstaciones().get(z)).getNombre();
                                    }
                                    if (nombreEstacion2.equals(estacion2)) {
                                        item7 = z;
                                        z = transportes.get(posicion).getEstaciones().size();
                                    } else {
                                        item7 = 100000;
                                    }

                                }

                                if (item7 <= estaciones.size()) {
                                    if (estaciones.get(item7) instanceof Estaciones) {
                                        try {

                                            transportes.get(posicion)
                                                    .getEstaciones().remove(item7);
                                        } catch (Exception e) {
                                            System.out.println("La posicion del transporte es incorrecta.");
                                        }

                                    }
                                } else {
                                    System.out.println("No se encontro el apodo del transportista");
                                }
                                break;
                            case 8:
                                System.out.println(transportes.get(posicion));

                                break;
                            case 9:
                                System.out.println("Simulación");
                                simulacion(transportes.get(posicion), 0, 0, transportes.get(posicion).estaciones.size());
                                break;
                        }

                    } while (opcion != 0 || opcion != 9);

                    break;
                }
                case 8: {
                    for (int f = 0; f < clases.size(); f++) {
                        if (clases.get(f) instanceof Clases) {
                            System.out.println(clases.get(f));

                        }
                    }
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

    public static void simulacion(Transporte transporte, int x1, int y1, int n) {
        if (n > 0) {
            Estaciones siguienteEstacion = transporte.estaciones.get(0);
            double distancia = distancia(x1, y1, transporte.estaciones.get(0).x, transporte.estaciones.get(0).y);
            for (Estaciones estacion : transporte.estaciones) {
                double distancia2 = distancia(x1, y1, estacion.x, estacion.y);
                if (distancia2 < distancia) {
                    siguienteEstacion = estacion;
                    distancia = distancia2;
                }
            }
            System.out.println("Vamos a la estación " + siguienteEstacion);
            System.out.println("Alumnos en el transporte:");
            for (int h = 0; h < transporte.alumnos.size(); h++) {

                System.out.println(transporte.alumnos.get(h));

            }
            Random r = new Random();

            int cantidadAlumnos = transporte.alumnos.size() / n;
            for (int d = 0; d < cantidadAlumnos; d++) {
                int remover = r.nextInt((transporte.alumnos.size() - 0) + 1) + 0;
                transporte.alumnos.remove(remover);
            }
            System.out.println("Cantidad de alumnos que se bajan " + cantidadAlumnos);
            transporte.estaciones.remove(siguienteEstacion);
            n = transporte.estaciones.size();
            simulacion(transporte, siguienteEstacion.x, siguienteEstacion.y, n);

        } else {
            Transportistas tr5 = null;
            transporte.setTransportista(tr5);
        }

    }

    public static double distancia(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

}
