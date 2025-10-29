package intermedios;

import java.util.Arrays;
import java.util.Random;

/**
 * Eliminar duplicados
 * <p>
 * Crea un array de 10000 números y rellenalo con valores aleatorios entre 0 y 300
 * <p>
 * Crea un nuevo array que elimine los numeros repetidos del array original
 * <p>
 * Ejemplo
 * <p>
 * original: 1, 4, 4, 5
 * nuevo:    1, 4, 5
 */

public class Ejer5 {

    public static final int NUM_TOTAL = 10000;
    public static final int MAX_VALUE = 10000;

    public static void main(String[] args) {

        int[] listaNumeros = new int[NUM_TOTAL];
        int[] listaReducida = new int[MAX_VALUE];
        //Guarda cuantos números he añadido a la lista sin duplicado (o lista reducida)
        int count = 0;

        for (int i = 0; i < listaNumeros.length; i++) {

            listaNumeros[i] = (int) (0 + 301 * Math.random());
            System.out.print(listaNumeros[i] + ", ");
        }

        System.out.println("==========\n==========");

        for (int i = 0; i < listaNumeros.length; i++) {
            int numeroAComprobar = listaNumeros[i];
            if (!comprobarIsNumberInArray(numeroAComprobar, listaReducida, count)) {
                listaReducida[count] = numeroAComprobar;
                count++;
            }
        }

        System.out.print(Arrays.toString(listaReducida));

    }

    private static boolean comprobarIsNumberInArray(int numeroAComprobar, int[] listaReducida, int count) {
        for (int i = 0; i < count; i++) {
            if (numeroAComprobar == listaReducida[i]) {
                return true;
            }
        }
        return false;

    }

}
