package Main;

import java.util.Scanner;

import Clases.Cine;
import Clases.Pelicula;
import Clases.Sala;

public class Main {
    public static void main(String[] args) {
//Esto son las variables
        Cine cine = new Cine("YELMOCINES", 300, 3,3,4);
        int fila;
        int columna;
        int gmail;
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            // Los sysos para la informacion del menu
            System.out.println("Bienvenido al cine " + cine.getNombre());
            System.out.println("1. Ver salas y películas");
            System.out.println("2. Reservar butaca");
            System.out.println("3. Ver matriz de butacas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            //Las diferentes opciones de los menus
            switch (opcion) {
                case 1:
                    cine.sacarpeliculasalas1();
                    break;
                case 2:
                    System.out.println("Introduce la fila;");
                    fila = sc.nextInt();
                    System.out.println("Introduce la columna;");
                    columna=sc.nextInt();
                case 3:
                case 4: 
                    System.out.println("Introduce Gmail:");
                    gmail = sc.nextInt();
                case 5:
                    System.out.println("Gracias por visitar " + cine.getNombre());
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        sc.close();
    }
}