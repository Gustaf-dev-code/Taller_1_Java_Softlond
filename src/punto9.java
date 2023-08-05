import java.util.Scanner;

public class punto9 {
    public static void main(String[] args) throws Exception {
        /*
         * 9. Escribe un programa que solicite al usuario un número entero positivo y
         * calcule su factorial.
         */

        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter a positive integer number: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer number \n");
                }
            } else {
                System.out.println("Error. You must enter an integer. \n");
                sc.next();
            }
        }
        int factorial = calculateFactorial(number);
        System.out.printf("Factorial of %d is: %d", number, factorial);
        sc.close();
    }

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

}
