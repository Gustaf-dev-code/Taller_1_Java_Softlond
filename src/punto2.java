import java.util.Scanner;

public class punto2 {
    public static void main(String[] args) throws Exception {
        /*
         * 2. Escribe un programa que pida al usuario un número entero y determine si es
         * par o impar.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer num: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. Ypu must enter an integer.");
            System.out.print("Enter a integer number: ");
            sc.next();
        }

        int num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            System.out.printf("The number %d is even.", num);
        } else {
            System.out.printf("The number %d is odd.", num);
        }
    }
}
