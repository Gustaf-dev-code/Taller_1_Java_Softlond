import java.util.Scanner;

public class punto6 {
    public static void main(String[] args) {
        /*
         * 6.Escribe un programa que pida al usuario un número y verifique si es
         * positivo,
         * negativo o cero.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Error. You must enter a number.");
            System.out.print("Enter a number: ");
            sc.next();
        }
        double num = sc.nextDouble();
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }
        sc.close();
    }

}
