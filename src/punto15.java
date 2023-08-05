import java.util.Scanner;

public class punto15 {
    public static void main(String[] args) {
        /*
         * 15.Crea un programa que pida al usuario un número entero y determine si es un
         * número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
         * derecha que de derecha a izquierda.
         * 
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
        if (isCapicua(number)) {
            System.out.println(number + " is a capicua number");
        } else {
            System.out.println(number + " is not a capicua number");
        }
        sc.close();
    }

    public static boolean isCapicua(int n) {
        int reversed = 0;
        int num = n;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return n == reversed;
    }
}
