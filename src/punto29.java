import java.util.Arrays;

public class punto29 {
    public static void main(String[] args) {
        /*
         * Encontrar el número más grande: Crea un programa que encuentre el número
         * más grande en un arreglo de enteros.
         */

        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 101);
        }
        int largerNum = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > largerNum) {
                largerNum = arreglo[i];
            }
        }
        System.out.println("The list of items are: " + Arrays.toString(arreglo));
        System.out.println("The larger number of the items is: " + largerNum);

    }

}
