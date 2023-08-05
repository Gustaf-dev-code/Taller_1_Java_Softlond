import java.util.Scanner;

public class punto12 {
    public static void main(String[] args) {

        /*
         * 12.Realiza un programa que pida al usuario un número entero y determine si es
         * un número primo o no.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. You must enter an integer. \n");
            System.out.print("Enter an integer number: ");
            sc.next();
        }
        int num = sc.nextInt();

        int flag = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                flag++;
            }
        }
        if (flag > 2 || num < 2) {
            System.out.println(num + " is not a prime number.");
        } else {
            System.out.println(num + " is a prime number.");
        }

        sc.close();
    }

}
