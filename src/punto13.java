import java.util.Scanner;

public class punto13 {
    public static void main(String[] args) {
        /*
         * Pide al usuario un número decimal y muestra su valor redondeado a un
         * número específico de decimales
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();
        System.out.print("Enter the desired number of decimal places after the dot: ");
        int decimal = sc.nextInt();
        String arounded = String.format("%." + decimal + "f", num);
        System.out.printf("The number rounded to %d decimal places is: %s", decimal, arounded);
        sc.close();
    }

}
