import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class punto34 {
    public static void main(String[] args) {
        /*
         * 34. Rotación de elementos: Implementa un programa que rote los elementos de
         * un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.
         */

        Scanner sc = new Scanner(System.in);
        String[] frutas = { "Mango", "Pera", "Banano", "Uva", "Fresa", "Melocoton", "Sandia", "Coco", "Ciruela",
                "Manzana" };
        List<String> fruits = new ArrayList<>(List.of(frutas));
        System.out.print("Enter the number of positions to rotate: ");
        int numPosition = sc.nextInt();
        System.out.println("Original fruit list: " + Arrays.toString(frutas) + "\n");
        System.out.println("Do you want to rotate left or right? ");
        System.out.print("Digit R(right) or L(left): ");
        char direction = sc.next().charAt(0);
        char directionUppercase = Character.toUpperCase(direction);
        if (directionUppercase == 'L') {
            rotateLeft(fruits, numPosition);
            System.out.println("Rotated fruit list: " + fruits);
        } else if (directionUppercase == 'R') {
            rotateRight(fruits, numPosition);
            System.out.println("Rotated fruit list: " + fruits);
        }
        sc.close();

    }

    public static void rotateLeft(List<String> fruits, int numPosition) {
        Collections.rotate(fruits, -numPosition);
    }

    public static void rotateRight(List<String> fruits, int numPosition) {
        Collections.rotate(fruits, numPosition);
    }

}
