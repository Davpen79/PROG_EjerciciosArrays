package basicos;

import java.util.Scanner;

/**
 * Cuenta de ocurrencias
 * <p>
 * Crea un array de 10000 elementos, rellenandolo con valores enteros aleatorios del 0 al 5
 * <p>
 * Pregúntale al usuario por un numero del 0 al 5 y busca cuantas veces existe en el array.
 *
 */

public class Ejer3 {

    public static final int NUM_TOTAL = 10000;

    public static void main(String[] args) {

        int[] listaNumeros = new int[NUM_TOTAL];

        for (int i = 0; i < listaNumeros.length; i++) {

            listaNumeros[i] = (int) (0 + 6 * Math.random());
        }

        int userNumber = getUserNumber();
        int numberOcurrences = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] == userNumber) {
                numberOcurrences++;
            }
        }
        System.out.println(userNumber + " aparece " + numberOcurrences + " veces.");

    }

    public static int getUserNumber() {

        System.out.println("Elige un numero entre 0 y 5");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
