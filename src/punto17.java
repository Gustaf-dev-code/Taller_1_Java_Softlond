import java.util.ArrayList;
import java.util.Scanner;

public class punto17 {
    public static void main(String[] args) {

        /*
         * 17.Pide al usuario dos números enteros y muestra todos los números primos
         * que se encuentran en ese rango.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. You must enter an integer. \n");
            System.out.print("Enter an integer number: ");
            sc.next();
        }
        int num = sc.nextInt();
        sc.close();

        if (isPrime(num)) {
            ArrayList<Integer> prim = new ArrayList<>();
            ArrayList<Integer> primes = primeNum(num, 0, prim);
            System.out.printf("The prime numbers of the number %d are: ", num);
            for (Integer digit : primes) {
                System.out.print(digit + " ");
            }
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }

    public static ArrayList<Integer> primeNum(int n, int flag, ArrayList<Integer> primes) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                flag++;
            }
        }
        if (n == 1) {
            return primes;
        }
        if (flag <= 2) {
            primes.add(n);
        }

        flag = 0;
        return primeNum(n - 1, flag, primes);

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
