import java.util.Scanner;

public class punto5 {
    public static void main(String[] args) throws Exception {
        /*
         * 5. Realiza un programa que solicite al usuario dos números enteros y
         * determine
         * cuál es el mayor de ellos.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. You must enter an integer.");
            System.out.print("Enter the first number: ");
            sc.next();
        }
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. You must enter an integer.");
            System.out.print("Enter the second number: ");
            sc.next();
        }
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("The larger number is: " + num1);
            System.out.println("The smaller number is: " + num2);
        } else if (num2 > num1) {
            System.out.println("The larger number is: " + num2);
            System.out.println("The smaller number is: " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
        sc.close();
    }

}
