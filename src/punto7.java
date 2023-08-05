import java.util.Scanner;

public class punto7 {
    public static void main(String[] args) {
        /*
         * Crea un programa que pida al usuario un número entero positivo y muestre
         * su tabla de multiplicar hasta el 10.
         */

        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter a positive integer number: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer number \n");
                }
            } else {
                System.out.println("Error. You must enter an integer. \n");
                sc.next();
            }
        }
        System.out.println("Multiplication table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
        sc.close();
    }

}
