package basicos;

/**
 * Busca el mayor
 * <p>
 * Crea un array de 1000 elementos, rellena cada hueco con un número aleatorio de 0 a 10000.
 * <p>
 * Recorre el array buscando el numero más grande dentro del array
 * <p>
 * Muestra dicho número
 */

public class Ejer2 {

    public static final int NUM_ENTEROS = 1000;
    public static int maxNumber = Integer.MIN_VALUE;

    public static void main(String[] args) {

        int[] listaEnteros = new int[NUM_ENTEROS];

        for (int i = 0; i < listaEnteros.length; i++) {
            listaEnteros[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < listaEnteros.length; i++) {

            if (listaEnteros[i] > maxNumber) {
                maxNumber = listaEnteros[i];
            }
        }
        System.out.println("El numero mas grande es " + maxNumber);

    }
}
