import java.util.Scanner;

public class punto20 {
    public static void main(String[] args) {
        /*
         * 20.Realiza un programa que solicite al usuario una cadena y luego invierta su
         * orden
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String chain = sc.nextLine();
        System.out.printf("It is your text: %s \n", chain);
        System.out.println("This is its reverse text: " + reversedString(chain));
        sc.close();

    }

    public static String reversedString(String text) {
        int txt = text.length();
        StringBuilder chainReverse = new StringBuilder();
        for (int i = txt - 1; i >= 0; i--) {
            chainReverse.append(text.charAt(i));
        }
        return chainReverse.toString();
    }

}
