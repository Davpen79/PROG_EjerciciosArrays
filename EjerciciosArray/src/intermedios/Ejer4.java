package intermedios;

import java.util.Scanner;

/**
 * Invertir Array
 * <p>
 * Crea un array de 5 enteros y solicita al usuario que introduzca 5 números
 * <p>
 * Crea un nuevo array y guarda en este el array del usuario invertido.
 * <p>
 * Ejemplo
 * arrayUduario  : 1, 4 ,2, 1, 7
 * arrayInvertido: 7, 1, 2, 4, 1
 */


public class Ejer4 {

    public static final int NUM_TOTAL = 5;

    public static void main(String[] args) {

        int[] listaOrdenada = new int[NUM_TOTAL];

        for (int i = 0; i < listaOrdenada.length; i++) {
            listaOrdenada[i] = getNumbers(i);
        }

        int[] listaInvertida = new int[NUM_TOTAL];
        for (int i = 0; i < listaOrdenada.length; i++) {
            listaInvertida[i] = listaOrdenada[(NUM_TOTAL - 1) - i];
        }

        for (int i = 0; i < listaInvertida.length; i++) {
            System.out.println(listaInvertida[i]);
        }

    }

    public static int getNumbers(int i) {
        System.out.println("Inserta el " + (i + 1) + " numero: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
