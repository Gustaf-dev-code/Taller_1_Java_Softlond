import java.util.Scanner;

public class punto16 {
    public static void main(String[] args) {
        /*
         * 16.Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
         * número dado ingresado por el usuario.
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
        sc.close();
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
