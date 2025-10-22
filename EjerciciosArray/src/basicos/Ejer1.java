package basicos;

import java.util.Scanner;

/**
 * Suma de elementos
 * <p>
 * Crea un array de 5 numeros enteros, solicita al usuario que introduzca dichos numeros por consola.
 * <p>
 * Una vez el array este relleno tienes que sumar todos los números del array y mostrar el resultado
 */

public class Ejer1 {

    public static final int NUM_ENTEROS = 5;
    public static int sumaTotal;

    public static void main(String[] args) {

        int[] arrayEnteros = new int[NUM_ENTEROS];

        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = getNumbers(i);

        }

        for (int i = 0; i < arrayEnteros.length; i++) {

            sumaTotal += arrayEnteros[i];
        }
        System.out.println("La suma es " + sumaTotal);

    }

    public static int getNumbers(int i) {
        System.out.println("Inserta el " + (i + 1) + " numero: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
