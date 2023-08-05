public class punto10 {
    public static void main(String[] args) {

        /*
         * 10.Ejercicio 10: Crea un programa que muestre los primeros 20 números de la
         * serie Fibonacci. La serie Fibonacci se forma sumando los dos números
         * anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, ...
         */

        System.out.println("Fibonacci Series (First 20 numbers):");
        for (int i = 0; i < 20; i++) {
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
