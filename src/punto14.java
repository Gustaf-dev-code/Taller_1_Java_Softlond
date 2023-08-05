import java.util.Scanner;

public class punto14 {
    public static void main(String[] args) {
        /*
         * 14.Escribe un programa que solicite al usuario un número entero positivo y
         * verifique si es un número perfecto. Un número perfecto es aquel cuya suma
         * de sus divisores propios (excluyendo al propio número) es igual al número.
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

        if (isPerfect(number, 1, 0)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        sc.close();

    }

    public static boolean isPerfect(int num, int divisor, int sum) {
        if (divisor >= num) {
            return num == sum;
        }

        if (num % divisor == 0) {
            sum += divisor;
        }

        return isPerfect(num, divisor + 1, sum);
    }
}
