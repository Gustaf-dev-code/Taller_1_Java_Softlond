import java.util.Arrays;
import java.util.Random;

public class punto28 {
    public static void main(String[] args) {
        /*
         * 28. Suma de elementos: Escribe un programa que calcule la suma de todos los
         * elementos en un arreglo de enteros.
         */

        int limit = 20;
        int[] arr = new int[20];
        Random rand = new Random();

        for (int i = 0; i < limit; i++) {
            arr[i] = rand.nextInt(100);
        }
        int suma = 0;

        for (int num : arr) {
            suma += num;
        }

        System.out.println("Elements to add:" + Arrays.toString(arr));
        System.out.printf("The sum of all elements is: %s ", suma);

    }

}
