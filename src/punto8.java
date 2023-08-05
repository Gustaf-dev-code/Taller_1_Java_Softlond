import java.util.Scanner;

public class punto8 {
    public static void main(String[] args) {
        /*
         * 8. Realiza un programa que simule un juego de adivinar un número. El
         * programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
         * adivinarlo. El programa debe indicar si el número ingresado es mayor o
         * menor que el número a adivinar.
         */

        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        int num;
        System.out.println("Welcome to the \"random numbers\" game \n");
        System.out.println("You have to guess, what is the random number? Are you ready?");
        while (true) {
            System.out.print("Enter the number: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num > randomNumber) {
                    System.out.println("the number entered is longer than the random number! Try again!");
                } else if (num < randomNumber) {
                    System.out.println("the number entered is smaller than the random number! Try again!");
                } else if (num == randomNumber) {
                    System.out.println("Congratulations, you have guessed the random hidden number.");
                    System.out.printf("Your number: %d, the random number: %d", num, randomNumber);
                    break;
                }
            } else {
                System.out.println("Error. You must enter an integer. \n");
                sc.next();
            }

        }
        sc.close();
    }
}
