package intermedios;

import java.util.Scanner;

/**
 *
 * Preguntale al usuario cuantos alumnos se han presentado al examen.
 *
 * Crea un array con el n de alumnos indicado
 *
 * Rellena el array  con valores double aleatorios del 0 al 10, este sera el array de notas
 * Muestra la nota media de la clase
 */

public class Ejer6 {

    public static final int POSIBLE_CALIFICATIONS = 11;

    public static void main(String[] args) {


        System.out.println("Cuantos alumnos se han presentado al examen?");
        Scanner sc = new Scanner(System.in);
        int numberStudents = sc.nextInt();


        double[] califications = new double[numberStudents];
        for (int i = 0; i < califications.length; i++){
            califications[i] = (0 + 11 * Math.random());
        }

        double calificationsAll = 0;
        for (int i = 0; i < califications.length; i++){
            calificationsAll += califications[i];
        }
        double calificationsAvg = calificationsAll / numberStudents;

        System.out.println("La nota media de la clase es " + calificationsAvg);
    }
}
