import java.util.Arrays;

public class punto31 {
    public static void main(String[] args) {
        /*
         * Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
         * el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
         * de manera ascendente.
         */

        int[] numArray = new int[5];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numArray));
        for (int i = 0; i < (numArray.length); i++) {
            for (int j = i + 1; j < (numArray.length); j++) {
                if (numArray[i] > numArray[j]) {
                    int aux = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = aux;
                }

            }

        }
        System.out.println(Arrays.toString(numArray));
    }

}
