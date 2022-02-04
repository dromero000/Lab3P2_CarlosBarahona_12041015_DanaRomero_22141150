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
        System.out.println("Ingrese transporte: ");
        
        int opcion;
        
        do{
            System.out.println("0 - Salir\n1 - Subir alumno al transporte\n2 - Bajar alumno del transporte\n3 - Listar alumnos del transporte"
                    + "\n4 - Escoger transportista\n5 - Quitar transportista\n6 - Añadir Ruta\n7 - Quitar Ruta\n8 - Imprimir transporte\n9 - Comenzar");
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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Simulación");
                    break;
            }
            
        }while(opcion!=0 || opcion!=9);
    }
    
}
