import java.util.Scanner;

public class punto4 {
    public static void main(String[] args) throws Exception {

        /*
         * 4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
         * o menor de edad.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. You must enter an integer.");
            System.out.print("Enter a integer number: ");
            sc.next();
        }

        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are of legal age.");
        } else {
            System.out.println("You are a minor.");
        }
        sc.close();
    }
}
