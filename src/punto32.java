import java.util.Arrays;
import java.util.Scanner;

public class punto32 {
    public static void main(String[] args) {
        /*
         * Buscar un elemento: Escribe un programa que busque un número específico
         * en un arreglo y muestre su índice (o un mensaje si no se encuentra).
         */

        int[] numArray = new int[10];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 100);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search for: ");
        int num = sc.nextInt();
        int position = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == num) {
                position = i;
                break;
            }
        }
        if (position == 0) {
            System.out.println(num + " is not in the array");
            System.out.println("These are the numbers on the list:" + Arrays.toString(numArray));
        } else {
            System.out.println("Number found!, The index of num " + num + " is: " + position);
        }
        sc.close();

    }
}
