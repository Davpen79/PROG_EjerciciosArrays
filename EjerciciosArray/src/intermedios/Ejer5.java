package intermedios;

/**
 * Eliminar duplicados
 *
 * Crea un array de 10000 números y rellenalo con valores aleatorios entre 0 y 300
 *
 * Crea un nuevo array que elimine los numeros repetidos del array original
 *
 * Ejemplo
 *
 * original: 1, 4, 4, 5
 * nuevo:    1, 4, 5
 */

public class Ejer5 {

    public static final int NUM_TOTAL = 10000;

    public static void main(String[] args) {

        int[] listaNumeros = new int[NUM_TOTAL];

        for (int i = 0; i < listaNumeros.length; i++){

            listaNumeros[i] = (int)(0 + 301 * Math.random());
            System.out.println(listaNumeros[i]);
        }

        

        //int[] listaReducida = new int[];

    }
}
