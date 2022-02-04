/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona_12041015_danaromero_22141150;

import java.util.Scanner;

/**
 *
 * @author Dana Romero
 */
public class MainPrueba {
    
    public static void main(String[] args) {
        System.out.println("Menú de Simulación");
        Scanner leer = new Scanner (System.in);
        System.out.println("1 - Bus\n2 - Rapidito\n3 - Taxi\n4 - Mototaxi");
        System.out.print("Seleccione un transporte: ");
        int transporteNum = leer.nextInt();
        System.out.print("Ingrese la posición de ese transporte: ");
        int posicion = leer.nextInt();
        Transporte transporte;
        /* Aquí seleccionaríamos el transporte según su posición en el arraylist
        switch(transporteNum){
            case 1:
                break;
        }*/
        
        int opcion;
        
        do{
            System.out.println("0 - Salir\n1 - Subir alumno al transporte\n2 - Bajar alumno del transporte\n3 - Listar alumnos del transporte"
                    + "\n4 - Escoger transportista\n5 - Quitar transportista\n6 - Añadir Estación\n7 - Quitar Estación\n8 - Imprimir transporte\n9 - Comenzar");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Gracias");
                    break;
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = leer.nextLine();
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Listar alumnos del transporte");
                    //for each del arraylist de alumnos
                    //dentro del for each:  alumnos.toString();
                    break;
                case 4:
                    System.out.println("Escoger Transportista");
                    break;
                case 5:
                    System.out.println("Quitar transportista");
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    //transporte.toString();
                    break;
                case 9:
                    System.out.println("Simulación");
                    break;
            }
            
        }while(opcion!=0 || opcion!=9);
    }
    
    public static void simulacion(Transporte transporte,int x1,int y1){
        Estaciones siguienteEstacion=transporte.estaciones.get(0);
        double distancia=distancia(x1,y1,transporte.estaciones.get(0).x,transporte.estaciones.get(0).y);
        for(Estaciones estacion: transporte.estaciones){
            double distancia2 = distancia(x1,y1,estacion.x,estacion.y);
            if (distancia2<distancia){
                siguienteEstacion= estacion; 
            }
        }
        System.out.println("Vamos a la estación "+ siguienteEstacion);
        transporte.estaciones.remove(siguienteEstacion);
        simulacion(transporte, siguienteEstacion.x,siguienteEstacion.y);

    }

    
    public static double distancia(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
    
}
