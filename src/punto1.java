import java.util.Scanner;

public class punto1 {
    public static void main(String[] args) throws Exception {
        /*
         * 1. Realiza un programa que solicite al usuario dos números enteros y muestre
         * su suma, resta, multiplicación y división.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        sc.close();

        int addition = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int multiplying = firstNum * secondNum;
        int division = firstNum / secondNum;

        System.out.printf("The sum of the two numbers is = %d.%n", addition);
        System.out.printf("The subtraction of the two numbers is = %d.%n", subtraction);
        System.out.printf("The multiplication of the two numbers is = %d.%n", multiplying);
        System.out.printf("The division of the two numbers is = %d.%n", division);
    }
}
